package _01_obj;

public class T01_api_car {
	//인스턴스
	String company = "삼성";
	String model = "SM7";
	String color = "흰색";
	int speed;  // int 기본값 0
	boolean power; // boolean 기본값 false


	void power() {
		power = !power;
		if(power)
			System.out.println("시동을 켭니다");
		else
			System.out.println("시동을 끕니다");
	}
				//지역변수는 연산후 저장공간에서 사라짐
	int speed(int speed) {
		this.speed += speed;// this.를 붙이면 인스턴스(객체)변수 호출
		return this.speed; //this.는 인스턴스와 메소드지역변수의 이름이 같을때 사용
	}
	int speedDown() {
		speed -= 5;
		return speed;
	}


}
