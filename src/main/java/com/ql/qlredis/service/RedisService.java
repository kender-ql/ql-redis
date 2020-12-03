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
    // 加入元素
    Boolean setMapValue(JSONObject param);

    // 加入元素
    Boolean setValue(JSONObject param);

    // 获取元素
    Object getMapValue(JSONObject param);

    // 获取元素
    Object getValue(JSONObject param);

}
