package com.kelab.info.experiment.info;

import java.util.List;

public class ExperimentGroupInfo {

    private Integer id;

    private Integer classId;

    private String name;

    private List<ExperimentStudentInfo> members;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExperimentStudentInfo> getMembers() {
        return members;
    }

    public void setMembers(List<ExperimentStudentInfo> members) {
        this.members = members;
    }
}
