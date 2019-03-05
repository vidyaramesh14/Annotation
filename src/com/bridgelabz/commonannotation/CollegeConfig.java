package com.bridgelabz.commonannotation;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="com.bridgelabz.commonannotation") //for bean it is not required
@PropertySource("classpath:college-info-property")
public class CollegeConfig {
	
	/*@Bean
	public Teacher mathteacherBean()
	{
		return new MathTeacher();
	}
	@Bean
	public Principal principalBean()
	{
		return new Principal();
	}
	
	
	@Bean//(name= {"colBean","collegeBeanAnnotation"})
	public College collegeBean()//this method name is beanName
	{FOR	constructure
		College college=new College(principalBean());
		return college;
		
		College college=new College();
		college.setPrinciple(principalBean());
		college.setTeacher(mathteacherBean());
		return college;
	}
	*/
	
}
