package com.kelab.info.experiment.info;

public class ExperimentHomeworkInfo {

    private Integer id;

    private Integer classId;

    private String title;

    private String content;

    private String attachName;

    private String attachUrl;

    private Integer type;

    private Long endTime;

    private Integer totalNum;

    private Integer postNum;

    // 自己的提交信息

    private ExperimentStudentHomeworkInfo submitInfo;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getPostNum() {
        return postNum;
    }

    public void setPostNum(Integer postNum) {
        this.postNum = postNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttachName() {
        return attachName;
    }

    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }

    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ExperimentStudentHomeworkInfo getSubmitInfo() {
        return submitInfo;
    }

    public void setSubmitInfo(ExperimentStudentHomeworkInfo submitInfo) {
        this.submitInfo = submitInfo;
    }
}
