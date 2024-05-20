package _05_polymorphism;
class Car {
	String color;
	int speed;
	void drive() {
		System.out.println("운전중");
	}
	void stop() {
		System.out.println("멈춤");
	}
}

class FireCar extends Car{
	void water() {
		System.out.println("물을 뿌립니다");
	}
}

public class T03_polyRun {

	public static void main(String[] args) {
		FireCar fCar = new FireCar();
		fCar.drive();
		fCar.water();
		fCar.stop();
		
		Car car = fCar;  // 부모클래스로 자동형변환
		car.drive();
//		car.water();//사용못함 오류
		car.stop();
		
		FireCar fCar2 = (FireCar)car; // 부모타입 => 자식타입으로 강제형변환. 큰자료형에서 작은자료형으로 바꿔줄땐 강제 형변환 해줘야한다.   
		/*
			주의
				반드시 부모는 최초객체생성시 자식의 타입으로 객체 생성 되어 있어야 한다.
		*/
	
		Car car2 = new Car();
//		FireCar fCar3 = (FireCar)car2; 
		// 컴파일오류 실행시 ClassCastException 오류. why? 최초객체생성시 부모타입으로 생성해서 자식객체는 생성되지 않음. 그래서 변환할수 없음
	
	}

}
