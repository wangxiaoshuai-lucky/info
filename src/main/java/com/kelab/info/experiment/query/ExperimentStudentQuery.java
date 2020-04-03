package com.kelab.info.experiment.query;

import com.kelab.info.base.query.BaseQuery;

public class ExperimentStudentQuery extends BaseQuery {

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
}
