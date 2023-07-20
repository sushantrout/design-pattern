package com.bip;

public class Student implements Cloneable {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = new Student();
		student.setAge(age);
		student.setName(name);
		return student;
	}
	
}
