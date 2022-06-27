package com.spring.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import step01.model.domain.Car;
import step01.model.domain.People;
public class Step01Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("step01.xml");
		// step01
		// Car 생성
		Car c1 = context.getBean("c1",Car.class);
		System.out.println(c1); // 출력 결과 : Car(carNo=51, carName=Busan)
		
		// People 생성
		People p1 = context.getBean("p1", People.class);
		System.out.println(p1); // 출력 결과 : People(name=spring, age=32, myCar=Car(carNo=51, carName=Busan))
		//객체 생성 순서 : xml에서 <bean></bean>태그안에 정의된 내용으로 객체를 미리 생성한다. People객체 같은 경우 
		//객체 생성 후 데이터를 넣기 위해 setter를 사용해 처리한다.
		
		// step02 
		// people 생성
		People p2=context.getBean("p2",People.class);
		System.out.println(p2);//출력 결과 : People(name=spring2, age=322, myCar=Car(carNo=51, carName=Busan))
		
		//p1과 p2의 비교 false가 나옴
		System.out.println(p1==p2); // false 출력
		//p1의 myCar와 p2의 myCar 비교 true가 나옴 
		System.out.println(p1.getMyCar()==p2.getMyCar());// true 출력 , 객체 생성시 싱글톤으로 관리를하므로 한개의 객체만 생성되어 대입됨
		// 싱글톤 해지 방법 : xml파일에서 bean설정시 scope="prototype"을 추가한다.
		
	}
}