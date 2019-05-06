package com.forezp.servicehi2.endPoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyEndPoint
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/6 10:03
 * @Version 1.0.0
 **/
@Endpoint(id = "dean")
public class MyEndPoint {

    @ReadOperation
    public Map<String,String> test(){
        Map<String,String> result = new HashMap<>();
        result.put("name","david");
        result.put("age","18");
        return result;
    }
}
