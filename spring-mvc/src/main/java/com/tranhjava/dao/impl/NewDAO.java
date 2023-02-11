package com.tranhjava.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tranhjava.dao.INewDAO;
import com.tranhjava.mapper.NewMapper;
import com.tranhjava.model.NewModel;
@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	
	
	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}

}
