package com.tech;

public class VeryExpensiveProcessImpl implements VeryExpensiveProcess {

	public VeryExpensiveProcessImpl() {
		heavyConfiguration();
	}

	private void heavyConfiguration() {
		System.out.println("Heavy configuartion");

	}

	@Override
	public void process() {
		System.out.println("Processing done");
	}

}
