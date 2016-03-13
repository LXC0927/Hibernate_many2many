package com.test.bean;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.HibernateSessionFactory;

public class Many2ManyTest {

	private Session session;
	private Transaction transaction;
	@Before
	public void setUp() throws Exception {
		session = HibernateSessionFactory.getSession();
		transaction = session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		HibernateSessionFactory.closeSession();
	}

	@Test
	public void test() {
		Project project1 = new Project(1001,"项目一");
		Project project2 = new Project(1002,"项目二");
		Employee employee1 = new Employee(1, "张三");
		Employee employee2 = new Employee(2, "李四");
		
		project1.getEmployees().add(employee1);
		project1.getEmployees().add(employee2);
		
		project2.getEmployees().add(employee2);
		
		session.save(project1);
		session.save(project2);
		transaction.commit();
		
	}

}
