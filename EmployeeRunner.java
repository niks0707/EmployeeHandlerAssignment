package com.employeeHandler;

public class EmployeeRunner {

	public static void main(String[] args) throws DuplicateEmployeeException, EmployeeNotFoundException {
		EmployeeDirectory directory = new EmployeeDirectory();

		directory.displayAllEmployee();

		directory.addEmployee(1001,
				new Employee("john", "john1001@gmail.com", "Administration", "System Engineer", 45000));
		directory.addEmployee(1002,
				new Employee("nick", "nick1002@gmail.com", "Administration", "System Engineer", 50000));
		directory.addEmployee(1003, new Employee("slash", "slash1003@gmail.com", "HR", "HD Head", 60000));
		directory.addEmployee(1004, new Employee("zucks", "zucks1004@gmail.com", "SDE", "Software Developer", 80000));

		directory.removeEmployee(1002);

		directory.getEmployee(1004);

		try {
			directory.addEmployee(1001,
					new Employee("john", "john1001@gmail.com", "Administration", "System Engineer", 45000));
		} catch (DuplicateEmployeeException e) {
			System.out.println(e.getMessage());
		}

		try {
			directory.removeEmployee(1009);
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			directory.getEmployee(1010);
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}

		directory.displayAllEmployee();
	}

}
