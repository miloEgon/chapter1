package com.forezp.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String SayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
