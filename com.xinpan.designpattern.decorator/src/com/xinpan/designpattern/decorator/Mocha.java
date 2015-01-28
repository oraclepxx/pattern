package com.xinpan.designpattern.decorator;

public class Mocha extends AbstractCondiment {

	protected AbstractBeverage beverage;

	public Mocha(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.99;
	}

}
