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

/**
 * 
 * @author predix -
 */
public interface EmployeeOpsInterface {
	public List<Employee> findAllEmployees();
	public Employee findByEmpId(int searchId);
	public String addEmployee(Employee newEmployee);
	public void deleteEmployee(int id);
}
