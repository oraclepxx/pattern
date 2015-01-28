package com.xinpan.designpattern.observer;

public class CurrentDisplay implements Observer, DisplayElement {
	
	protected float temp;
	protected float humidity;
	protected float pressure;
	
	protected Subject weatherData;

	public CurrentDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current Display: ");
		System.out.println("Temperature: " + temp);
		System.out.println("Humidity: " + humidity);
		System.out.println("Pressure: " + pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
