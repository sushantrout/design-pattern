package com.tech;

public class ProxyTest {
	public static void main(String[] args) {
		VeryExpensiveProcess veryExpensiveProcess = new VeryExpensiveProcessProxy();
		veryExpensiveProcess.process();
	}
}
