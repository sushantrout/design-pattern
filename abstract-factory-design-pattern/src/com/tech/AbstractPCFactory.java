package com.tech;

public class AbstractPCFactory implements AbstractComputerFactory {

	String ram;
	String hdd;
	String cpu;

	boolean isGraphicsEnable;
	boolean isBlutouthEnable;

	public AbstractPCFactory(String ram, String hdd, String cpu, boolean isGraphicsEnable, boolean isBlutouthEnable) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnable = isGraphicsEnable;
		this.isBlutouthEnable = isBlutouthEnable;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu, isGraphicsEnable, isBlutouthEnable);
				
	}

}
