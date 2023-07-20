package com.example;

import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Subject {

	public List<Observer> observers = new ArrayList<>();
	public String location;

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(location);
		}
	}

	public void locationChange() {
		location = getLocation();
		notifyObservers();
	}
	
	public String getLocation() {
		return "YPlace";
	}
}
