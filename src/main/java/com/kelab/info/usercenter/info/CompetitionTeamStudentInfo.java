package com.kelab.info.usercenter.info;

import java.util.ArrayList;
import java.util.List;

public class CompetitionTeamStudentInfo {

    /**
     * 团队
     */
    private CompetitionTeamInfo competitionTeam;
    /**
     * 成员
     */
    private List<CompetitionStudentInfo> members = new ArrayList<>();

    public CompetitionTeamInfo getCompetitionTeam() {
        return competitionTeam;
    }

    public void setCompetitionTeam(CompetitionTeamInfo competitionTeam) {
        this.competitionTeam = competitionTeam;
    }

    public List<CompetitionStudentInfo> getMembers() {
        return members;
    }

    public void setMembers(List<CompetitionStudentInfo> members) {
        this.members = members;
    }
}
