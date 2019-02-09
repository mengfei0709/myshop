package com.ht.my.shop.web.admin.service;

import com.ht.my.shop.domain.TbUser;

import java.util.List;

public interface TbUserService {

    /**
     * 查询全部用户信息
     * @return
     */
    public List<TbUser> selectAll();
}