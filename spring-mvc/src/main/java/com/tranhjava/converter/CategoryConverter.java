package com.tranhjava.converter;

import org.springframework.stereotype.Component;

import com.tranhjava.dto.CategoryDTO;
import com.tranhjava.entity.CategoryEntity;
@Component
public class CategoryConverter {
	public CategoryDTO toDTO(CategoryEntity categoryEntity) {
		CategoryDTO result = new CategoryDTO();
		result.setId(categoryEntity.getId());
		result.setName(categoryEntity.getName());
		result.setCode(categoryEntity.getCode());
		return result;
	}
	public CategoryEntity toEntity(CategoryDTO categoryDTO) {
		CategoryEntity result = new CategoryEntity();
		result.setName(categoryDTO.getName());
		result.setCode(categoryDTO.getCode());
		return result;
	}
}
