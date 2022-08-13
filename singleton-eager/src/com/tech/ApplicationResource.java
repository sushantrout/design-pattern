package com.tech;

/**
 * 
 * @author Sushant Kumar Rout
 *
 */
public class ApplicationResource {
	private static ApplicationResource INSTANCE;

	private ApplicationResource() {
	}

	public static ApplicationResource getInstance() {
		// This one is not thread safe
		/*
		 * if(INSTANCE == null) { INSTANCE = new ApplicationResource(); } return
		 * INSTANCE;
		 */

		if (INSTANCE == null) {
			synchronized (ApplicationResource.class) {
				if (INSTANCE == null) {
					INSTANCE = new ApplicationResource();
				}
				return INSTANCE;
			}
		} else {
			return INSTANCE;
		}
	}
}
