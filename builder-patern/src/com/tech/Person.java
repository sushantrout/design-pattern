package com.tech;

public class Person {
	String firstname; // Mandatory Field
	String lastname; // Mandatory Field
	String fatherName;
	String motherName;
	String address; // Mandatory Field
	String color;
	double age; // Mandatory Field
	double waight;
	double height;

	private Person(PersonBuilder builder) {
		this.firstname = builder.firstname;
		this.lastname = builder.lastname;
		this.fatherName = builder.fatherName;
		this.motherName = builder.motherName;
		this.address = builder.address;
		this.color = builder.color;
		this.age = builder.age;
		this.waight = builder.waight;
		this.height = builder.height;
		
	}

	/**
	 * All the mandatory field should be the part of Builder class.
	 */

	static class PersonBuilder {

		String firstname; // Mandatory Field
		String lastname; // Mandatory Field
		String fatherName;
		String motherName;
		String address; // Mandatory Field
		String color;
		double age; // Mandatory Field
		double waight;
		double height;

		public PersonBuilder(String firstname, String lastname, String address, double age) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.age = age;
		}

		public PersonBuilder setFirstname(String firstname) {
			this.firstname = firstname;
			return this;
		}

		public PersonBuilder setLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public PersonBuilder setFatherName(String fatherName) {
			this.fatherName = fatherName;
			return this;
		}

		public PersonBuilder setMotherName(String motherName) {
			this.motherName = motherName;
			return this;
		}

		public PersonBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public PersonBuilder setColor(String color) {
			this.color = color;
			return this;
		}

		public PersonBuilder setAge(double age) {
			this.age = age;
			return this;
		}

		public PersonBuilder setWaight(double waight) {
			this.waight = waight;
			return this;
		}

		public PersonBuilder setHeight(double height) {
			this.height = height;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", address=" + address + ", color=" + color + ", age=" + age
				+ ", waight=" + waight + ", height=" + height + "]";
	}
	
}
