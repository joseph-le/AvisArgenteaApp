package com.avisargentea.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	public static final String HEALTHY = "HEALTHY!";
	
	@GetMapping("/health")
	public String health() {
		return HEALTHY;
	}

}
