package com.forezp.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi,SchedulaServiceRedis {
    @Override
    public String SayHiFromClientOne(String name) {
        return "sorry"+name;
    }

    @Override
    public Object getUser(Long id) {
        return "sorry"+id;
    }
}
