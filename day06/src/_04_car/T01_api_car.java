package _04_car;

public class T01_api_car {
	//속성 - 회사, 모델, 컬러, 현재스피드, 시동
	
	/*
	//메소드
		시동켜고끄기,
		스피드 올리기(10씩 증가)
		스피드 올리기(10씩 감소)
		컬러 중간에 한번 바꾸기
	*/	 
	String comp = "쉐보레";
	String model = "트레일블레이져";
	String color = "blue";
	int speed;
	boolean power;
	
	void power() {
		power=!power;
		if(power)
			System.out.println("시동이 걸렸습니다");
		else {
			speed=0;
			System.out.println("시동이 꺼졌습니다");
		}
	}
	int speedup() {
		speed += 10;
		System.out.println("현재 속도 : "+speed);
		return speed;
		
	}
	int speeddown() {
		speed -= 10;
		System.out.println("현재 속도 : "+speed);
		return speed;
	}
	String color(String x) {
		color = x;
		System.out.println(color+"로 차 색깔 변경");
		return color;
		
	}
	int speedinput(int x) {
		speed = x;
		System.out.println("현재 속도 : "+speed);
		return speed;
	}
	
	
	
}
