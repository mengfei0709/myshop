package com.ht.my.shop.web.admin.service.impl;

import com.ht.my.shop.web.admin.dao.UserDao;
import com.ht.my.shop.domain.User;
import com.ht.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void sayHi() {
        System.out.println("Hi");
    }
    public User login(String email, String password) {
        return userDao.getUser(email,password);
    }
}
