package com.hellozw.controller;

import com.hellozw.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hellozw.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login.html")
    public ModelAndView login() {
        return new ModelAndView("login/login");
    }

    @RequestMapping("/submit.html")
    @ResponseBody
    public List getUser(String name, String password) {
        List<User> user = userService.getUser(name, password);
        return user;
    }
}
