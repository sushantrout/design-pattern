package com.tech;

public class ComputerFactory {
	private ComputerFactory() {
	}

	public static Computer getComputer(CompouterType type, String ram, String hdd, String cpu, boolean isGraphicsEnable,
			boolean isBlutouthEnable) {
		switch (type) {
			case PC: {
				return new PC(ram, hdd, cpu, isGraphicsEnable, isBlutouthEnable);
			}
			case LAPTO: {
				return new Laptop(ram, hdd, cpu, isGraphicsEnable, isBlutouthEnable);
			}
			default: {
				return null;
			}
		}
	}
}
