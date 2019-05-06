package com.forezp.servicehi2;

import com.forezp.servicehi2.endPoint.MyEndPoint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHi2Application {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private Integer age;
    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(ServiceHi2Application.class, args);
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    @RequestMapping("/miYa")
    public String miYa() {
        return "I'm "+name+", My age is "+age;
    }

    @Configuration
    static class MyEndpointConfiguration{
        @Bean
        @ConditionalOnMissingBean
        @ConditionalOnEnabledEndpoint
        public MyEndPoint myEndPoint(){
            return new MyEndPoint();
        }
    }

}
