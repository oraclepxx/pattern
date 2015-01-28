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
	}

}
