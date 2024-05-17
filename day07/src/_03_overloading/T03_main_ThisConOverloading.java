package _03_overloading;


class ThisAaa {//클래스를 복사 붙여넣기했을때 오류나는이유중에 하나는 클래스 이름이 같기때문임. 같은패키지 안에서는 이름이 같은 클래스가 있을수 없다
	int num;
	double dou;
	String name;
	
	// 생성자에서 this() : 다른 생성자 호출
	// this()는 맨 첫줄에 넣어야 됨 다른변수가 위에있으면 오류남
	ThisAaa() {
		this(1,1.0,"홍길동"); // ***얘가
		num=1;
		dou = 1.0;
		name = "김요한";
		System.out.println("매개변수가 없는 생성자");
	}
	
	ThisAaa(int num){
		this(num,1.0,"홍길동"); // 처음 int에 사용자가 넣은 입력값을 넘겨줘야함
	/*  this.num = num;
		dou = 1.0;
		name = "김요한";*/
		System.out.println("매개변수가 한개(int)");
		
	}

	ThisAaa(int num, double dou){
		this(num,dou,"홍길동");
		/*	this.num = num;
			this.dou = dou;
			name = "김요한";*/
		System.out.println("매개변수가 2개인 생성자(int,double)");
	}
	
	ThisAaa(int num, double dou, String name){  // ***얘를 호출함
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자 (int,double,String)");
	}
}



public class T03_main_ThisConOverloading {
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAaa a1 = new ThisAaa();
//		ThisAaa a2 = new ThisAaa(5,10.5,"김요한");
//		ThisAaa a4 = new ThisAaa(50,50.1234);

		
		
		
		
		
		
		
	}

}
