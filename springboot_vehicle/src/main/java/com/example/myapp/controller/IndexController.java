package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String sayHello() {
		return "Hello and Welcome to the MYAPP application. You can INSERT new Vehicle by making a POST request to /api/vehicles/saveall (or) /api/vehicles/partial endpoint.";
	}
}
