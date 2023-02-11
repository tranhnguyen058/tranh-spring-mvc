package com.tranhjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tranhjava.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
