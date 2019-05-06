package com.forezp.servicehi2.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyHealthIndicator
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/6 9:34
 * @Version 1.0.0
 **/
@Component("my1")
public class MyHealthIndicator implements HealthIndicator {

    private static final String VERSION = "v1.0.0";

    @Override
    public Health health() {
        int code = 0;
        if(code != 0){
            Health.down().withDetail("code",code).withDetail("version",VERSION).build();
        }
        return Health.up().withDetail("code",code).withDetail("version",VERSION).up().build();
    }
}
