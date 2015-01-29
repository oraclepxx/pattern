package com.xinpan.designpattern.factory.ext;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Cheese createCheese();

	public Clams createClams();

	public Sauce createSauce();

	public Veggies createVeggies();

	public Pepperoni createPepperoni();

}
