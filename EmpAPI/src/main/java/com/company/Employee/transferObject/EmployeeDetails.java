package com.company.Employee.transferObject;

public class EmployeeDetails {
	int empId;
	String empName;
	String dateOfJoining;
	int deptId;
	String location;
	boolean employeeOfTheMonth;
	double salary;
	
	public EmployeeDetails() {
		
	}
	
	public EmployeeDetails(int empId, String empName, String dateOfJoining, int deptId, String location,
			boolean employeeOfTheMonth, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dateOfJoining = dateOfJoining;
		this.deptId = deptId;
		this.location = location;
		this.employeeOfTheMonth = employeeOfTheMonth;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isEmployeeOfTheMonth() {
		return employeeOfTheMonth;
	}

	public void setEmployeeOfTheMonth(boolean employeeOfTheMonth) {
		this.employeeOfTheMonth = employeeOfTheMonth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
