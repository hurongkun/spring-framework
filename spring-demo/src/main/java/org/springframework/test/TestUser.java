package org.springframework.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
    public static void main(String[] args) {
		System.out.println("hello");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.toString());
    }
}
