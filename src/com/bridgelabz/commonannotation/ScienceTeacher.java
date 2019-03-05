package com.bridgelabz.commonannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("hai i am your science teacher");
		System.out.println("my aname is KBR");
	}

}
