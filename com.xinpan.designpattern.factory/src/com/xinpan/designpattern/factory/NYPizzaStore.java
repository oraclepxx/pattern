package com.xinpan.designpattern.factory;

public class NYPizzaStore extends AbstractPizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (IPizzaMenu.CHESSE.equals(type)) {
			pizza = new NYCheesePizza();
		} else if (IPizzaMenu.PEPPERONI.equals(type)) {
			pizza = new NYPepperoniPizza();
		} else if (IPizzaMenu.CLAM.equals(type)) {
			pizza = new NYClamPizza();
		} else if (IPizzaMenu.VEGGIE.equals(type)) {
			pizza = new NYVeggiePizza();
		}
		return pizza;
	}

}
