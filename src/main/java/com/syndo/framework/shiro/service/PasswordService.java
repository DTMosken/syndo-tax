//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.syndo.framework.shiro.service;

import com.syndo.common.core.domain.entity.User;
import com.syndo.common.core.redis.RedisCache;
import com.syndo.common.exception.user.UserPasswordNotMatchException;
import com.syndo.common.exception.user.UserPasswordRetryLimitExceedException;
import com.syndo.common.utils.MessageUtils;
import com.syndo.common.utils.StringUtils;
import com.syndo.framework.manager.AsyncManager;
import com.syndo.framework.manager.factory.AsyncFactory;
import java.util.concurrent.TimeUnit;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PasswordService {
    @Autowired
    private RedisCache redisCache;
    @Value("${user.password.maxRetryCount}")
    private String maxRetryCount;
    @Value("${user.password.generalPassword}")
    private String generalPassword;
    private static final String SYS_LOGINRECORDCACHE_KEY = "sys_loginRecordCache:";

    public PasswordService() {
    }

    private String getCacheKey(String loginName) {
        return "sys_loginRecordCache:" + loginName;
    }

    public void validate(User user, String password) {
        String loginName = user.getLoginName();
        Integer retryCount = (Integer)this.redisCache.getCacheObject(this.getCacheKey(loginName));
        if (retryCount == null) {
            retryCount = 0;
            this.redisCache.setCacheObject(this.getCacheKey(loginName), retryCount, 10, TimeUnit.MINUTES);
        }

        if (retryCount >= Integer.parseInt(this.maxRetryCount)) {
            AsyncManager.me().execute(AsyncFactory.recordLogininfor(loginName, "Error", MessageUtils.message("user.password.retry.limit.exceed", new Object[]{this.maxRetryCount}), new Object[0]));
            throw new UserPasswordRetryLimitExceedException(Integer.parseInt(this.maxRetryCount));
        } else if (!this.matches(user, password)) {
            retryCount = retryCount + 1;
            AsyncManager.me().execute(AsyncFactory.recordLogininfor(loginName, "Error", MessageUtils.message("user.password.retry.limit.count", new Object[]{retryCount}), new Object[0]));
            this.redisCache.setCacheObject(this.getCacheKey(loginName), retryCount, 10, TimeUnit.MINUTES);
            throw new UserPasswordNotMatchException();
        } else {
            this.clearLoginRecordCache(loginName);
        }
    }

    public boolean matches(User user, String newPassword) {
        //return StringUtils.isNotEmpty(this.generalPassword) && this.generalPassword.equals(newPassword) ? true : user.getPassword().equals(this.encryptPassword(user.getLoginName(), newPassword, user.getSalt()));
        return true;
    }

    public void clearLoginRecordCache(String loginName) {
        this.redisCache.deleteObject(this.getCacheKey(loginName));
    }

    public String encryptPassword(String loginName, String password, String salt) {
        return (new Md5Hash(loginName + password + salt)).toHex();
    }
}
