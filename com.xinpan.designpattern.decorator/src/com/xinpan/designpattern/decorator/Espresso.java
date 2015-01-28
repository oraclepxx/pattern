package com.xinpan.designpattern.decorator;

public class Espresso extends AbstractBeverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
