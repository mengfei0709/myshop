package com.ht.my.shop.web.admin.dao.impl;

import com.ht.my.shop.web.admin.dao.UserDao;
import com.ht.my.shop.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository//(value = "userDao")
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public User getUser(String email, String password) {

        logger.debug("调用 getUser(),email:{} password:{}",email,password);
        User user = null;
        if("admin@ht.com".equals(email)) {
            if("admin".equals(password)) {
                user = new User();
                user.setEmail(email);
                user.setUsername("ht");
                logger.info("成功获取\"{}\"的用户信息",user.getUsername());
            }else {
                logger.info("获取\"{}\"的用户信息失败",email);
            }
        } else {
            logger.info("获取\"{}\"的用户信息失败",email);
        }
        return user;
    }
}
