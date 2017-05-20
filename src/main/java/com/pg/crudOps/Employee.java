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

import javax.persistence.Column;

/**
 * 
 * @author predix -
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="empid")
	private int empId;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="department")
	private String department;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return this.empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return this.empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the deptName
	 */
	public String getDept() {
		return this.department;
	}
	/**
	 * @param dept the deptName to set
	 */
	public void setDept(String dept) {
		this.department = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [Employee id=" + empId + ", Employee name=" + empName
				+ ", Dept name=" + department +"]";
	}
}
