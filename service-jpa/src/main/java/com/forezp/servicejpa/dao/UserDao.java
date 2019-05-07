package com.forezp.servicejpa.dao;

import com.forezp.servicejpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author Cheham_Dean
 * @Date 2019/5/6 11:49
 * @Version 1.0.0
 **/
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);

    List<User> findAll();

    User save(User user);

//    User findOne(Long id);

    User saveAndFlush(User user);

//    void delete(Long id);

}
