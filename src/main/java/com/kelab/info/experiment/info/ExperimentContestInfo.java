package com.kelab.info.experiment.info;

import java.util.List;

public class ExperimentContestInfo {

    private Integer id;

    private String title;

    private Integer classId;

    private Long endTime;

    /**
     * acNum:ac数量
     * totalNum: 总题数
     */
    private Integer acNum;

    private Integer totalNum;

    List<ExperimentProblemInfo> problemInfos;

    public Integer getAcNum() {
        return acNum;
    }

    public void setAcNum(Integer acNum) {
        this.acNum = acNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public List<ExperimentProblemInfo> getProblemInfos() {
        return problemInfos;
    }

    public void setProblemInfos(List<ExperimentProblemInfo> problemInfos) {
        this.problemInfos = problemInfos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

}
