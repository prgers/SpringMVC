package com.prger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class ErrorController {

    @RequestMapping("/ioError")
    public void ioError() throws IOException {
        throw new IOException();
    }

    @RequestMapping("/error")
    public void error() {
        throw new RuntimeException();
    }

//    @ExceptionHandler({IOException.class})
//    public ModelAndView resolveException1(Exception ex) {
//        ModelAndView view = new ModelAndView();
//        view.setViewName("/WEB-INF/page/error/error.jsp");
//        return view;
//    }
//
//    @ExceptionHandler()
//    public ModelAndView resolveException2(Exception ex) {
//        ModelAndView view = new ModelAndView();
//        view.setViewName("/WEB-INF/page/error/default.jsp");
//        return view;
//    }
}
