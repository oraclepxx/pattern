package com.xinpan.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class AdvBreakfastMenu implements IMenu{

	protected List<MenuItem> menuList;

	public AdvBreakfastMenu(List<MenuItem> menuList) {
		this.menuList = menuList;
	}
	
	@Override
	public Iterator createIterator() {
		return menuList.iterator();
	}

}
