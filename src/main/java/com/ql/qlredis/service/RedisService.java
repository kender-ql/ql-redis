package com.ql.qlredis.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @Author jiang.he
 * @Version 1.0.0 RELEASE
 * @Date 2020/7/11 20:12
 * @Description:
 */
public interface RedisService {
    Boolean setMapValue(JSONObject param);

    Boolean setValue(JSONObject param);

    Object getMapValue(JSONObject param);

    Object getValue(JSONObject param);

}
