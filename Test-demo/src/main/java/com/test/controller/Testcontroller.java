package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Employee;

@RestController
@RequestMapping("/api")
public class Testcontroller {
	@GetMapping("/test")
	public String test(@RequestParam String id) {
		
	if(id.equals("123")) {
		return "record Exist,Hello 123";
	}
		return "hello";

	}
	
	@PostMapping("/employee")
	public String employeTest(@RequestBody Employee e) {
		return "Employee name:"+e.geteName()+"  Employee Id:"+e.geteId();
		
	}
}
