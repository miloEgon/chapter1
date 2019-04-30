package com.forezp.servicefeign.controller;

import com.forezp.servicefeign.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    SchedualServiceHi service;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return service.SayHiFromClientOne(name);
    }
}
