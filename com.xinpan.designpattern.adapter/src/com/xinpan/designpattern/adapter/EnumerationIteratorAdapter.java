package com.xinpan.designpattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIteratorAdapter implements Iterator {

	protected Enumeration enumeration;

	public EnumerationIteratorAdapter(Enumeration enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
