package com.xinpan.designpattern.factory.ext;

public class CheesePizza extends AbstractPizza {

	protected PizzaIngredientFactory factory;

	public CheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing....." + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
	}

}
