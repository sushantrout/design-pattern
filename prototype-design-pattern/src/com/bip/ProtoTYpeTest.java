package com.bip;

public class ProtoTYpeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student stu = new Student();
		stu.setAge(13);
		stu.setName("Sushant");
		System.out.println(stu);
		
		Student clone = (Student)stu.clone();
		System.out.println(clone);
	}
}
