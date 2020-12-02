package com.ql.qlredis.service.impl;

import com.ql.qlredis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;

/**
 * @Author jiang.he
 * @Version 1.0.0 RELEASE
 * @Date 2020/7/11 20:12
 * @Description:
 */
public class RedisServiceImpl implements RedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void setValue(String key, Map<String, Object> value) {
    }

    @Override
    public void setValue(String key, String value) {

    }

    @Override
    public void setValue(String key, Object value) {

    }

    @Override
    public Object getMapValue(String key) {
        return null;
    }

    @Override
    public Object getValue(String key) {
        return null;
    }
}
