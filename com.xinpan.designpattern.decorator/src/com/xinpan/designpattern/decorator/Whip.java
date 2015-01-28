package com.xinpan.designpattern.decorator;

public class Whip extends AbstractCondiment {

	protected AbstractBeverage beverage;

	public Whip(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.99 + beverage.cost();
	}

}
