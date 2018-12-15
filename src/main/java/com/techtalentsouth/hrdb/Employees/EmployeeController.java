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
		return "index.html";
	}
	
	
	

}
