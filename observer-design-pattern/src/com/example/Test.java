package com.example;

public class Test {
	public static void main(String[] args) {
		DeliveryData topic = new DeliveryData();
		
		Observer o1 = new Seller();
		Observer o2 = new User();
		Observer o3 = new Warehouse();
		
		topic.register(o1);
		topic.register(o2);
		topic.register(o3);
		
		topic.locationChange();
	}
}
