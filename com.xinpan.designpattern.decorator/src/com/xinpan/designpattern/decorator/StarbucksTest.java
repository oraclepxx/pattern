package com.xinpan.designpattern.decorator;

public class StarbucksTest {

	public static void main(String[] args) {
		Espresso espressp = new Espresso();
		System.out.println(espressp.getDescription() + ": " + espressp.cost());

		DarkRoast darkRoast = new DarkRoast();
		Mocha mocha = new Mocha(darkRoast);
		Mocha mocha2 = new Mocha(mocha);
		Whip whip = new Whip(mocha2);
		System.out.println(whip.getDescription() + ": " + whip.cost());

		HouseBlend houseBlend = new HouseBlend();
		Soy soy = new Soy(houseBlend);
		Mocha mocha3 = new Mocha(soy);
		Whip whip2 = new Whip(mocha3);
		System.out.println(whip2.getDescription() + ": " + whip2.cost());
	}

}
