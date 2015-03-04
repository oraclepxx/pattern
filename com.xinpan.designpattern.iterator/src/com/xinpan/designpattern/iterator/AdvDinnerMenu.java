package com.xinpan.designpattern.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class AdvDinnerMenu implements IMenu{
	
	protected MenuItem[] items;

	public AdvDinnerMenu(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public Iterator createIterator() {
		return Arrays.asList(items).iterator();
	}

}
