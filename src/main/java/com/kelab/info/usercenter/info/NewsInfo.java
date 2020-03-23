package com.kelab.info.usercenter.info;

public class NewsInfo {

    private Integer id;

    private String title;

    private String content;

    private String picUrl;

    private Long pubTime;

    private Integer viewNum;

    private UserInfo publishUserInfo;

    public NewsInfo() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Long getPubTime() {
        return pubTime;
    }

    public void setPubTime(Long pubTime) {
        this.pubTime = pubTime;
    }

    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public UserInfo getPublishUserInfo() {
        return publishUserInfo;
    }

    public void setPublishUserInfo(UserInfo publishUserInfo) {
        this.publishUserInfo = publishUserInfo;
    }
}