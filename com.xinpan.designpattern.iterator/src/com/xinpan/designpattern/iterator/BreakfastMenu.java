package com.xinpan.designpattern.iterator;

import java.util.List;

public class BreakfastMenu {

	protected List<MenuItem> menuList;

	public BreakfastMenu(List<MenuItem> menuList) {
		this.menuList = menuList;
	}

	public IMenuIterator createMenuIterator() {
		return new BreakfastMenuIterator(menuList);
	}

}
