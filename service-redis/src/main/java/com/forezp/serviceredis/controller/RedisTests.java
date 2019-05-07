package com.forezp.serviceredis.controller;

import com.forezp.serviceredis.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @ClassName RedisTests
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/6 13:41
 * @Version 1.0.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTests {

    @Test
    public void contextLoads() {}

    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis() {

        Logger logger = Logger.getLogger("testRedis");

        logger.setLevel(Level.ALL);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINEST);
        logger.addHandler(consoleHandler);

        logger.severe("严重");
        logger.warning("警告");
        logger.info("信息");
        logger.config("配置");
        logger.fine("良好");
        logger.finer("较好");
        logger.finest("最好");

        redisDao.setKey("name","forezp");
        redisDao.setKey("age","17");
        logger.info(redisDao.getValue("name"));
        logger.info(redisDao.getValue("age"));
    }
}
