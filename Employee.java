package com.employeeHandler;

class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(String message) {
		super(message);
	}
}

class DuplicateEmployeeException extends Exception {
	public DuplicateEmployeeException(String message) {
		super(message);
	}
}

public class Employee {
	private String name;
	private String email;
	private String department;
	private String jobTitle;
	private int salary;

	public Employee(String name, String email, String department, String jobTitle, int salary) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee Info [Name:" + name + ", Email:" + email + ", Department:" + department + ", Job Title:"
				+ jobTitle + ", Salary:" + salary + "]";
	}

}
