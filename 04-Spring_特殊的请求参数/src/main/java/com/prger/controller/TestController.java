package com.prger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.Map;

/**
 * Created by prgers on 2021/9/27 11:21 上午
 */
@Controller

public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestParam Map<String, Object> map) {
        System.out.println(map);
        return "test success!!";
    }

    @RequestMapping("/fileTest")
    @ResponseBody
    public String fileTest(MultipartFile photo) {
        String filename = photo.getOriginalFilename();
        return filename;
    }

    @RequestMapping("dateTest")
    @ResponseBody
    public String dateTest(Date date) {
        System.out.println(date);
        return "dateTest success!!";
    }

}
