package com.tech;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationResourceTest {
	public static void main(String[] args) {
		// ApplicationResource resource = new ApplicationResource();

		/**
		 * This same object will be create for all the instance
		 */

		ExecutorService executor = Executors.newFixedThreadPool(10);
		try {
			ApplicationResourceRunner runner1 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner2 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner3 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner4 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner5 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner6 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner7 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner8 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner9 = new ApplicationResourceRunner();
			ApplicationResourceRunner runner10 = new ApplicationResourceRunner();
			
			executor.execute(runner1);
			executor.execute(runner2);
			executor.execute(runner3);
			executor.execute(runner4);
			executor.execute(runner5);
			executor.execute(runner6);
			executor.execute(runner7);
			executor.execute(runner8);
			executor.execute(runner9);
			executor.execute(runner10);
		} catch (Exception e) {
		
		} finally {
			executor.shutdown();
		}
	}
}
