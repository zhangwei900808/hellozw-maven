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

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by zhangwei on 2015/10/8.
 */
@Controller
public class UserInfoController {

    @RequestMapping("/user/userinfo.html")
    public ModelAndView login() {
        return new ModelAndView("user/showInfo");
    }
}
