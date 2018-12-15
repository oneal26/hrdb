package com.techtalentsouth.hrdb.Employees;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/")
	public String index() {
		return "index.html";
	}

}
