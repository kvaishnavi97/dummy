package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SwaggerController {
	
	ConcurrentMap<Integer,String> names=new ConcurrentHashMap<>();
	
	
	
	@GetMapping(value="/getContacts")
	public List<String> getContacts() {
		return new ArrayList<String>(names.values());
		
	}
	
	@GetMapping(value="/getContact/{id}")
	public String getContact(@PathVariable String id) {
		return names.get(id);
		
	}
	
	@GetMapping(value="/addnames")
	public void  addnames() {
		names.put(30,"Vaishnavi");
		names.put(28, "Shubham");
		names.put(32, "Divya");
	}
	
	

}
