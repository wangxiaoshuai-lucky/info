package com.kelab.info.problemcenter.query;

import com.kelab.info.base.query.BaseQuery;

public class ProblemNoteQuery extends BaseQuery {

    private Integer userId;

    private Integer problemId;

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
}
