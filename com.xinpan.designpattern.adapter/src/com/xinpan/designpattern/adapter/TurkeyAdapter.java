package com.xinpan.designpattern.adapter;

public class TurkeyAdapter implements Duck {

	protected Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.quack();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
