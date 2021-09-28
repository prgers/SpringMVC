package com.prger.service.impl;

import com.prger.dao.JobDao;
import com.prger.domain.Job;
import com.prger.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by prgers on 2021/9/28 5:41 下午
 */

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao dao;

    @Override
    public boolean save(Job job) {
        return dao.save(job);
    }

    @Override
    public boolean remove(Integer id) {
        return dao.remove(id);
    }

    @Override
    public boolean update(Job job) {
        return dao.update(job);
    }

    @Override
    public List<Job> list() {
        return dao.list();
    }

    @Override
    public Job getJobById(Integer id) {
        return dao.getJobById(id);
    }
}
