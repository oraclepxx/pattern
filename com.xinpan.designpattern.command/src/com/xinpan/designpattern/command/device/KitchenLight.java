package com.xinpan.designpattern.command.device;

public class KitchenLight extends Light {

	@Override
	public void on() {
		System.out.println("Kitchen Light on");
	}

	@Override
	public void off() {
		System.out.println("Kitchen light off");
	}

}
