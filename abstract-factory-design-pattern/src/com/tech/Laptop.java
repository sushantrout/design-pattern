package com.tech;

public class Laptop implements Computer {
	String ram;
	String hdd;
	String cpu;

	boolean isGraphicsEnable;
	boolean isBlutouthEnable;

	public Laptop(String ram, String hdd, String cpu, boolean isGraphicsEnable, boolean isBlutouthEnable) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnable = isGraphicsEnable;
		this.isBlutouthEnable = isBlutouthEnable;
	}

	@Override
	public String ram() {
		return this.ram;
	}

	@Override
	public String hdd() {
		return this.hdd;
	}

	@Override
	public String cpu() {
		return this.cpu;
	}

	@Override
	public boolean isGraphicsEnable() {
		return this.isGraphicsEnable;
	}

	@Override
	public boolean isBluetouthEnable() {
		return isBlutouthEnable;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnable=" + isGraphicsEnable
				+ ", isBlutouthEnable=" + isBlutouthEnable + "]";
	}

}
