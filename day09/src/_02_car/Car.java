package _02_car;

//다른클래스로부터 상속받지 않는 클래스는 자동으로 Object클래스를 상속받음
//결과적으로 모든클래스가 Object클래스를 상속받게됨.
public class Car {
	//속성 : model, company, power, speed
	//메소드 : 시동켜고,끄기, 속도 올리고 내리고
	//생성자 : model, company 매개변수를 받는 생성자
	
	String model;
	String company;
	boolean power = false;
	int speed = 0;
	
	Car(String model, String company){
		this.model = model;
		this.company = company;
		
		
	}
	
	void power() {
		power = !power;
		if(power)
		System.out.println("시동이 켜졌습니다");
		else {
			speed = 0;
			System.out.println("시동이 꺼졌습니다");
			}
		}
	
	void speedUp() {
		
		speed += 10;
		System.out.println("현재속도 : "+speed);
		
	}
	
	void speedDown() {
		if(speed >=10) {
			speed -= 10;
		System.out.println("현재속도 : "+speed);
		}else {
			speed=0;
		System.out.println("현재속도 : "+speed);
		}
	}
	
	void infomation() {
		System.out.println("차종 : "+model+"\n소속 : "+company);
	}
}
