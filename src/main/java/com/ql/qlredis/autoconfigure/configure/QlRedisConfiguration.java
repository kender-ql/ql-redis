package com.ql.qlredis.autoconfigure.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * QlRedisConfiguration：项目的配置类
 * 1. 对项目中指定的Bean文件进行扫描
 *
 * @Author jiang.he
 * @Version 1.0.0 RELEASE
 * @Date 2020/7/11 20:12
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = {
        "com.ql.qlredis.controller",
        "com.ql.qlredis.service"})
public class QlRedisConfiguration{

    public QlRedisConfiguration(RedisConnectionFactory connectionFactory) {
        RedisConnection connection = connectionFactory.getConnection();
        connection.setConfig("client-output-buffer-limit", "pubsub 0 0 240");
    }

}
