package com.xinpan.designpattern.command.device;

public class LivingRoomLight extends Light {

	@Override
	public void on() {
		System.out.println("Living Room light on");
	}

	@Override
	public void off() {
		System.out.println("Living Room light off");
	}

}
