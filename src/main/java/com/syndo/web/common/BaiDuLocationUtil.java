package com.syndo.web.common;

import com.alibaba.fastjson.JSONObject;
import com.syndo.common.utils.DictUtils;
import com.syndo.common.utils.http.HttpUtils;
import com.syndo.project.zhzs.sjkshxt.domain.Location;
import com.syndo.project.zhzs.sjkshxt.domain.Result;
import com.syndo.project.zhzs.sjkshxt.domain.Root;

import java.util.HashMap;
import java.util.Map;

public class BaiDuLocationUtil {

    /*百度地图经纬度获取*/
    public static Map<String,Object> getJwd(String address){
        String lng = "";
        String lat = "";
        String apiUrl = DictUtils.getDictValue("baidu_map", "api_url");
        //https://api.map.baidu.com/geocoding/v3/?
        String ak = DictUtils.getDictValue("baidu_map", "ak");
        String param = "ak="+ak+"&output=json&address="+address;
        String s = HttpUtils.sendGet(apiUrl, param);
        Root root = JSONObject.parseObject(s, Root.class);
        if(null!= root && 0 == root.getStatus()){
            Result result = root.getResult();
            Location location = result.getLocation();
            double lat1 = location.getLat();
            double lng1 = location.getLng();
            lng = String.valueOf(lng1);
            lat = String.valueOf(lat1);
        }
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("lng",lng);
        map.put("lat",lat);
        return map;
    }
}
