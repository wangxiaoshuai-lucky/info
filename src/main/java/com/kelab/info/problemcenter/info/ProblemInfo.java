package com.kelab.info.problemcenter.info;

import com.kelab.info.usercenter.info.UserInfo;

import java.util.List;

public class ProblemInfo {

    private Integer id;

    private String title;

    private String description;

    private String input;

    private String output;

    private String sampleInput;

    private String sampleOutput;

    private String hit;

    private Integer timeLimit;

    private Integer memoryLimit;

    private Boolean specialJudge;

    private String specialJudgeSource;

    private String frameSource;

    private Integer frameSourceCompilerId;

    private String source;

    private Integer status;

    private Integer creatorId;


    /**
     * 下面几个属性为查询整理属性
     */

    private Integer acNum;

    private Integer submitNum;

    private Integer userStatus;

    private Boolean userCollect;

    private List<ProblemTagsInfo> tagsInfos;

    private UserInfo creatorInfo;

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Boolean getUserCollect() {
        return userCollect;
    }

    public void setUserCollect(Boolean userCollect) {
        this.userCollect = userCollect;
    }

    public List<ProblemTagsInfo> getTagsInfos() {
        return tagsInfos;
    }

    public void setTagsInfos(List<ProblemTagsInfo> tagsInfos) {
        this.tagsInfos = tagsInfos;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getSampleInput() {
        return sampleInput;
    }

    public void setSampleInput(String sampleInput) {
        this.sampleInput = sampleInput;
    }

    public String getSampleOutput() {
        return sampleOutput;
    }

    public void setSampleOutput(String sampleOutput) {
        this.sampleOutput = sampleOutput;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public Integer getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Integer timeLimit) {
        this.timeLimit = timeLimit;
    }

    public Integer getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Integer memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public Boolean getSpecialJudge() {
        return specialJudge;
    }

    public void setSpecialJudge(Boolean specialJudge) {
        this.specialJudge = specialJudge;
    }

    public String getSpecialJudgeSource() {
        return specialJudgeSource;
    }

    public void setSpecialJudgeSource(String specialJudgeSource) {
        this.specialJudgeSource = specialJudgeSource;
    }

    public String getFrameSource() {
        return frameSource;
    }

    public void setFrameSource(String frameSource) {
        this.frameSource = frameSource;
    }

    public Integer getFrameSourceCompilerId() {
        return frameSourceCompilerId;
    }

    public void setFrameSourceCompilerId(Integer frameSourceCompilerId) {
        this.frameSourceCompilerId = frameSourceCompilerId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAcNum() {
        return acNum;
    }

    public void setAcNum(Integer acNum) {
        this.acNum = acNum;
    }

    public Integer getSubmitNum() {
        return submitNum;
    }

    public void setSubmitNum(Integer submitNum) {
        this.submitNum = submitNum;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public UserInfo getCreatorInfo() {
        return creatorInfo;
    }

    public void setCreatorInfo(UserInfo creatorInfo) {
        this.creatorInfo = creatorInfo;
    }
}
