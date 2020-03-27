package com.kelab.info.problemcenter.info;

import java.util.Objects;

public class LevelProblemInfo {
    private Integer id;

    private Integer proId;

    private Integer levelId;

    private Integer grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LevelProblemInfo)) return false;
        LevelProblemInfo that = (LevelProblemInfo) o;
        return getProId().equals(that.getProId()) &&
                getLevelId().equals(that.getLevelId()) &&
                getGrade().equals(that.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProId(), getLevelId(), getGrade());
    }
}