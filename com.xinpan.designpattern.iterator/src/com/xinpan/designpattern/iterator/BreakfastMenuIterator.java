package com.xinpan.designpattern.iterator;

import java.util.List;

public class BreakfastMenuIterator implements IMenuIterator {

	protected List<MenuItem> menuList;
	protected int index = 0;

	public BreakfastMenuIterator(List<MenuItem> menuList) {
		this.menuList = menuList;
	}

	@Override
	public boolean hasNext() {
		if (index >= menuList.size() || menuList.get(index) == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem item = menuList.get(index);
		index++;
		return item;
	}

}
