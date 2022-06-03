package com.r4m.microservice.limitsservice.dto;

public class LimitsDto {
	
	private Integer minimum;
	private Integer maximum;
	
	public LimitsDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public LimitsDto(Integer minimum, Integer maximum) {
		// TODO Auto-generated constructor stub
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	
	

}
