package com.tech;

public class ComputerFactoryTest {
	public static void main(String[] args) {
		Computer computer = ComputerFactory.getComputer(CompouterType.LAPTO, "64 GB", "512 GB", "Intel I5", true,
				false);
		
		System.out.println(computer);
	}
}
