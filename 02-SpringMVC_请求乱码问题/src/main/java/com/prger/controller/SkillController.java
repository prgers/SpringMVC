package com.prger.controller;

import com.prger.domain.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/skill")
public class SkillController {

//    @PostMapping("/add")
//    @ResponseBody
//    public String add(String name, String intro, @RequestParam(name = "my_level", required = false) Integer level) {
//        System.out.println(name);
//        System.out.println(intro);
//        System.out.println(level);
//        return "skill add success";
//    }

    @PostMapping("/add")
    @ResponseBody
    public String add(Skill skill) {
        System.out.println(skill);
        return "skill 添加成功!!!";
    }
}
