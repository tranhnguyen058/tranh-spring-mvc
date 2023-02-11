	package com.tranhjava.service.impl;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tranhjava.converter.NewConverter;

import com.tranhjava.dto.NewDTO;
import com.tranhjava.entity.CategoryEntity;
import com.tranhjava.entity.NewEntity;
import com.tranhjava.repository.CategoryRepository;
import com.tranhjava.repository.NewRepository;
import com.tranhjava.service.INewService;
@Service
public class NewService implements INewService {

	
	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private NewConverter newConverter;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<NewDTO> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		List<NewDTO> models = new ArrayList<>();
		List<NewEntity> entities = newRepository.findAll(pageable).getContent();
		for(NewEntity item: entities) {
			NewDTO newDTO = newConverter.toDTO(item);
			models.add(newDTO);
		}
		return models;
	}


	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return (int) newRepository.count();
	}


	@Override
	public NewDTO findById(Long id) {
		NewEntity entity = newRepository.findOne(id);
		
		
		return newConverter.toDTO(entity);
	}


	@Override
	@Transactional
	public NewDTO save(NewDTO newDTO) {
		CategoryEntity category = categoryRepository.findOneByCode(newDTO.getCategoryCode());
		NewEntity newEntity = new NewEntity();
		if(newDTO.getId() != null) {
			NewEntity oldNew = newRepository.findOne(newDTO.getId());
			oldNew.setCategory(category);
			newEntity = newConverter.toEntity(oldNew, newDTO);
		} else {
			newEntity = newConverter.toEntity(newDTO);
			newEntity.setCategory(category);
		}
		return newConverter.toDTO(newRepository.save(newEntity));
	}


	@Override
	@Transactional
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		for(long id: ids) {
		newRepository.delete(id);
		}
	}




	

}
