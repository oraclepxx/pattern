package com.xinpan.designpattern.decorator;

public class Decaf extends AbstractBeverage {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
