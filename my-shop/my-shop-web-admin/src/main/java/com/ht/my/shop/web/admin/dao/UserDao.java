package com.ht.my.shop.web.admin.dao;

import com.ht.my.shop.domain.User;

public interface UserDao {
    public User getUser(String email, String password);
}
