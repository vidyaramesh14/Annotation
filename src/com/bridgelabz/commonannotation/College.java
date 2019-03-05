package com.bridgelabz.commonannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	//@Value("Cambridge")
	@Value("${college.Name}")
	private String collegeName;
	@Autowired
	private Principal principle;
	@Autowired
	private Teacher teacher;
	
	/*public College(Principal principle) {
		super();
		this.principle = principle;
	}*/
	public void test()
	{	principle.principalInfo();
		System.out.println("my college name  is "+collegeName);
		System.out.println("testing college class method");
	}
}
