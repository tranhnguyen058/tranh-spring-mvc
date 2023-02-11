package com.tranhjava.dao;

import java.util.List;

import com.tranhjava.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {

	List<NewModel> findAll();
}
	