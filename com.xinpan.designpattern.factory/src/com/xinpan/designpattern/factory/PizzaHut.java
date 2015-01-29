package com.xinpan.designpattern.factory;

public class PizzaHut {
	
	public static void main(String[] args) {
		AbstractPizzaStore store = new NYPizzaStore();
		store.order(IPizzaMenu.CHESSE);
		store.order(IPizzaMenu.CLAM);
		
		store = new CaliforniaPizzaStore();
		store.order(IPizzaMenu.VEGGIE);
		
		store = new ChicagoPizzaStore();
		store.order(IPizzaMenu.PEPPERONI);
		
	}

}
