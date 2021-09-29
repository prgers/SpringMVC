package com.prger.service.impl;

import com.prger.dao.JobDao;
import com.prger.domain.Job;
import com.prger.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by prgers on 2021/9/28 5:41 下午
 */

@Service
@Transactional
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao jobDao;

    @Override
    public boolean save(Job job) {
        return jobDao.save(job);
    }

    @Override
    public boolean remove(Integer id) {
        return jobDao.remove(id);
    }

    @Override
    public boolean update(Job job) {
        return jobDao.update(job);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Job> list() {
        return jobDao.list();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Job getJobById(Integer id) {
        return jobDao.getJobById(id);
    }
}
