package com.forezp.servicehi2;

import com.forezp.servicehi2.config.ConfigBean;
import com.forezp.servicehi2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LucyController
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/5 22:14
 * @Version 1.0.0
 **/
@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LucyController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/lucy")
    public String miya() {
        return configBean.getGreeting()+"-"+configBean.getName()+"-"
                +configBean.getUuid()+"-"+configBean.getMax();
    }

    @Autowired
    User user;

    @RequestMapping(value = "/user")
    public String user(){
        return user.getName()+"--"+user.getAge();
    }


}
