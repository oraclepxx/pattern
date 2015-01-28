package com.xinpan.designpattern.decorator;

public class HouseBlend extends AbstractBeverage {

	public HouseBlend() {
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
