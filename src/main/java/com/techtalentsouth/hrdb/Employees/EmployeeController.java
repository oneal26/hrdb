package com.techtalentsouth.hrdb.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String index() {
		return "employee/index.html";
	}
	
	@GetMapping	
//	suggestion for  checking admin  I think this should be done in the employeeController
	public String checkAdmin(Employee employee) {
		if(employee.getIsAdmin() == true) {
			return "admin/index.html";
		}else {return "employee/index.html";}
	}
	
	

}
