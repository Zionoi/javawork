package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		// 인터페이스는 객체생성할 수 없다.
		// 그러나 형변환은 가능
		
//		RemoteControl rc1 = new RemoteControl();  // 인터페이스는 객체생성 불가능

// 		인터페이스를 상속받은 클래스를 객체생성해서 인터페이스를 사용할 수 있다
		Audio audio1 = new Audio();
		audio1.turnOn();
		audio1.turnOff();
		System.out.println("-------------------------");
		
		
		RemoteControl rc = audio1; // 자식클래스인 Audio를 부모타입인 RemoteControl로 형변환 가능
		rc.turnOn();
		rc.turnOff();
		System.out.println("-------------------------");
		
		
		rc = new Tv(); //오디오에서 티비로 다형성
		rc.turnOn();
		rc.turnOff();
		
		
		
		
	}

}
