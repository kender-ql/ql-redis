package com.ql.qlredis.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Service;

/**
 * @Author jiang.he
 * @Version 1.0.0 RELEASE
 * @Date 2021/3/5 9:35
 */
@Service
public class BaseServiceImpl implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BaseServiceImpl.applicationContext = applicationContext;
    }

    /**
     * 给client-output-buffer-limit配置pubsub的大小
     */
    private void initConfig(){
        RedisConnectionFactory bean = applicationContext.getBean(RedisConnectionFactory.class);
        RedisConnection connection = bean.getConnection();
        connection.setConfig("client-output-buffer-limit", "pubsub 0 0 240");
    }
}
