package com.hellozw.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by zhangwei on 2015/6/14.
 */
@Controller
public class AboutMeController {
    @RequestMapping("/aboutme.html")
    public ModelAndView navigation(){
        return new ModelAndView("aboutme/aboutme");
    }
}
