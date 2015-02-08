package com.xinpan.designpattern.command.device;

public class Light {

	private String type;

	public Light(String type) {
		this.type = type;
	}

	public void on() {
		System.out.println(type + " On");
	}

	public void off() {
		System.out.println(type + " Off");
	}

}
