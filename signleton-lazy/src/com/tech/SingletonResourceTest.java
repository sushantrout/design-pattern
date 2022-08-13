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
		 * This same object will be create for all the instance
		 */

		ApplicationResource instance1 = ApplicationResource.getInstance();
		ApplicationResource instance2 = ApplicationResource.getInstance();
		ApplicationResource instance3 = ApplicationResource.getInstance();

		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);
	}
}
