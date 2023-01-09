package org.springframework.demo.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(UserConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());

	}
}
