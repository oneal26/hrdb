package com.techtalentsouth.hrdb.Employee;

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
	private String passWord;
	private String address;
	private String email;
	private Boolean isEmployed;
	private Integer wage;
	private String phoneNumber;
	
	public Employee() {
		//Empty Employee constructor for the JPA
		
	}
	
	public Employee(String firstName, String lastName, Boolean isAdmin, Integer hrsWorked, String passWord, 
			        String address, String email, Boolean isEmployed, Integer wage, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAdmin = isAdmin;
		this.hrsWorked = hrsWorked;
		this.passWord = passWord;
		this.address = address;
		this.email = email;
		this.isEmployed = isEmployed;
		this.wage = wage;
		this.phoneNumber = phoneNumber;
		
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", isAdmin=" + isAdmin
				+ ", hrsWorked=" + hrsWorked + ", passWord=" + passWord + ", address=" + address + ", email=" + email
				+ ", isEmployed=" + isEmployed + ", wage=" + wage + ", phoneNumber=" + phoneNumber + "]";
	}


//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", isAdmin=" + isAdmin
//				+ ", hrsWorked=" + hrsWorked + ", passWord=" + passWord + "]";
//	}
	
	
	
	
	
	
	
	
	
	
	
	

}
