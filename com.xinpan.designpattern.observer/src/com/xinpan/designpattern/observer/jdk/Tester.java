package com.xinpan.designpattern.observer.jdk;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		CurrentDisplay currentDisplay = new CurrentDisplay(data);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(data);
		
		data.setData(77.1f, 35f, 1.2f);
		data.setData(23.0f, 34f, 2.1f);
	}

}
