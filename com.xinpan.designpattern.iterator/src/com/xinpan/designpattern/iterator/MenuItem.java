package com.xinpan.designpattern.iterator;

public class MenuItem {

	protected String name;
	protected String desc;
	protected boolean isVegetarian;
	protected double price;

	public MenuItem(String name, String desc, boolean isVegetarian, double price) {
		this.name = name;
		this.desc = desc;
		this.isVegetarian = isVegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
