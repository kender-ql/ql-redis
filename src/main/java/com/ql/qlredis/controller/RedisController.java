package com.ql.qlredis.controller;

import com.ql.qlredis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author jiang.he
 * @Version 1.0.0 RELEASE
 * @Date 2020/12/2 21:53
 * @Description TODO
 */
@Controller
@RequestMapping("/ql/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @ResponseBody
    @RequestMapping(value = "/setMapValue", method = RequestMethod.POST)
    public Boolean setMapValue(String key, Map<String, Object> value) {
        return redisService.setValue(key, value);
    }

    @ResponseBody
    @RequestMapping(value = "/setStringValue", method = RequestMethod.POST)
    public Boolean setStringValue(@RequestBody Map<String, Object> param) {
        return redisService.setValue(param);
    }

    @ResponseBody
    @RequestMapping(value = "/setObjectValue", method = RequestMethod.POST)
    public Boolean setObjectValue(String key, Object value) {
        return redisService.setValue(key, value);
    }

    @ResponseBody
    @RequestMapping(value = "/getMapValue", method = RequestMethod.POST)
    public Object getMapValue(String key) {
        return redisService.getMapValue(key);
    }

    @ResponseBody
    @RequestMapping(value = "/getValue", method = RequestMethod.POST)
    public Object getValue(@RequestBody Map<String, Object> param) {
        return redisService.getValue(param);
    }

}
