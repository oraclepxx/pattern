package com.xinpan.designpattern.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumAdapter implements Enumeration {

	protected Iterator iterator;

	public IteratorEnumAdapter(Iterator iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}

}
