package com.xinpan.designpattern.command.device;

public class Stereo {

	public enum StereoType {
		CD("CD"), DVD("DVD"), RADIO("Radio");

		private String type;

		StereoType(String type) {
			this.type = type;
		}

	}

	private StereoType type;

	public Stereo(StereoType stereoType) {
		this.type = stereoType;
	}

	public void on() {

	}

	public void off() {

	}
	
	public void setType(StereoType type){
		this.type = type;
	}

	public void setCD() {
		type = StereoType.CD;
	}

	public void setDVD() {
		type = StereoType.DVD;
	}

	public void setRadio() {
		type = StereoType.RADIO;
	}

}
