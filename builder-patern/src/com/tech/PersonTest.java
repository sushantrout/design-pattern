package com.tech;

public class PersonTest {
	public static void main(String[] args) {
		Person.PersonBuilder builder = new Person.PersonBuilder("Sushant", "Rout", "Galadari", 26);
		Person build = builder.setColor("Black")
				.setFatherName("Jaggabandhu")
				.setMotherName("Anjana")
				.setHeight(5.7)
				.setWaight(60.0)
				.build();
		System.out.println(build);
	}
}
