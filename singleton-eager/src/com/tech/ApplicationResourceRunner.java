package com.tech;

public class ApplicationResourceRunner implements Runnable {

	@Override
	public void run() {
		ApplicationResource instance1 = ApplicationResource.getInstance();
		System.out.println(instance1);
	}

}
