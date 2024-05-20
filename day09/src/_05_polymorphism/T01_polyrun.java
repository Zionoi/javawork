package _05_polymorphism;

class A {int a=1;}
class B extends A {int b=2;}
class C extends A {int c=3;}
class D extends B {int d=4;}
class E extends C {int e=5;}

public class T01_polyrun {
	public static void main(String[] args) {
		// 자동 형변환 : 자식을 부모 타입으로 형변환
		B b = new B(); 
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // B 클래스자료형이었던 b를 부모클래스인 A클래스 자료만 사용하겠다는 의미
		A a2 = c; // 위와 마찬가지 A클래스만 사용하겠다는 뜻
		A a3 = d;	
		A a4 = e;
		
//		B b1 = c; // 오류 상속관계가 아님
//		C c1 = d; // 이것도 오류 형변환은 부모클래스로만 가능
		
		System.out.println(b.a);//사용가능
		System.out.println(b.b);//사용가능
		System.out.println(a1.a);//사용가능
//		System.out.println(a1.b);// 사용불가. 위에 A클래스로 형변환했기때문에 B클래스의 자료는 사용할 수 없음
		System.out.println(a2.a); // c변수 사용불가
		System.out.println(a3.a); // d변수 사용불가
		System.out.println(a4.a); // e변수 사용불가
		
		
		
		
		// 다형성
				/*
					class Car() {}
					class ChildCar extends Car() {}
					class main() {
					
				  클래스의 형변환
					Car car = new ChildCar() // Car 클래스만 사용가능 //자식클래스에서 부모클래스로 형변환한것
					ChildCar chCar2 = (ChildCar)new Car() // 사용가능 자식타입으로 객체생성(부모객체도 같이 생성) 생성후 부모객체는 사용안하겠다고 선언했다가 다시 사용하겠다고 선언한것
					ChildCar Car2 = new Car() // 오류 // 부모클래스에서 자식클래스로 형변환은 안됨
				*/
		
		
	}

}
