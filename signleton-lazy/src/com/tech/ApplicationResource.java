package com.tech;

/**
 * This class is responsible for create and give one singleton object 
 * At the time of class load the object is create and assign to the INSTACE static variable.
 * 
 * @author Sushant
 *
 */
public class ApplicationResource {

	private static final ApplicationResource INSTANCE = new ApplicationResource();

	private ApplicationResource() {
	}

	public static ApplicationResource getInstance() {
		return INSTANCE;
	}

}
