package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.Student;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext ap = new AnnotationConfigApplicationContext("com.spring.core");
		Student student = (Student) ap.getBean("student", Student.class);
		student.show();	
	}
	
}

