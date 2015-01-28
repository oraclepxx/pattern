package com.xinpan.designpattern.decorator;

public abstract class AbstractBeverage {

	String description = "Unknown";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
