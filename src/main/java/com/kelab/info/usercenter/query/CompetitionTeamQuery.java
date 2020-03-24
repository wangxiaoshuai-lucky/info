package com.kelab.info.usercenter.query;

import com.kelab.info.base.query.BaseQuery;

public class CompetitionTeamQuery extends BaseQuery {

    /**
     * 比赛id
     */
    private Integer competitionId;

	public Integer getCompetitionId() {
		return competitionId;
	}

	public void setCompetitionId(Integer competitionId) {
		this.competitionId = competitionId;
	}
}