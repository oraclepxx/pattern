package com.xinpan.designpattern.observer;

public class StatisticsDisplay implements Observer, DisplayElement {

	protected float temp;
	protected float humidity;
	protected float pressure;

	protected WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("StatisticsDisplay");
		System.out.println("The average temperature: " + temp / 2);
		System.out.println("The average humidity: " + (humidity + 20) / 3);
		System.out.println("The average pressure: " + (pressure + 30) / 5);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
