package step01.model.domain;
import lombok.Data;
@Data
public class People {
	private String name;
	private int age;
	private Car myCar;
	public People(){
		System.out.println("People 기본 생성자 생성");
	}
	public People(String name, int age, Car myCar){
		this.name=name;
		this.age=age;
		this.myCar=myCar;
		System.out.println("People 사용자 정의 생성자 생성");
	}
}
