package com.bip;

public class Employee {
	private String firstName;
	private String lastName;
	private int age;
	private String department;
	private String position;
	private double salary;

	private Employee(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.department = builder.department;
		this.position = builder.position;
		this.salary = builder.salary;
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		private int age;
		private String department;
		private String position;
		private double salary;

		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder department(String department) {
			this.department = department;
			return this;
		}

		public Builder position(String position) {
			this.position = position;
			return this;
		}

		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", department="
				+ department + ", position=" + position + ", salary=" + salary + "]";
	}

}
