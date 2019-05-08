package com.forezp.servicefeign.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/7 15:29
 * @Version 1.0.0
 **/
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }

}
