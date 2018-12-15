package com.techtalentsouth.hrdb.Employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private Boolean isAdmin;
	private Integer hrsWorked;
	private Long passWord;
	
	
	public Employee() {
		//Empty Employee constructor for the JPA
		
	}
	
	public Employee(String firstName, String lastName, Boolean isAdmin, Integer hrsWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAdmin = isAdmin;
		
	}
	
	//This method is for checking whether the person loggin as admin is admin 
	//incase we need this for loggin security
	public Boolean admin() {
		  if(firstName =="Mike" && lastName =="Smith" && passWord == passWord) {
			  return true;
			  
		  }else
			  
			  return false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getPassWord() {
		return passWord;
	}

	public void setPassWord(Long passWord) {
		this.passWord = passWord;
	}
	
	
	
	
	
	
	
	
	
	
	

}
