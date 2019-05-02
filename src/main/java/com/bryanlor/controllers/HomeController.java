package com.bryanlor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bryanlor.clients.MinnesotaClient;

@RestController
public class HomeController {
	
	@Autowired
	MinnesotaClient minnesotaClient;
	
	@GetMapping("/")
	public String home() {
		return "This is the homepage.";
	}
	
	@GetMapping("/{id}")
	public String greeting(@PathVariable("id") Long id) {
		return "Hello #" + id + "! " + minnesotaClient.retrieveMinnesotaGreeting();
	}
}
