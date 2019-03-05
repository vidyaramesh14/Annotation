package com.bridgelabz.commonannotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("hai i am your math teacher");
		System.out.println("my aname is puttu");
	}

}
