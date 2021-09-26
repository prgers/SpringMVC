package com.prger.controller;

import com.prger.domain.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/skill")
public class SkillController {

    @GetMapping("/get/{id}")
    @ResponseBody
    public Skill get(@PathVariable("id") Integer id) {
        Skill skill = new Skill("金钟罩", "刀枪不入", 100);
        skill.setId(id);
        return skill;
    }
}
