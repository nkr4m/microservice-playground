package com.r4m.microservice.currencyexchangeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.r4m.microservice.currencyexchangeservice.dto.CurrencyExchangeDto;
import com.r4m.microservice.currencyexchangeservice.entity.CurrencyExchange;
import com.r4m.microservice.currencyexchangeservice.repository.CurrencyExchangeRepository;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService{

	@Autowired
	CurrencyExchangeRepository currExRepo;
	
	@Autowired
	Environment env;
	
	
	@Override
	public CurrencyExchangeDto fetchCurencyExchange(String from, String to) {
		CurrencyExchange curr = currExRepo.findByFromCurrencyAndToCurrency(from, to);
		
		CurrencyExchangeDto res = new CurrencyExchangeDto();
		res.setId(curr.getId());
		res.setFromCurrency(curr.getFromCurrency());
		res.setToCurrency(curr.getToCurrency());
		res.setConversionRate(curr.getConversionRate());
		res.setEnvironment(env.getProperty("local.server.port"));
		
		
		
		return res;
	}

}
