package com.xinpan.designpattern.iterator;

public class DinnerMenuIterator implements IMenuIterator {

	protected MenuItem[] items;
	protected int position = 0;

	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		MenuItem item = items[position];
		position++;
		return item;
	}

}
