package com.forezp.servicejpa.service;

import com.forezp.servicejpa.dao.UserDao;
import com.forezp.servicejpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/6 11:51
 * @Version 1.0.0
 **/
@Service
public class UserService {

    @Autowired
    private UserDao dao;

    public User findUserByName(String username) {
        return dao.findByUsername(username);
    }

    public List<User> findAll() {
        return dao.findAll();
    }

    public User saveUser(User user) {
        return dao.save(user);
    }

//    public User findUserById(Long id) {
//        return dao.findOne(id);
//    }

    public User updateUser(User user) {
        return dao.saveAndFlush(user);
    }

//    public void deleteUser(long id) {
//        dao.delete(id);
//    }















}
