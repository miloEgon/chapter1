package com.forezp.servicefeign.controller;

import com.forezp.servicefeign.service.HiService;
import com.forezp.servicefeign.service.SchedualServiceHi;
import com.forezp.servicefeign.service.SchedulaServiceRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    SchedualServiceHi service;

    @Resource
    SchedulaServiceRedis redisService;

    @Autowired
    HiService hiService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "forezp",required = false) String name) {
        return hiService.sayHi(name);
    }

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return service.SayHiFromClientOne(name);
    }

    @RequestMapping("/getUser")
    public Object getUser(@RequestParam Long id) {
        return redisService.getUser(id);
    }
}
