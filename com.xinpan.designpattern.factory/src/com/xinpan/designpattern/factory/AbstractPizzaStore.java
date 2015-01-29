package com.xinpan.designpattern.factory;

public abstract class AbstractPizzaStore {
	
	Pizza pizza;
	
	public Pizza order(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);

}
