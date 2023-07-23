package com.tech;

public class VeryExpensiveProcessProxy implements VeryExpensiveProcess{
	private static VeryExpensiveProcess veryExpensiveProcessObject;

	@Override
	public void process() {
		if(veryExpensiveProcessObject == null) {
			veryExpensiveProcessObject = new VeryExpensiveProcessImpl();	
		}
		veryExpensiveProcessObject.process();
	}
	
	
}
