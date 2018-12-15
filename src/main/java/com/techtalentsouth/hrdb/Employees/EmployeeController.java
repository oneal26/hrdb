package com.techtalentsouth.hrdb.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.techtalentsouth.TechTalentBlog.BlogPost.BlogPost;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
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
	}
	


