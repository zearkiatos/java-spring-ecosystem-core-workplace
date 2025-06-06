package com.student.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentServiceTest {
	
	private ApplicationContext context;
	private StudentService service;

	@BeforeEach
	void setUp() {
		  context = new ClassPathXmlApplicationContext("beans.xml");

	}
	
 
	@Test
	void testGetOneStudent() {
		  service = context.getBean("studentService", StudentService.class);
		  
		  assertNotNull(service);
	}
	
	@Test
	void tesGetAll() {
		 
	}
}
