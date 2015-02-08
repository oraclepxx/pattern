package com.xinpan.designpattern.command.device;

public abstract class CeilingFan {

	public enum Speed {
		HIGH("High"), MEDIUM("Medium"), LOW("Low");

		private String type;

		Speed(String type) {
			this.type = type;
		}

		public String getSpeed() {
			return type;
		}
	}

	private String type;
	private Speed speed;

	public CeilingFan(String type, Speed speed) {
		this.type = type;
		this.speed = speed;
	}

	public void high() {

	}

	public void medium() {

	}

	public void low() {

	}

	public void off() {

	}

	public Speed getSpeed() {
		return speed;
	}

}
