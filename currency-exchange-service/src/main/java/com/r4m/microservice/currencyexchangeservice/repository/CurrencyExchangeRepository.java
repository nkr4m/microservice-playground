package com.r4m.microservice.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r4m.microservice.currencyexchangeservice.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Integer>{
	
	public CurrencyExchange findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);

}
