package com.xinpan.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

import com.xinpan.designpattern.observer.DisplayElement;

public class StatisticsDisplay implements Observer, DisplayElement {

	protected float temp;
	protected float humidity;
	protected float pressure;

	protected Observable obs;

	public StatisticsDisplay(Observable obs) {
		this.obs = obs;
		obs.addObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Statistics Display:");
		System.out.println(temp + "/" + humidity + "/" + pressure);
	}

	@Override
	public void update(Observable o, Object obj) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			this.temp = data.getTemp();
			this.humidity = data.getHumidity();
			this.pressure = data.getPressure();
			display();
		}

	}

}
