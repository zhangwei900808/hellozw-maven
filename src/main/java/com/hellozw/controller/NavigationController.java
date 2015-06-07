package com.hellozw.controller;

import com.hellozw.model.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hellozw.service.ILinkService;

import java.util.List;

/**
 * Created by zhangwei on 2015/5/17.
 */
@Controller
public class NavigationController {
    @Autowired
    private ILinkService linkService;

    @RequestMapping("/navigation.html")
    public ModelAndView navigation(){
        List<Link> links = linkService.FindByNavId("1");
        return new ModelAndView("navigation/navigation");
    }
}
