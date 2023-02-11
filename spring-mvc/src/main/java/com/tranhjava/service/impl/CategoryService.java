package com.tranhjava.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranhjava.converter.CategoryConverter;
import com.tranhjava.dto.CategoryDTO;
import com.tranhjava.entity.CategoryEntity;
import com.tranhjava.repository.CategoryRepository;
import com.tranhjava.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryConverter categoryConverter;
	
	@Override
	public Map<String, String> findAll() {
		Map<String, String> result = new HashMap<>();
		List<CategoryEntity> entities = categoryRepository.findAll();
		for (CategoryEntity categoryEntity : entities) {
			result.put(categoryEntity.getCode(), categoryEntity.getName());
		}
		
		return result;
	}
}
