package com.xinpan.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	protected List<Observer> observers;

	protected float temp;
	protected float humidity;
	protected float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		if (!observers.contains(o)) {
			observers.add(o);
		}
	}

	@Override
	public void unregisterObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(0);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(temp, humidity, pressure);
		}
	}

	public void dataChanged() {
		notifyObservers();
	}

	public void setData(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		dataChanged();
	}
	
}
