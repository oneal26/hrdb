package com.techtalentsouth.hrdb.Employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//address, email, phone, status,  and wage have been added!

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
	private String address;
	private String email;
	private String phoneNumber;
	private Boolean isEmployed;
	private Integer wage;
	
	public Employee() {
		//Empty Employee constructor for the JPA
		
	}
	
	public Employee(String firstName, String lastName, Boolean isAdmin, Integer hrsWorked, String passWord, String address, String email, String phoneNumber, Boolean isEmployed, Integer wage) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAdmin = isAdmin;
		this.hrsWorked = hrsWorked;
		this.passWord = passWord;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.isEmployed = isEmployed;
		this.wage = wage;
		
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
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getIsEmployed() {
		return isEmployed;
	}

	public void setIsEmployed(Boolean isEmployed) {
		this.isEmployed = isEmployed;
	}

	public Integer getWage() {
		return wage;
	}

	public void setWage(Integer wage) {
		this.wage = wage;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", isAdmin=" + isAdmin
				+ ", hrsWorked=" + hrsWorked + ", passWord=" + passWord + ", address=" + address + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", isEmployed=" + isEmployed + ", wage=" + wage + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
