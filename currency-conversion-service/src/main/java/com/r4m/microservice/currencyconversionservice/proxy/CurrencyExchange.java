package com.r4m.microservice.currencyconversionservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.r4m.microservice.currencyconversionservice.dto.CurrencyConversionDto;

@FeignClient(name="currency-exchange", url="localhost:8001")
public interface CurrencyExchange {

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionDto fetchCurencyExchange(@PathVariable String from, @PathVariable String to);
}
