package com.r4m.microservice.currencyconversionservice.dto;

public class CurrencyConversionDto {
	
	private Integer id;
	private String fromCurrency;
	private String toCurrency;
	private Integer conversionRate;
	private Integer qty;
	private Integer totalAmount;
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
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String env) {
		this.environment = env;
	}
	
	

}
