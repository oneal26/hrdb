package com.techtalentsouth.hrdb.Employee;


import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
	Employee findByEmail(String email);
	String findByPassWord(String password);
}
