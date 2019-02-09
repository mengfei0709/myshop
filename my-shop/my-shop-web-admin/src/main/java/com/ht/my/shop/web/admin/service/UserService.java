package com.ht.my.shop.web.admin.service;

import com.ht.my.shop.domain.User;

public interface UserService {
    public User login(String email, String password);
    public void sayHi();
}
