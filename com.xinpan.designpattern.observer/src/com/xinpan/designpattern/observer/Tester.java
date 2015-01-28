package com.xinpan.designpattern.observer;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		CurrentDisplay currentDisplay = new CurrentDisplay(data);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(data);
		ForecastDisplay forecastDisplay = new ForecastDisplay(data);
		
		data.setData(83.5f, 28.1f, 10.0f);
		
	}

}
