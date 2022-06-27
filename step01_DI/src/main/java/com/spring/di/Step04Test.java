package com.spring.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.di.config.Step04Config;

import step04.model.domain.Car;
import step04.model.domain.People;
public class Step04Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Step04Config.class);
		// People 생성
		People p1 = context.getBean("people", People.class);
		System.out.println(p1);

		// Car 생성 
		Car c1 = context.getBean("car", Car.class);
		System.out.println(c1);
	}
}