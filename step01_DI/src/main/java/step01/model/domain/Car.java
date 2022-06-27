package step01.model.domain;
import lombok.Data;
@Data
public class Car {
	//Bean 빈이 되기 위한 조건 : 기본생성자 반드시 존재 + private 필드 반드시 존재 + getter/setter가 반드시 존재 해야 한다.
	private int carNo;
	private String carName;
	public Car() {
		System.out.println("Car 기본 생성자 생성");
	}
	public Car(int carNo,String carName) {
		this.carNo=carNo;
		this.carName=carName;
		System.out.println("Car 사용자 정의 생성자 ");
	}
	
}
