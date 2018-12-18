package com.techtalentsouth.hrdb.Employee;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ModelAndView allEmployees(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/allEmployees");
		mv.addObject("employees", employeeRepository.findAll());
		return mv;
	}
	
//	@GetMapping("editEmployee")
//	public ModelAndView editEmployee(Employee employee) {
//		ModelAndView mv = new ModelAndView("employee/editEmployee");
//		return mv;
//	}
	
	@GetMapping("newEmployee")
	public ModelAndView newEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/newEmployee");
		return mv;
	}
	
	@GetMapping("results")
	public ModelAndView results(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/results");
		mv.addObject("employees", employeeRepository.findAll());
		return mv;
	}
	
	@PostMapping("employee/newEmployee")
	public ModelAndView createEmployee(Employee employee) {
		ModelAndView mv = new ModelAndView("employee/results");
		Employee newEmployee = employeeRepository.save(new Employee(employee.getFirstName(), employee.getLastName(),
														employee.getIsAdmin(), employee.getHrsWorked(), employee.getPassWord(),
														employee.getAddress(), employee.getEmail(), employee.getIsEmployed(), 
														employee.getWage(), employee.getPhoneNumber()));
		mv.addObject("newEmployee", newEmployee);
		return mv;
	}
////<<<<<<< HEAD
//	
//	@PostMapping("/")
//	public ModelAndView verifyLogin(Employee employee) {
//		ModelAndView mv;
//		if(employee.getFirstName().contains(employee.getFirstName()) && employee.getPassWord().contains(employee.getPassWord())) {
//			mv = new ModelAndView("employee/index");
//		}else {
//			mv = new ModelAndView("employee/login");
//		}
//		return mv;
//		
//	}
//	
////=======
//	//new change for testing
//	@GetMapping("memberEdit")
//	public ModelAndView memberEdit(Employee employee) {
//		ModelAndView mv = new ModelAndView("employee/memberEdit");
//		return mv;
//	}
////>>>>>>> 6deb4f11a46f8affe7de877bbdca409b205985d1
	
	
	
	
	//shows the form for editing a employee
		@GetMapping("/employee/editEmployee/{id}")
		public ModelAndView updateEmployeeForum(@PathVariable("id") long id) {
			ModelAndView mv = new ModelAndView("employee/editEmployee");
			Optional<Employee> newEmployee = employeeRepository.findById(id);
			mv.addObject("employee", newEmployee);
			return mv;
		}
	
		//saves the edits to the employee
		@PutMapping("/employee/editEmployee")
		public ModelAndView updateEmployee(Employee employee) {
			ModelAndView mv = new ModelAndView("redirect:/");
			employeeRepository.save(employee);
			return mv;
		}
	
	
		//shows the form for editing a employee
		@DeleteMapping("/employee/delete/{id}")
		public ModelAndView deleteEmployee(@PathVariable("id") long id) {
			ModelAndView mv = new ModelAndView("redirect:/");
			employeeRepository.deleteById(id);
			return mv;
		}
		
		
		
		
		
	
	
}
	
	

