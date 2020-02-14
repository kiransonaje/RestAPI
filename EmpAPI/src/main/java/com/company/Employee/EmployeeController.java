package com.company.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.Employee.transferObject.EmployeeDetails;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/Employee")
	public List<EmployeeDetails> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Employee")
	public void addEmployee(@RequestBody EmployeeDetails employeeDetails) {
		employeeService.addEmployee(employeeDetails);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/Employee/{empId}")
	public void updateEmployee(@PathVariable int empId, @RequestBody EmployeeDetails employeeDetails) {
		employeeService.updateEmployee(empId, employeeDetails);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Employee/{empId}")
	public void deleteEmployee(@PathVariable int empId) {
		employeeService.deleteEmployee(empId);
	}
	
}
