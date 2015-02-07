package com.xinpan.designpattern.command.device;

public class KitchenFan extends CeilingFan {

	private Speed speed;
	
	public KitchenFan(Speed speed) {
		super(speed);
		this.speed = speed;
	}

	@Override
	public void on() {
		System.out.println("Kitchen Fan On - " + speed.getSpeed());
	}

	@Override
	public void off() {
		System.out.println("Kitchen Fan Off");
	}

}
