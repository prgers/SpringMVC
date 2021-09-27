package com.prger.resolver;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice(basePackages = "com.prger.controller")
public class ExceptionResolver {

    @ExceptionHandler
    public ModelAndView resolveException(Exception ex) {
        ModelAndView view = new ModelAndView();
        view.addObject("ex", ex);
        view.setViewName("WEB-INF/page/error/default.jsp");
        return view;
    }
}
