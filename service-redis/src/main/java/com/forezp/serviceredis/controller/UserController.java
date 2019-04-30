package com.forezp.serviceredis.controller;

import com.forezp.serviceredis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/4/30 18:07
 * @Version 1.0.0
 **/
@RestController
public class UserController {

    @Autowired
    private RedisTemplate<Serializable, Object> redisTemplate;

    private final HashOperations<Serializable, Object, Object> vo = redisTemplate.opsForHash();

    public User initUser() {
        User user1 = new User(1L,"milo","123456","张三","17718152603");
        return user1;
    }

    @RequestMapping("/setUser")
    public void setUserInfo() {
        User user = initUser();
        Map<String,Object> map = new HashMap<>();
        map.put("userName",user.getUserName());
        map.put("trueName",user.getTrueName());
        map.put("password",user.getPassword());
        map.put("phone",user.getPhone());
        vo.putAll(user.getId(),map);
    }

    @RequestMapping("/getUser")
    public Object getUserInfo(Long id) {
        return vo.entries(id);
    }

}
