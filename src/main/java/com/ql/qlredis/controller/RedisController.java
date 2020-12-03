package com.ql.qlredis.controller;

import com.alibaba.fastjson.JSONObject;
import com.ql.qlredis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Boolean setMapValue(@RequestBody JSONObject param) {
        return redisService.setMapValue(param);
    }

    @ResponseBody
    @RequestMapping(value = "/setObjectValue", method = RequestMethod.POST)
    public Boolean setObjectValue(@RequestBody JSONObject param) {
        return redisService.setValue(param);
    }

    @ResponseBody
    @RequestMapping(value = "/getMapValue", method = RequestMethod.POST)
    public Object getMapValue(@RequestBody JSONObject param) {
        return redisService.getMapValue(param);
    }

    @ResponseBody
    @RequestMapping(value = "/getValue", method = RequestMethod.POST)
    public Object getValue(@RequestBody JSONObject param) {
        return redisService.getValue(param);
    }

}
