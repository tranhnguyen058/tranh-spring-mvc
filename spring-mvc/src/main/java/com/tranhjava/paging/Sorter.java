package com.tranhjava.paging;

public class Sorter {
	private String sortName;
	private String sortBy;
	public Sorter(String sortName, String sortBy) {
		this.sortBy= sortBy;
		this.sortName = sortName;
	}
	public String getSortBy() {
		return sortBy;
	}
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
}
