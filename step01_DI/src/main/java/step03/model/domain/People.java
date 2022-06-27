package step03.model.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("p1")
public class People {
	private String name;
	private int age;
	
	@Autowired //필드 주입을 통해 의존성 주입을 하는 경우
	private Car myCar;
	
	public People(){
		System.out.println("step03 People 기본 생성자 생성");
	}
	public People(String name, int age, Car myCar){
		this.name=name;
		this.age=age;
		this.myCar=myCar;
		System.out.println("step03 People 사용자 정의 생성자 생성");
	}
}
