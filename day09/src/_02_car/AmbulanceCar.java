package _02_car;

public class AmbulanceCar extends Car {
	boolean siren; // 인스턴스필드는 값을 안주면 기본값으로 세팅됨.
	boolean firstAid;
	
	
	AmbulanceCar(String model, String company) { 
		super(model, company);
		
	}
	//사이렌 on,off
	void siren() {
		siren = !siren;
		if(siren) 
			System.out.println("사이렌이 울립니다");
		
		else
			System.out.println("사이렌을 끕니다");
	}
	//응급처치 on,off
	void firstAid() {
		firstAid = !firstAid;
		if(firstAid)
			System.out.println("응급처치를 합니다");
		else
			System.out.println("응급처치를 끝냅니다");
	}
	
	
	

}
