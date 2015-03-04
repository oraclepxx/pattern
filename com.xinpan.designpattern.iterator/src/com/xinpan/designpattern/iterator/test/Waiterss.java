package com.xinpan.designpattern.iterator.test;

import java.util.Iterator;

import com.xinpan.designpattern.iterator.IMenu;
import com.xinpan.designpattern.iterator.MenuItem;

public class Waiterss {
	
	protected IMenu breakfastMenu;
	protected IMenu dinnerMenu;

	public Waiterss(IMenu breakfastMenu, IMenu dinnerMenu) {
		this.breakfastMenu = breakfastMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		Iterator iter = breakfastMenu.createIterator();
		printMenu(iter);

		iter = dinnerMenu.createIterator();
		printMenu(iter);
	}

	public void printMenu(Iterator iter) {
		while (iter.hasNext()) {
			MenuItem item = (MenuItem) iter.next();
			System.out.println(item.getName() + "|" + item.getDesc() + "|"
					+ item.isVegetarian() + "|" + item.getPrice());
		}
	}

}
