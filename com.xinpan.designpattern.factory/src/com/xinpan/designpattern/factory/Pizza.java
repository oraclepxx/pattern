package com.xinpan.designpattern.factory;

public abstract class Pizza {

	protected String name;
	protected String dough;
	protected String sauce;

	public void prepare() {
		System.out.println("Preparing...." + name);
	}

	public void bake() {
		System.out.println("Baking...." + name);
	}

	public void cut() {
		System.out.println("Cutting...." + name);
	}

	public void box() {
		System.out.println("Boxing...." + name);
	}

	public String getName() {
		return name;
	}

}
