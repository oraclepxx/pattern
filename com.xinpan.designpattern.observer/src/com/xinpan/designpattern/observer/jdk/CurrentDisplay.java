package com.xinpan.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

import com.xinpan.designpattern.observer.DisplayElement;

public class CurrentDisplay implements Observer, DisplayElement {

	protected float temp;
	protected float humidity;
	protected float pressure;

	protected Observable obs;

	public CurrentDisplay(Observable obs) {
		this.obs = obs;
		obs.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Display:");
		System.out.println("Temperature: " + temp);
		System.out.println("Humidity: " + humidity);
		System.out.println("Pressure: " + pressure);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			this.temp = data.getTemp();
			this.humidity = data.getHumidity();
			this.pressure = data.getPressure();
			display();
		}
	}

}
