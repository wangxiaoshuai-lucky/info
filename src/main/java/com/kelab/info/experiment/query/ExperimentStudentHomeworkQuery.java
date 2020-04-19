package com.kelab.info.experiment.query;

import com.kelab.info.base.query.BaseQuery;

public class ExperimentStudentHomeworkQuery extends BaseQuery {

    private Integer homeworkId;

    private Integer targetId;

    private Boolean isComment;

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Boolean getComment() {
        return isComment;
    }

    public void setComment(Boolean comment) {
        isComment = comment;
    }
}
