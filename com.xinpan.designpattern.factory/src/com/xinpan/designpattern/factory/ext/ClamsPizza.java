package com.xinpan.designpattern.factory.ext;

public class ClamsPizza extends AbstractPizza {

	protected PizzaIngredientFactory factory;

	public ClamsPizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing...." + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		clams = factory.createClams();
	}

}
