package com.avisargentea.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public static final String BASE_MESSAGE = "You found the base page! -Joe";
	public static final String HELLO_MESSAGE = "HEY! You found the hello page. Nice! -Joe";

	@GetMapping("/")
	public String base() {
		return BASE_MESSAGE;
	}

	@GetMapping("/hello")
	public String hello() {
		return HELLO_MESSAGE;
	}

}
