package com.xinpan.designpattern.command.device;

public abstract class CeilingFan {

	public enum Speed {
		HIGH("High"), MEDIUM("Medium"), LOW("Low");

		private String type;

		Speed(String type) {
			this.type = type;
		}
	}
	
	private Speed speed;

	public CeilingFan(Speed speed) {
		this.speed = speed;
	}

	public abstract void on();

	public abstract void off();

}
