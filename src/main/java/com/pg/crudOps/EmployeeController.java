/*
 * Copyright (c) 2017 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.pg.crudOps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author predix -
 */
@RestController
public class EmployeeController
{
	
	@Autowired
	private EmployeeOps empOps;
	/*private static final String PATH = "/error";
	
	@RequestMapping(value = PATH)
	public String errorMessage()
	{
		return "Error handling";
	}
	
	@Override
	public String getErrorPath() {
		return PATH;
	}*/
 
	@RequestMapping("/hello")
	public String sayHello(){
		return "Howdy!!";
	}
	
	@RequestMapping("/home")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/employees")
	public List<Employee> listOfEmployees(){
		return empOps.findAllEmployees();
	}
	
	@RequestMapping("/employees/{empId}")
	public Employee findEmployee(@PathVariable int empId){
		return empOps.findByEmpId(empId);
	}
	 

	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public String addNewEmployee(){
		Employee newEmp = new Employee();
		newEmp.setEmpId(10);
		newEmp.setEmpName("NewEmp");
		newEmp.setDept("SomeDept");
		
		return empOps.addEmployee(newEmp);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteEmployee/{delEmpId}")
	public void deleteEmployee(@PathVariable int delEmpId){
		empOps.deleteEmployee(delEmpId);
	}
}
