package com.prger.service;

import com.prger.domain.Job;

import java.util.List;

/**
 * Created by prgers on 2021/9/28 5:40 下午
 */
public interface JobService {

    boolean save(Job job);
    boolean remove(Integer id);
    boolean update(Job job);
    List<Job> list();
    Job getJobById(Integer id);
}
