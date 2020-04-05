package com.kelab.info.experiment.query;

import com.kelab.info.base.query.PageQuery;

public class ExperimentProblemQuery extends PageQuery {

    private Integer contestId;

    public Integer getContestId() {
        return contestId;
    }

    public void setContestId(Integer contestId) {
        this.contestId = contestId;
    }
}
