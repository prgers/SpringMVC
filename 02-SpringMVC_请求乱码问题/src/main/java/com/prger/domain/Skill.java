package com.prger.domain;

public class Skill {

    private String id;
    private String name;
    private String intro;
    private Integer level;

    public Skill() {
    }

    public Skill(String name, String intro, Integer level) {
        this.name = name;
        this.intro = intro;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "domain{" +
                "name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                ", level=" + level +
                '}';
    }
}
