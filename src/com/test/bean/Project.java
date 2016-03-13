package com.test.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	
	private Set<Employee> employees = new HashSet<Employee>();

	// Constructors

	/** default constructor */
	public Project() {
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public Project(Integer pid, String pname) {
		//super();
		this.pid = pid;
		this.pname = pname;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}