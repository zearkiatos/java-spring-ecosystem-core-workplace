package com.student.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.student.config.ApplicationConfig;
import com.student.core.Student;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import javax.inject.Inject;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class StudentServiceTest {
	
	@Inject
	private StudentService service;
	
 
	@Test
	void testGetOneStudent() {
		 Student student =  service.get(1L);
		 assertThat(student.getFirstName(), equalTo("Eric"));
	     assertThat(student.getSurname(), equalTo("Colbert"));
	}
	@Test
	void tesGetAll() {
		 assertThat(service.getAllStudents().size(), equalTo(2));
		 service.getAllStudents().forEach(p-> {
			System.out.printf("%-10s %-10s%n",p.getFirstName(), p.getSurname());
		 });
	}


}
