package com.fetch.leaf;

import com.fetch.Service;

public class AdminService implements Service{
	@Override
	public void service(String serviceType) {
		System.out.println(serviceType +" for Admin");
	}
}
