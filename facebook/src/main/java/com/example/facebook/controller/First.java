package com.example.facebook.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
	@GetMapping("showEmp")
	public String view() {
		return "HELLO NAGASHREE";
	}
	@PostMapping("createProfile")
	public String create() {
		return "profile created";
	}
	
	@PutMapping("editProfile")
	public String edit() {
		return "profile edited";
	}
	
	@DeleteMapping("deleteProfile")
	public String delete() {
		return "profile deleted";
	}
}
