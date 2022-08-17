package com.fetch.provider;

import java.util.ArrayList;
import java.util.List;

import com.fetch.Service;

public class ServiceProvider implements Service {

	private List<Service> serviceList = new ArrayList<>();

	@Override
	public void service(String serviceType) {
		for (Service service : serviceList) {
			service.service(serviceType);
		}
	}

	public void addService(Service service) {
		serviceList.add(service);
	}

	public void deleteService(Service service) {
		serviceList.remove(service);
	}

	public void clearServices() {
		serviceList.clear();
	}

}
