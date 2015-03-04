package com.xinpan.designpattern.iterator;

public class DinnerMenu {

	protected MenuItem[] items;

	public DinnerMenu(MenuItem[] items) {
		this.items = items;
	}

	public IMenuIterator createMenuIterator() {
		return new DinnerMenuIterator(items);
	}

}
