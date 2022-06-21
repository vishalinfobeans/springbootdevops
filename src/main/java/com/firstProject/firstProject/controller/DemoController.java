package com.firstProject.firstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/test")
	public String getDemoName() {
		return "Hello WOrld 3!";
	}
}
