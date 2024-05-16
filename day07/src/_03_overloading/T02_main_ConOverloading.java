package _03_overloading;


class Aaa {
	int num;
	double dou;
	String name;
	
	//생성자 
	Aaa() {
		num=1;
		dou = 1.0;
		name = "김요한";
		System.out.println("매개변수가 없는 생성자");
	}
	
	Aaa(int num){
		this.num = num;
		dou = 1.0;
		name = "김요한";
		System.out.println("매개변수가 한개(int)");
		
	}

	Aaa(int num, double dou){
		this.num = num;
		this.dou = dou;
		name = "김요한";
		System.out.println("매개변수가 2개인 생성자(int,double)");
	}
	
	Aaa(int num, String str){
		this.num = num;
		this.dou = dou;
		name = "김요한";
		System.out.println("매개변수가 2개인 생성자(int,double)");
	}
	
	Aaa(int num, double dou, String name){
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자 (int,double,String)");
	}
	
	//가변인자(varargs)오버로딩
			/* 메서드의 
			  매개변수가 몇개가 들어올지 모를때는 가변인자를 사용 함
			 */
	void method(int...num) { // 인자가 들어와도 되고 여러개 들어와도 됨 0개 이상
		System.out.println("인자가 0개 이상");
	}
	void method(String num, String... str) { // 가변인자 사용 예)  int는 반드시 하나는 들어와야하고 String은 안들어와도 되고 여러개 들어가도 된가
		System.out.println("인자가 1개 이상");
	}
	
//	void method(String...str, String num) { 앞에 가변인자때문에 뒤에 매개변수에는 인수가 들어올수없다 그러므로 가변인자는 뒤에 써줘야한다. 오류
//	}
	
	void method(String name, int num, String...str) {
		
	}
	
}



public class T02_main_ConOverloading {
 
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Aaa a1 = new Aaa();
		Aaa a2 = new Aaa(5,10.5,"김요한");
		Aaa a3 = new Aaa(10,"문자열");
		Aaa a4 = new Aaa(50,50.1234);
//		a4.method(1);
//		a4.method();
		
		
		
		
		
		
		
		
	}

}
