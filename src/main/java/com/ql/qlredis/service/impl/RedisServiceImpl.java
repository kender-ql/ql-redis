package com.ql.qlredis.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ql.qlredis.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author jiang.he
 * @Version 1.0.0 RELEASE
 * @Date 2020/7/11 20:12
 * @Description:
 */
@Service
public class RedisServiceImpl implements RedisService {

    private final Logger logger = LoggerFactory.getLogger(RedisServiceImpl.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @SuppressWarnings("unchecked")
    @Override
    public Boolean setMapValue(JSONObject param) {
        try {
            String key = (String) param.get("key");
            Map<String, Object> value =  (Map<String, Object>)param.get("value");
            ValueOperations<String, Object> vo = redisTemplate.opsForValue();
            vo.set(key, value);
//            redisTemplate.expire(key, 1, TimeUnit.HOURS); // 这里指的是1小时后失效
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Boolean setValue(JSONObject param) {
        try {
            String key = (String) param.get("key");
            Object value =  param.get("value");
            ValueOperations<String, Object> vo = redisTemplate.opsForValue();
            vo.set(key, value);
//            redisTemplate.expire(key, 1, TimeUnit.HOURS); // 这里指的是1小时后失效
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object getMapValue(JSONObject param) {
        String key = (String) param.get("key");
        ValueOperations<String, String> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object getValue(JSONObject param) {
        try {
            String key = param.get("key").toString();
            ValueOperations<String, String> vo = redisTemplate.opsForValue();
            return vo.get(key);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return null;
    }
}
