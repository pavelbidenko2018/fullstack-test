package com.pbidenko.fullstack.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
	
	@CrossOrigin(origins = "https://ifo-fullstack-test.herokuapp.com")
	@GetMapping(value = "/name")
	public @ResponseBody String getname() {
		return "Hello World";
	}

}
