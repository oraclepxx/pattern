package com.xinpan.designpattern.observer.jdk;

import java.util.Observable;

public class WeatherData extends Observable {

	protected float temp;
	protected float humidity;
	protected float pressure;

	public WeatherData() {

	}

	public void dataChanged() {
		setChanged();
		notifyObservers();
	}

	public void setData(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		dataChanged();
	}

	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
