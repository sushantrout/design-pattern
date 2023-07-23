package com.tech;

public class AbstractLaptopFactory implements AbstractComputerFactory {

	String ram;
	String hdd;
	String cpu;

	boolean isGraphicsEnable;
	boolean isBlutouthEnable;

	public AbstractLaptopFactory(String ram, String hdd, String cpu, boolean isGraphicsEnable,
			boolean isBlutouthEnable) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnable = isGraphicsEnable;
		this.isBlutouthEnable = isBlutouthEnable;
	}

	@Override
	public Computer createComputer() {
		return new Laptop(ram, hdd, cpu, isGraphicsEnable, isBlutouthEnable);
	}

}
