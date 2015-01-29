package com.xinpan.designpattern.factory;

public class ChicagoPizzaStore extends AbstractPizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (IPizzaMenu.CHESSE.equals(type)) {
			pizza = new ChicagoCheesePizza();
		} else if (IPizzaMenu.PEPPERONI.equals(type)) {
			pizza = new ChicagoPepperoniPizza();
		} else if (IPizzaMenu.CLAM.equals(type)) {
			pizza = new ChicagoClamPizza();
		} else if (IPizzaMenu.VEGGIE.equals(type)) {
			pizza = new ChicagoVeggiePizza();
		}
		return pizza;
	}

}
