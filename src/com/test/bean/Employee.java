package com.test.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String ename;
	
	private Set<Project> projects = new HashSet<Project>();

	// Constructors

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public Employee(Integer eid, String ename) {
		//super();
		this.eid = eid;
		this.ename = ename;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}