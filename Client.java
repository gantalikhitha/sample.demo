package com.bean.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
		
	
	public static void main(String[] args) {
	
		
//		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(StudentConfiguration.class);
		
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(StudentConfiguration.class);
		System.out.println("java is loaded");
		Student stu=con.getBean("student",Student.class);
		System.out.println("stu object is created");
		stu.display();
		con.close();
		}
		
		
			
	

}

