package com.prger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jsp")
public class JspController {

    @RequestMapping("/mv1")
    public ModelAndView jsp1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/jsp1.jsp");
        return modelAndView;
    }

    @RequestMapping("/mv2")
    public String jsp2(){
        return "/WEB-INF/page/jsp1.jsp";
    }
}
