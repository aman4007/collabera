package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
class CollaberaTestController {
	
	public Boolean isString(String st) {
		if (st == null)
			return false;
		else {
			if (st.length() == 1) {
				char ch = st.charAt(0);

				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
					return true;
				else
					return false;

			}
		}
		return true;

	}
	
	
	@RequestMapping("/test")
	public String testAssignment(@RequestBody Employee employee) throws JsonProcessingException  {
		System.out.println(employee);
		Employee e=new Employee();
		ObjectMapper mapper = new ObjectMapper();
	    mapper.setSerializationInclusion(Include.NON_NULL);
	    if(isString(employee.getEmployeeName())){
	    	e.setEmployeeName(employee.getEmployeeName());
	    }
	    if(isString(employee.getAddress())){
	    	e.setAddress(employee.getAddress());
	    }
	    if(isString(employee.getCountry())){
	    	e.setCountry(employee.getCountry());
	    }
	    if(isString(employee.getDepartement())){
	    	e.setDepartement(employee.getDepartement());
	    }
	    if(isString(employee.getPincode())){
	    	e.setPincode(employee.getPincode());
	    }
	    if(isString(employee.getSalary())){
	    	e.setSalary(employee.getSalary());
	    }
	    if(isString(employee.getState())){
	    	e.setState(employee.getState());
	    }
	    
	  
		e.setMessage("Emp verified Successfully");
		
		
		
		
		 String stundetString = mapper.writeValueAsString(e);
		
		return stundetString;
		
	}
	@PostMapping("/test1")
	public Employee testAssignment1(@RequestBody Employee e)  {
		System.out.println(e);
		
		return e;

		
	}

}
