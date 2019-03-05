package com.bridgelabz.commonannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Clint {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("annobean.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college=context.getBean("college",College.class);
		System.out.println("the college object created by spring is: "+college);
		college.test();
		//((AnnotationConfigApplicationContext)context).close();
		context.close();
		}
}