package com.xinpan.designpattern.factory;

public class CaliforniaPizzaStore extends AbstractPizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (IPizzaMenu.CHESSE.equals(type)) {
			pizza = new CaliforniaCheesePizza();
		} else if (IPizzaMenu.PEPPERONI.equals(type)) {
			pizza = new CaliforniaPepperoniPizza();
		} else if (IPizzaMenu.CLAM.equals(type)) {
			pizza = new CaliforniaClamPizza();
		} else if (IPizzaMenu.VEGGIE.equals(type)) {
			pizza = new CaliforniaVeggiePizza();
		}
		return pizza;
	}

}
