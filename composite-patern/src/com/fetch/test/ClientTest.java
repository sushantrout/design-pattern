package com.fetch.test;

import com.fetch.Service;
import com.fetch.leaf.AdminService;
import com.fetch.leaf.EmployeeService;
import com.fetch.provider.ServiceProvider;

public class ClientTest {
	public static void main(String[] args) {
		Service employeeService1 = new EmployeeService();
		Service employeeService2 = new EmployeeService();
		Service adminService3 = new AdminService();

		ServiceProvider serviceProvider = new ServiceProvider();

		serviceProvider.addService(employeeService1);
		serviceProvider.addService(employeeService2);
		serviceProvider.addService(adminService3);

		serviceProvider.service("Registration Service");

		serviceProvider.deleteService(employeeService1);

		serviceProvider.addService(new AdminService());
		System.out.println("------------------------------");
		serviceProvider.service("Logout Service");

		serviceProvider.clearServices();
		System.out.println("------------------------------");
		serviceProvider.addService(employeeService1);
		serviceProvider.service("Update Service");
	}
}
