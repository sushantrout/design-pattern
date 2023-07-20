package com.example;

public class Warehouse implements Observer {
	public String location;
	@Override
	public void update(String location) {
		this.location = location;
		showLocation();
	}
	private void showLocation() {
		System.out.println("Location changes notify to " + this.getClass().getName() + this.location);
	}

}
