package com.prger.dao;

import com.prger.domain.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by prgers on 2021/9/28 5:38 下午
 */
public interface JobDao {

    @Insert("INSERT INTO job(name, duty) VALUES (#{name}, #{duty})")
    boolean save(Job job);

    @Delete("DELETE FROM job WHERE id = #{id}")
    boolean remove(Integer id);

    @Update("UPDATE job SET name = #{name}, duty = #{duty} WHERE id = #{id}")
    boolean update(Job job);

    @Select("SELECT * FROM job")
    List<Job> list();

    @Select("SELECT * FROM job WHERE id = #{id}")
    Job getJobById(Integer id);
}
