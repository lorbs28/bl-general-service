package com.bryanlor.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "minnesota-service")
public interface MinnesotaClient {

	@GetMapping("/greeting")
	public String retrieveMinnesotaGreeting();
	
}
