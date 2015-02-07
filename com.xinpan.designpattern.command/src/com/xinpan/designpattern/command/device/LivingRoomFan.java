package com.xinpan.designpattern.command.device;

public class LivingRoomFan extends CeilingFan {

	public LivingRoomFan(Speed speed) {
		super(speed);
	}

	@Override
	public void on() {
		System.out.println("Living Room Fan On");
	}

	@Override
	public void off() {
		System.out.println("Living Room Fan Off");
	}

}
