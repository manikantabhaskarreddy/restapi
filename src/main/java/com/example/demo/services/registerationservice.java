package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.registeration;
import com.example.demo.repository.registerationrepository;

@Service

public class registerationservice {
	
	@Autowired
	registerationrepository repo;
	
	public registeration insertion(registeration reg) {
		return repo.save(reg);
	}
	
	public Iterable<registeration> multiinsertion(List<registeration> reg) {
		return repo.saveAll(reg);
		
	}
	
	public List<registeration> multifetch(){
		return (List<registeration>) repo.findAll();
	}

	public Optional<registeration> fetch(int id) {
		return repo.findById(id);
	}
	
	public String delete(int id) {
		 repo.deleteById(id);
		 return "Successfully deleted "+id;
	}
	
	public registeration update(registeration reg) {
		return repo.save(reg);
	}
	
	
}
