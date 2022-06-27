package step03.model.domain;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component //컴포넌트 스캔의 대상이 되는 애노테이션 중 하나로써 주로 유틸, 기타 지원 클래스에 붙이는 어노테이션
public class Car {
	//Bean 빈이 되기 위한 조건 : 기본생성자 반드시 존재 + private 필드 반드시 존재 + getter/setter가 반드시 존재 해야 한다.
	private int carNo;
	private String carName;
	public Car() {
		System.out.println("step03 Car 기본 생성자 생성");
	}
	public Car(int carNo,String carName) {
		this.carNo=carNo;
		this.carName=carName;
		System.out.println("step03 Car 사용자 정의 생성자 ");
	}
	
}
