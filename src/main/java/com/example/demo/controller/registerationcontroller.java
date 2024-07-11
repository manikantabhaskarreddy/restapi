package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.registeration;
import com.example.demo.services.registerationservice;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200")
public class registerationcontroller {
	
	@Autowired
	registerationservice service;
	
	@PostMapping("/adding")
	public registeration insertion(@RequestBody registeration reg) {
		return service.insertion(reg);
	}
	@PostMapping("/multiadd")
	public Iterable<registeration> multiinsertion(@RequestBody List<registeration> reg) {
		return service.multiinsertion(reg);
		
	}
	@GetMapping("/multifetching")
	public List<registeration> multifetch(){
		return service.multifetch();
		
	}
	@GetMapping("/singlefetching/{id}")
	public Optional<registeration> fetch(@PathVariable int id) {
		return service.fetch(id);
	}
	
	@DeleteMapping("/deleting/{id}")
	public String delete(@PathVariable int id) {
		return service.delete(id);
	}

}
