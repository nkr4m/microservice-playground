package com.r4m.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r4m.microservice.limitsservice.dto.LimitsDto;
import com.r4m.microservice.limitsservice.envConfig.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration config;
	
	
	@GetMapping("/limits")
	public LimitsDto fetchLimits() {
		LimitsDto res = new LimitsDto(config.getMin(), config.getMax());
		return res;
	}
	

}
