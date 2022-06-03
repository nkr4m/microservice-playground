package com.r4m.microservice.currencyexchangeservice.service;

import com.r4m.microservice.currencyexchangeservice.dto.CurrencyExchangeDto;


public interface CurrencyExchangeService {
	
	public CurrencyExchangeDto fetchCurencyExchange(String from, String to);

}
