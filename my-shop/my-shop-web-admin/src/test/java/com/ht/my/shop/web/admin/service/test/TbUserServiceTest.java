package com.ht.my.shop.web.admin.service.test;

import com.ht.my.shop.domain.TbUser;
import com.ht.my.shop.web.admin.dao.TbUserDao;
import com.ht.my.shop.web.admin.service.TbUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbUserServiceTest {

    @Autowired
    private TbUserDao tbUserDao;

    @Autowired
    private TbUserService tbUserService;

    @Test
    public void testSelectAll() {
        List<TbUser> tbUsers = tbUserDao.selectAll();
        for (TbUser tbUser : tbUsers) {
            System.out.println(tbUser.getUsername());
        }
    }

    @Test
    public void testInsert() {
        TbUser tbUser = new TbUser();
        tbUser.setEmail("admin@admin.com");
        tbUser.setPassword("admin");
        tbUser.setPhone("15888888888");
        tbUser.setUsername("Lusifer");
        tbUser.setCreated(new Date());
        tbUser.setUpdate(new Date());

        tbUserDao.insert(tbUser);
    }

    @Test
    public void testDelete() {
        TbUser tbUser = new TbUser();
        tbUser.setId(2L);

        tbUserDao.delete(tbUser);
    }

    @Test
    public void testGetById() {
        TbUser tbUser = tbUserDao.getById(3L);
        System.out.println(tbUser.getUsername());
    }

    @Test
    public void testUpdate() {
        TbUser tbUser = tbUserDao.getById(3L);
        tbUser.setUsername("张三");

        tbUserDao.update(tbUser);
    }
    @Test
    public void testSelectByName() {
        List<TbUser> tbUsers = tbUserDao.selectByName("");
        for (TbUser tbUser : tbUsers) {
            System.out.println(tbUser.getUsername());
        }
    }

}