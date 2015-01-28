package com.xinpan.designpattern.decorator;

public class Soy extends AbstractCondiment {

	protected AbstractBeverage beverage;

	public Soy(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.99 + beverage.cost();
	}

}
