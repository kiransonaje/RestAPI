package com.company.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.company.Employee.transferObject.EmployeeDetails;

@Service
public class EmployeeService {

	private static ArrayList<EmployeeDetails> empList = new ArrayList<EmployeeDetails>(
			Arrays.asList(new EmployeeDetails(1, "Kiran", "10-10-2013", 1, "London", false, 15000),
					new EmployeeDetails(2, "Minal", "10-10-2014", 2, "New York", false, 16000),
					new EmployeeDetails(3, "Aaryan", "10-10-2015", 2, "New York", false, 20000),
					new EmployeeDetails(4, "Arjun", "10-10-2016", 1, "London", false, 25000)));

	public List<EmployeeDetails> getAllEmployee() {
		return empList;
	}

	public void addEmployee(EmployeeDetails employeeDetails) {
		empList.add(employeeDetails);
	}

	public void updateEmployee(int empId, EmployeeDetails employeeDetails) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == empId) {
				empList.set(i, employeeDetails);
				break;
			}
		}
	}

	public void deleteEmployee(int empId) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == empId) {
				empList.remove(i);
				break;
			}
		}
	}
	
	public List<EmployeeDetails> getEligibleEmployee(double salary, String joiningDate) throws ParseException{
		List<EmployeeDetails> eligibleEmployeeList = new ArrayList<EmployeeDetails>();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getSalary() > salary && format.parse(empList.get(i).getDateOfJoining()).compareTo(format.parse(joiningDate)) > 0 ) {
				eligibleEmployeeList.add(empList.get(i));
			}
		}
		return eligibleEmployeeList;		
	}
	
	public void updateDeptLocation(int deptId, String newLocation) {
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getDeptId() == deptId) {
				empList.get(i).setLocation(newLocation);
			}
		}
	}
	
	public EmployeeDetails pickRandomEmployee() {
		Random rand = new Random(); 
		EmployeeDetails winner = empList.get(rand.nextInt(empList.size()));
		winner.setEmployeeOfTheMonth(true);
		return winner;
	}
}
