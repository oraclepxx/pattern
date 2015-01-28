package com.xinpan.designpattern.decorator;

public class DarkRoast extends AbstractBeverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
