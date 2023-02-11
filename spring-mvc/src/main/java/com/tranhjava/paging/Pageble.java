package com.tranhjava.paging;



public interface Pageble {
	Integer getPage();
	Integer	getOffset();
	Integer getLimit();
	Sorter getSorter();
}
