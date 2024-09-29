package com.employeeHandler;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDirectory {
	private Map<Integer, Employee> employeeData = new HashMap<>();

	public void addEmployee(int id, Employee employee) throws DuplicateEmployeeException {
		if (employeeData.containsKey(id)) {
			throw new DuplicateEmployeeException("\nEmployee with id: " + id + " already exist");
		}
		employeeData.put(id, employee);
		System.out.println("\nEmployee with id: " + id + " added successfully!");
	}

	public void removeEmployee(int id) throws EmployeeNotFoundException {
		if (!employeeData.containsKey(id)) {
			throw new EmployeeNotFoundException("\nCannot remove employee with ID " + id + " bcz that doesn't exist");
		}
		employeeData.remove(id);
		System.out.println("\nEmployee with id: " + id + " removed successfully!");
	}

	public void getEmployee(int id) throws EmployeeNotFoundException {
		if (!employeeData.containsKey(id)) {
			throw new EmployeeNotFoundException("\nSorry, no information available for id: " + id);
		}
		System.out.println("\nid: " + id + " " + employeeData.get(id));
	}

	public void displayAllEmployee() {
		if (employeeData.isEmpty()) {
			System.out.println("\nNo employes in Directory!!!!");
		} else {
			System.out.println("\nHere is data for all the Employees: ");
//			for (Employee emp : employeeData.values()) {
//				System.out.println("id: " + emp);
//			}
			employeeData.entrySet().stream().forEach(e -> System.out.println("id: " + e.getKey() + " " + e.getValue()));
		}
	}
}
