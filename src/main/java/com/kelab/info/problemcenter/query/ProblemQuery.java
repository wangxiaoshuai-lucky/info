package com.kelab.info.problemcenter.query;

import com.kelab.info.base.query.BaseQuery;

public class ProblemQuery extends BaseQuery {

    private String title;

    private String source;

    private String tagsName;

    /**
     * 默认不用根据 title 或者 difficult 排序
     */
    private boolean orderByTitle = false;

    private boolean orderByDifficult = false;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName;
    }

    public boolean isOrderByTitle() {
        return orderByTitle;
    }

    public void setOrderByTitle(boolean orderByTitle) {
        this.orderByTitle = orderByTitle;
    }

    public boolean isOrderByDifficult() {
        return orderByDifficult;
    }

    public void setOrderByDifficult(boolean orderByDifficult) {
        this.orderByDifficult = orderByDifficult;
    }
}
