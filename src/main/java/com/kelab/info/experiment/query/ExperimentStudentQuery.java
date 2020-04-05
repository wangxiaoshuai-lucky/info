package com.kelab.info.experiment.query;

import com.kelab.info.base.query.PageQuery;

public class ExperimentStudentQuery extends PageQuery {

    /**
     * 通过userId 查询加入的班级
     */
    private Integer userId;


    /**
     * 通过 classId、status 查询关联的所有学生
     */
    private Integer classId;

    private Integer status;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
