package com.prger.dao;

import com.prger.domain.Job;

import java.util.List;

/**
 * Created by prgers on 2021/9/28 5:38 下午
 */
public interface JobDao {

    boolean save(Job job);
    boolean remove(Integer id);
    boolean update(Job job);

    List<Job> list();
    Job getJobById(Integer id);
}
