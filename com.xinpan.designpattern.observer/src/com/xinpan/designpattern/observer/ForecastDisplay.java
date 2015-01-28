package com.xinpan.designpattern.observer;

public class ForecastDisplay implements Observer, DisplayElement {

	protected float temp;
	protected float humidity;
	protected float pressure;

	protected WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Forecast Display:");
		System.out.println("The temperature: 85F");
		System.out.println("The humidity: 20");
		System.out.println("The pressure: 1.5P");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
