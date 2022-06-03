package com.r4m.microservice.currencyexchangeservice.dto;

public class CurrencyExchangeDto {
	
	private Integer id;
	private String fromCurrency;
	private String toCurrency;
	private Integer conversionRate;
	private String environment;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public Integer getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(Integer conversionRate) {
		this.conversionRate = conversionRate;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

}
