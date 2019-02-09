package com.ht.my.shop.web.admin.dao;

import com.ht.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUserDao {

    /**
     * 查询全部用户信息
     * @return
     */
    public List<TbUser> selectAll();

    /**
     * 新增
     */
    void insert(TbUser tbUser);

    /**
     * 删除
     */
    void delete(TbUser tbUser);

    /**
     * 根据ID查询用户信息
     * @return
     */
    TbUser getById(Long id);

    /**
     * 更新
     */
    void update(TbUser tbUser);

    /**
     * 模糊查询
     * @return
     */
    public List<TbUser> selectByName(String username);

}