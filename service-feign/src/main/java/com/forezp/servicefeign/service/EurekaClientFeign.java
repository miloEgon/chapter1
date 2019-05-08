package com.forezp.servicefeign.service;

import com.forezp.servicefeign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName EurekaClientFeign
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/7 15:27
 * @Version 1.0.0
 **/
@FeignClient(value = "service-hi", configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
