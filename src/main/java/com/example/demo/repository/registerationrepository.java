package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.registeration;

@Repository
public interface registerationrepository extends CrudRepository<registeration, Integer>{
		
	
}
