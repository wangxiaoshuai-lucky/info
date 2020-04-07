package com.kelab.info.experiment.info;

import com.kelab.info.usercenter.info.UserInfo;

public class ExperimentStudentInfo {

    private Integer id;

    private Integer userId;

    private Integer classId;

    private Integer groupId;

    private Integer status;

    private UserInfo studentInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UserInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(UserInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
