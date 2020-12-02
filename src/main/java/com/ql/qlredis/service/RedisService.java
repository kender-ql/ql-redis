package com.ql.qlredis.service;

import java.util.Map;

/**
 * @Author jiang.he
 * @Version 1.0.0 RELEASE
 * @Date 2020/7/11 20:12
 * @Description:
 */
public interface RedisService {
    // 加入元素
    Boolean setValue(String key, Map<String, Object> value);

    // 加入元素
    Boolean setValue(Map<String, Object> param);

    // 加入元素
    Boolean setValue(String key, Object value);

    // 获取元素
    Object getMapValue(String key);

    // 获取元素
    Object getValue(Map<String, Object> param);

}
