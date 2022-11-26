package com.ql.qlredis;

import com.alibaba.fastjson.JSONObject;
import com.ql.qlredis.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class QlRedisApplicationTests {

    @Autowired
    private RedisService redisService;

    @Test
    public void addValue() {
        JSONObject param = new JSONObject();
        param.put("key", "hj");
        Map<String, Object> map = new HashMap<>(2);
        map.put("age", 26);
        map.put("agec", "cscas");
        param.put("value", map);
        redisService.setMapValue(param);
    }

    @Test
    public void getValue(){
        JSONObject param = new JSONObject();
        param.put("key", "hj");
        Object mapValue = redisService.getMapValue(param);
        System.out.println(mapValue);
    }

}
