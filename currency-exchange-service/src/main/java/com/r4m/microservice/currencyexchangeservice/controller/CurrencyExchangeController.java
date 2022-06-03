package com.r4m.microservice.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r4m.microservice.currencyexchangeservice.dto.CurrencyExchangeDto;
import com.r4m.microservice.currencyexchangeservice.service.CurrencyExchangeService;

@RestController
@RequestMapping("currency-exchange")
public class CurrencyExchangeController {
	
	@Autowired
	CurrencyExchangeService currService;
	
//	test - http://localhost:8001/currency-exchange/from/USD/to/INR
	@GetMapping("/from/{from}/to/{to}")
	public CurrencyExchangeDto fetchCurencyExchange(@PathVariable String from, @PathVariable String to) {
		CurrencyExchangeDto res = currService.fetchCurencyExchange(from, to);
		return res;
	}
	

}
