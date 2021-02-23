package com.example.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public  class Employee  {
	

 @JsonDeserialize(using = ToLowerCaseDeserializer.class)
	private String EmployeeName;	
 @JsonDeserialize(using = ToLowerCaseDeserializer.class)
	private String Address;
 @JsonDeserialize(using = ToLowerCaseDeserializer.class)
	private String Salary;
 @JsonDeserialize(using = ToLowerCaseDeserializer.class)
	private String Departement;
 @JsonDeserialize(using = ToLowerCaseDeserializer.class)
	private String Pincode;
 @JsonDeserialize(using = ToLowerCaseDeserializer.class)
	private String State;
 @JsonDeserialize(using = ToLowerCaseDeserializer.class)
 private String Country;
 @JsonDeserialize(using = ToLowerCaseDeserializer.class)
	private String Message;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String employeeName, String address, String salary, String departement, String pincode,
			String state, String country, String message) {
		super();
		EmployeeName = employeeName;
		Address = address;
		Salary = salary;
		Departement = departement;
		Pincode = pincode;
		State = state;
		Country = country;
		Message = message;
	}


	public String getEmployeeName() {
		return EmployeeName;
	}


	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getSalary() {
		return Salary;
	}


	public void setSalary(String salary) {
		Salary = salary;
	}


	public String getDepartement() {
		return Departement;
	}


	public void setDepartement(String departement) {
		Departement = departement;
	}


	public String getPincode() {
		return Pincode;
	}


	public void setPincode(String pincode) {
		Pincode = pincode;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public String getMessage() {
		return Message;
	}


	public void setMessage(String message) {
		Message = message;
	}


	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", Address=" + Address + ", Salary=" + Salary
				+ ", Departement=" + Departement + ", Pincode=" + Pincode + ", State=" + State + ", Country=" + Country
				+ ", Message=" + Message + "]";
	}
	

}
