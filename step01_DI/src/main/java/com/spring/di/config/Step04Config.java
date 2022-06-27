package com.spring.di.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import step04.model.domain.Car;
import step04.model.domain.People;

@Configuration
@ComponentScan(basePackages = {"step04.model.domain"})
public class Step04Config {
//	@Bean
//	public Car car() {
//		System.out.println("확인용 dummy 문자열 : kdjflkasjdflkasjdlfkajskdlfjalskj");
//		Car car = new Car();
//		return car;
//	}
//	@Bean
//	public People people(Car car) {
//		People people = new People();
//		people.setMyCar(car);
//		System.out.println("확인용 dummy 문자열 : kdjflkasjdflkasjdlfkajskdlfjalskj");
//		return people;
//	}
}