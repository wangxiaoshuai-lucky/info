package com.kelab.info.problemcenter.info;

import com.kelab.info.base.query.BaseQuery;

public class ProblemSubmitRecordQuery extends BaseQuery {

    private Integer userId;

    private Integer problemId;

    private Integer status;

    private Integer compilerId;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCompilerId() {
        return compilerId;
    }

    public void setCompilerId(Integer compilerId) {
        this.compilerId = compilerId;
    }
}
