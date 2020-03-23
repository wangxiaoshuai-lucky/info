package com.kelab.info.usercenter.query;

import com.kelab.info.base.query.BaseQuery;

public class NewsQuery extends BaseQuery {

	private String title;

	private boolean isTitleLike = true;

	public NewsQuery() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isTitleLike() {
		return isTitleLike;
	}

	public void setTitleLike(boolean titleLike) {
		isTitleLike = titleLike;
	}
}