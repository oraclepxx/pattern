package com.xinpan.designpattern.iterator.test;

import com.xinpan.designpattern.iterator.BreakfastMenu;
import com.xinpan.designpattern.iterator.DinnerMenu;
import com.xinpan.designpattern.iterator.IMenuIterator;
import com.xinpan.designpattern.iterator.MenuItem;

public class Waiter {

	protected BreakfastMenu breakfastMenu;
	protected DinnerMenu dinnerMenu;

	public Waiter(BreakfastMenu breakfastMenu, DinnerMenu dinnerMenu) {
		this.breakfastMenu = breakfastMenu;
		this.dinnerMenu = dinnerMenu;
	}

	public void printMenu() {
		IMenuIterator iter = breakfastMenu.createMenuIterator();
		printMenu(iter);

		iter = dinnerMenu.createMenuIterator();
		printMenu(iter);
	}

	public void printMenu(IMenuIterator iter) {
		while (iter.hasNext()) {
			MenuItem item = (MenuItem) iter.next();
			System.out.println(item.getName() + "|" + item.getDesc() + "|"
					+ item.isVegetarian() + "|" + item.getPrice());
		}
	}

}
