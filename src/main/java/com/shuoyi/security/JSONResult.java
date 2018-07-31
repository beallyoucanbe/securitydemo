package com.shuoyi.security;


import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhaosy-c on 2018/7/30.
 */
public class JSONResult {

    public static String fillResultString(Integer status, String message, Object result){
        JSONObject jsonObject = new JSONObject(){{
            put("status", status);
            put("message", message);
            put("result", result);
        }};
        return jsonObject.toString();
    }

}
