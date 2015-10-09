package com.hellozw.controller;

import com.hellozw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zhangwei on 2015/7/1.
 */
@Controller
public class MainController {

    @Autowired
    private IUserService userService;

    /**
     * 首页页面
     */
    @RequestMapping("/")
    public String index(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "main/index";
        } else {
            return "/main/main";
        }
    }

    @RequestMapping("/main/main.html")
    public String main(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "main/index";
        } else {
            return "/main/main";
        }
    }

    /**
     * 注册
     *
     * @param username
     * @param email
     * @param password
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping("/region.html")
    public ModelAndView region(String username, String email, String password, HttpSession session) throws Exception {
        Object sessionuser = session.getAttribute("user");
        if (sessionuser != null) {
            return new ModelAndView("redirect:/main/main.html");
        }
        boolean data = userService.sendEmail(username, email, password);
        if (data) {
            //设置session
            session.setAttribute("user", username);
            return new ModelAndView("redirect:/main/main.html");
        } else {
            //邮件发送失败
            return new ModelAndView("redirect:/");
        }
    }

    /**
     * 验证邮箱
     *
     * @return
     */
    @RequestMapping("/validate/validateEmail.html")
    public ModelAndView validateEmail(HttpServletRequest request) {
        ModelAndView view = new ModelAndView("validate/validateEmail");
        String activecode = request.getParameter("activecode");
        boolean data = userService.validateEmail(activecode);
        if (data) {
            view.addObject("message", "验证成功，正在跳转中...");
        } else {
            view.addObject("message", "验证失败，正在跳转中...");
        }
        return view;
    }
}
