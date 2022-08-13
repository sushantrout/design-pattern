package com.tech;

/**
 * This is the test class for singleton.
 * @author Sushant
 *
 */
public class SingletonResourceTest {
	public static void main(String[] args) {
		// ApplicationResource resource = new ApplicationResource();

		/**
		 * Only one object will be created for all the getInstance()
		 */

		ApplicationResource instance1 = ApplicationResource.getInstance();
		ApplicationResource instance2 = ApplicationResource.getInstance();
		ApplicationResource instance3 = ApplicationResource.getInstance();

		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);
	}
}
