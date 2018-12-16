package com.techtalentsouth.hrdb.Employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Employee {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lastName;
	private Boolean isAdmin;
	private Integer hrsWorked;
	private String passWord;
	
	
	public Employee() {
		//Empty Employee constructor for the JPA
		
	}
	
	public Employee(String firstName, String lastName, Boolean isAdmin, Integer hrsWorked, String passWord) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAdmin = isAdmin;
		this.hrsWorked = hrsWorked;
		this.passWord = passWord;
		
	}
	
	//This method is for checking whether the person loggin as admin is admin 
	//incase we need this for loggin security
//	Look in the EmployeeController.java for Latori's suggestion
	public Boolean admin() {
		  if(firstName =="Mike" && lastName =="Smith" && passWord == passWord) {
			  return true;
			  
		  }else
			  
			  return false;
	}
	
	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Integer getHrsWorked() {
		return hrsWorked;
	}

	public void setHrsWorked(Integer hrsWorked) {
		this.hrsWorked = hrsWorked;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", isAdmin=" + isAdmin
				+ ", hrsWorked=" + hrsWorked + ", passWord=" + passWord + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
