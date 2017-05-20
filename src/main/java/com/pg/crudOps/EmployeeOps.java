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

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author predix -
 */
@Service
public class EmployeeOps implements EmployeeOpsInterface{

	@Autowired
	private EmployeeRepository empRep;
	
	/* (non-Javadoc)
	 * @see com.pg.crudOps.EmployeeOpsInterface#findAllEmployees()
	 */
	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> empList = null;
		Iterable<Employee> empIterator = (Iterable<Employee>) empRep.findAll();
		while(empIterator.iterator().hasNext()){
			empList.add(empIterator.iterator().next());
		}
		return empList;
	}

	/* (non-Javadoc)
	 * @see com.pg.crudOps.EmployeeOpsInterface#findByEmpName(int)
	 */
	public Employee findByEmpId(int searchId) {
		
		Employee result=null;
		result = empRep.findOne(searchId);
		
		return result;
	}


	/* (non-Javadoc)s
	 * @see com.pg.crudOps.EmployeeOpsInterface#addEmployee()
	 */
	@Override
	public String addEmployee(Employee newEmp) {		
		if(empRep.save(newEmp) != null){
			return "success";
		}	
		else {
			return "error in saving employee!";
		}
	}

	/* (non-Javadoc)
	 * @see com.pg.crudOps.EmployeeOpsInterface#deleteEmployee()
	 */
	@Override
	public void deleteEmployee(int id) {
		empRep.delete(id);
	}

}
