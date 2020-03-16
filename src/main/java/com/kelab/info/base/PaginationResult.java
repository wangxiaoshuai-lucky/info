package com.kelab.info.base;

import java.util.List;

public class PaginationResult<T> {
    private List<T> pagingList;
    private Integer total;

    public PaginationResult() {
    }

    public List<T> getPagingList() {
        return pagingList;
    }

    public void setPagingList(List<T> pagingList) {
        this.pagingList = pagingList;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
