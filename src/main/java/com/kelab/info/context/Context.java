package com.kelab.info.context;

public class Context {

    private String logId;

    private Integer operatorId;

    private Integer operatorRoleId;

    private Long freshExp;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getOperatorRoleId() {
        return operatorRoleId;
    }

    public void setOperatorRoleId(Integer operatorRoleId) {
        this.operatorRoleId = operatorRoleId;
    }

    public Long getFreshExp() {
        return freshExp;
    }

    public void setFreshExp(Long freshExp) {
        this.freshExp = freshExp;
    }
}
