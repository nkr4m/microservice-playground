package com.r4m.microservice.currencyconversionservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.r4m.microservice.currencyconversionservice.dto.CurrencyConversionDto;

@RestController
@RequestMapping("currency-conversion")
public class CurrencyConversionController {
	
//	test - http://localhost:8100/currency-conversion/from/USD/to/INR/qty/10
	@GetMapping("from/{from}/to/{to}/qty/{qty}")
	public CurrencyConversionDto getConversion(@PathVariable String from, @PathVariable String to, @PathVariable Integer qty) {
		
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CurrencyConversionDto> res = restTemplate.getForEntity("http://localhost:8001/currency-exchange/from/" + from + "/to/" + to, CurrencyConversionDto.class);
		CurrencyConversionDto res1 = res.getBody();
		res1.setQty(qty);
		res1.setTotalAmount(res1.getConversionRate() * qty);
		
		
		return res1;
	}

}
