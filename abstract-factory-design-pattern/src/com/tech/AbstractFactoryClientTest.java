package com.tech;

public class AbstractFactoryClientTest {
	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer(new AbstractPCFactory(null, null, null, false, false));
		System.out.println(computer);
	}
}
