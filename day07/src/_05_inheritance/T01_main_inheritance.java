package _05_inheritance;

class A {
	int aa = 10;
}
class B extends A{ //B는 A를 상속받음 
	int bb = 200;  
}
class C extends A{ //C는 A를 상속받음
	int cc = 5000;
}
class D extends C{ // D는 C로부터 상속받음. 그러므로 A도 사용가능
	int dd = 30000;
}

public class T01_main_inheritance {

	public static void main(String[] args) {
		// 클래스를 생성했더라도 별도로 객체생성을 해야 사용가능
		
//		A a1 = new A(); // 객체생성
//		System.out.println("a1.aa : "+a1.aa); 
		
		B b1 = new B(); // 객체생성
		System.out.println("b1.aa : "+b1.aa);
		System.out.println("b1.bb : "+b1.bb);

		C c1 = new C(); // 객체생성
		System.out.println("c1.aa : "+c1.aa);
		System.out.println("c1.cc : "+c1.cc);
		
		D d1 = new D(); // 객체생성
		System.out.println("d1.aa : "+d1.aa);
		System.out.println("d1.cc : "+d1.cc);
		System.out.println("d1.dd : "+d1.dd);
		
		
		
		
		
	}

}
