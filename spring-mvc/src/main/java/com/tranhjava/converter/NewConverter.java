package com.tranhjava.converter;

import javax.persistence.EntityListeners;

import org.springframework.stereotype.Component;

import com.tranhjava.dto.NewDTO;
import com.tranhjava.entity.NewEntity;

@Component
public class NewConverter {
	public NewDTO toDTO(NewEntity newEntity) {
		NewDTO result = new NewDTO();
		result.setId(newEntity.getId());
		result.setTitle(newEntity.getTitle());
		result.setShortDescription(newEntity.getShortDescription());
		result.setContent(newEntity.getContent());
		result.setThumbnail(newEntity.getThumbnail());
		result.setCategoryCode(newEntity.getCategory().getCode());
		return result;
	}
	public NewEntity toEntity(NewDTO newDTO) {
		NewEntity result = new NewEntity();
		result.setTitle(newDTO.getTitle());
		result.setShortDescription(newDTO.getShortDescription());
		result.setContent(newDTO.getContent());
		result.setThumbnail(newDTO.getThumbnail());
		return result;
	}
	public NewEntity toEntity(NewEntity result,NewDTO newDTO) {
		result.setTitle(newDTO.getTitle());
		result.setShortDescription(newDTO.getShortDescription());
		result.setContent(newDTO.getContent());
		result.setThumbnail(newDTO.getThumbnail());
		return result;
	}
}
