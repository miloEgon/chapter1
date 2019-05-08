package com.forezp.servicefeign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName HiService
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/7 15:34
 * @Version 1.0.0
 **/
@Service
public class HiService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }

}
