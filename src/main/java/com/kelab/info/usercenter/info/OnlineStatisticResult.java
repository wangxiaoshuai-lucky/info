package com.kelab.info.usercenter.info;

public class OnlineStatisticResult {

    /**
     * 日期 月-日
     */
    private String time;

    /**
     * 某天的所有用户的所有登录次数
     */
    private Integer totalLogin = 0;

    /**
     * 某天的所有ac量
     */
    private Integer submitAc = 0;

    /**
     * 某天的所有提交量
     */
    private Integer submitAll = 0;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getTotalLogin() {
        return totalLogin;
    }

    public void setTotalLogin(Integer totalLogin) {
        this.totalLogin = totalLogin;
    }

    public Integer getSubmitAc() {
        return submitAc;
    }

    public void setSubmitAc(Integer submitAc) {
        this.submitAc = submitAc;
    }

    public Integer getSubmitAll() {
        return submitAll;
    }

    public void setSubmitAll(Integer submitAll) {
        this.submitAll = submitAll;
    }
}
