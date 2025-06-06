package com.student.service;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.student.core.Student;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StudentServiceTest {
	
	private ClassPathXmlApplicationContext context;
	private StudentService service;

	@BeforeEach
	void setUp() {
		context = new ClassPathXmlApplicationContext("beans.xml");  
		service =  context.getBean("studentService", StudentService.class);
	}
	
 
	@Test
	void testGetOneStudent() {
		 assertNotNull(service);
	}
	@Test
	void tesGetAll() {
		service.getAllStudents().forEach(student -> {
			System.out.println(student);
		});
	}
	


}
