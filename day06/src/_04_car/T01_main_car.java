package _04_car;

public class T01_main_car {

	public static void main(String[] args) {
		T01_api_car ob1 = new T01_api_car();
		
		System.out.println("제조사 : "+ob1.comp);
		System.out.println("모델명 : "+ob1.model);
		
		ob1.power();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speeddown();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.speedup();
		ob1.color("red");
		ob1.speeddown();
		ob1.speedinput(200);
		ob1.power();
		
		
	}

}
