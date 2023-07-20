package com.bip;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee.Builder("John", "Doe")
                .age(30)
                .department("IT")
                .position("Software Engineer")
                .salary(50000.0)
                .build();

        // You can now work with the employee object
        System.out.println(employee);
    }
}
