package com.tranhjava.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.tranhjava.dto.NewDTO;


public interface INewService {

	List<NewDTO> findAll(Pageable pageable);
	int getTotalItem();
	NewDTO findById(Long id);
	NewDTO save(NewDTO newDTO);
	void delete(long[] ids);
	

	
}
