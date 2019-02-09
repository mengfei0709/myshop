package com.ht.my.shop.web.admin.web.controller;

import com.ht.my.shop.commons.constant.ConstantUtils;
import com.ht.my.shop.domain.User;
import com.ht.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"","login"}, method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam(required = true) String email, @RequestParam(required = true)String password, HttpServletRequest httpServletRequest) {
        User user = userService.login(email,password);

        if(user == null) {
            return login();
        }
        else {
            //将登陆信息放进会话
            httpServletRequest.getSession().setAttribute(ConstantUtils.SESSION_USER,user);
            return "redirect:/main";
        }

    }
}
