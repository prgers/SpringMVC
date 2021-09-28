package com.prger.controller;

import com.prger.domain.Job;
import com.prger.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by prgers on 2021/9/28 5:44 下午
 */
@Controller
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("/list")
    @ResponseBody
    public List<Job> list() {
        return service.list();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public Job getByid(@PathVariable("id") Integer id) {
        return service.getJobById(id);
    }

    @PostMapping("/save")
    @ResponseBody
    public String save(Job job) {
        return service.save(job) ? "保存成功" : "保存失败";
    }

    @PostMapping("/remove")
    @ResponseBody
    public String remove(Integer id) {
        return service.remove(id) ? "删除成功" : "删除失败";
    }

    @PostMapping("/update")
    @ResponseBody
    public String update(Job job) {
        return service.update(job) ? "更新成功" : "更新失败";
    }
}
