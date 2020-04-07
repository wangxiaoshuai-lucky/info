package com.kelab.info.problemcenter.info;

/**
 * 用于实验平台拉取以前的做题信息
 */
public class ProblemUserMarkInnerInfo {

    private Integer userId;

    private Integer problemId;

    private String title;

    private Long markTime;

    private Integer submitId;

    private ProblemSubmitRecordInfo submitRef;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getMarkTime() {
        return markTime;
    }

    public void setMarkTime(Long markTime) {
        this.markTime = markTime;
    }

    public Integer getSubmitId() {
        return submitId;
    }

    public void setSubmitId(Integer submitId) {
        this.submitId = submitId;
    }

    public ProblemSubmitRecordInfo getSubmitRef() {
        return submitRef;
    }

    public void setSubmitRef(ProblemSubmitRecordInfo submitRef) {
        this.submitRef = submitRef;
    }
}
