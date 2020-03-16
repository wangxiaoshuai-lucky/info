package com.kelab.info.base.query.base;

import java.util.ArrayList;
import java.util.List;

public class BaseQuery extends PageQuery {

    private List<Integer> ids;

    private Integer id;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(String ids) {
        String[] strIds = ids.split(",");
        this.ids = new ArrayList<>(strIds.length);
        for (String str : strIds) {
            this.ids.add(Integer.parseInt(str));
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
