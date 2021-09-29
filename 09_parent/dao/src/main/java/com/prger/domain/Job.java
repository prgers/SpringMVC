package com.prger.domain;

/**
 * Created by prgers on 2021/9/28 5:37 下午
 */
public class Job {

    private Integer id;
    private String name;
    private String duty;

    public Job() {
    }

    public Job(String name, String duty) {
        this.name = name;
        this.duty = duty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duty='" + duty + '\'' +
                '}';
    }
}
