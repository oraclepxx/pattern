package com.xinpan.designpattern.factory.ext;

public abstract class AbstractPizza {

	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	Clams clams;
	Veggies vieegs;
	Pepperoni pepperoni;

	public abstract void prepare();

	public void bake() {

	}

	public void cut() {

	}

	public void box() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
