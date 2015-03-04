package com.xinpan.designpattern.algorithm;

public abstract class Caffeine {

	// final - to avoid subclass change its behavior
	// template method
	public final void prepare() {
		boilWater();
		brew(); // required
		pourInCup();
		addCondiments(); // required
		hook(); // optional

	}

	abstract void brew();

	abstract void addCondiments();

	public void boilWater() {

	}

	public void pourInCup() {

	}
	
	public void hook(){
		
	}

}
