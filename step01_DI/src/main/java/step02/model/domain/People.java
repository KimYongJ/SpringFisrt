package step02.model.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
@Data
public class People {
	private String name;
	private int age;
	
	@Autowired(required = false) //필드 주입을 통해 의존성 주입을 하는 경우
	@Qualifier("c2") //bean태그가 2가지 이상일 때 어떤 것을 사용할지 지정하는 것
	private Car myCar;
	
	public People(){
		System.out.println("step02 People 기본 생성자 생성");
	}
	public People(String name, int age, Car myCar){
		this.name=name;
		this.age=age;
		this.myCar=myCar;
		System.out.println("step02 People 사용자 정의 생성자 생성");
	}
}
