package com.techtalentsouth.hrdb.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//	@GetMapping("/")
//	public String index() {
//		return "employee/index.html";
//	}
	
	
//	suggestion for  checking admin  I think this should be done in the employeeController	
//	@PostMapping("/")	
//	public String checkAdmin(Employee employee) {
//		if(employee.getIsAdmin() == true) {
//			return "admin/index.html";
//		}else {return "employee/index.html";}
//	}
		
	@GetMapping("index")
	public ModelAndView index(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/index");
		mv.addObject("employees", employeeRepository.findAll());
		return mv;
	}
	
	@GetMapping("/")
		public ModelAndView login(Employee employee) {
			ModelAndView mv = new ModelAndView("employee/login");
			return mv;
		}

	
	@GetMapping("allEmployees")
	public ModelAndView allEmployees() {
		ModelAndView mv = new ModelAndView("employee/allEmployees");
		return mv;
	}
	
	@GetMapping("editEmployee")
	public ModelAndView editEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/editEmployee");
		return mv;
	}
	
	@GetMapping("newEmployee")
	public ModelAndView newEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/newEmployee");
		return mv;
	}
	
	@GetMapping("results")
	public ModelAndView results(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/results");
		return mv;
	}
	
	@PostMapping("employee/newEmployee")
	public ModelAndView createEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/results");
		Employee newEmployee = employeeRepository.save(employee);
		mv.addObject("newEmployee", newEmployee);
		return mv;
	}
	//new change for testing
	@GetMapping("memberEdit")
	public ModelAndView memberEdit(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/memberEdit");
		return mv;
	}
	
	
	
}
	
	

