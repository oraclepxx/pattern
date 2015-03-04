package com.xinpan.designpattern.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CoffeeMenu implements IMenu {

	protected Hashtable menus;

	public CoffeeMenu(Hashtable menus) {
		this.menus = menus;
	}

	@Override
	public Iterator createIterator() {
		return menus.values().iterator();
	}

}
