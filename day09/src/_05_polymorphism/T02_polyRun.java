package _05_polymorphism;
class Parent {
	void method1() {
		System.out.println("parent method1()");
	}
	void method2() {
		System.out.println("parent method2()");
	}
}

class Child extends Parent{
	@Override //@Override 를 달아서 오버라이드가 됐는지 확인 할 수 있다. 오버라이드가 안됐다면 오류를 띄어서 알려줌 실수를 줄일 수 있음.
	void method2() {//오버라이딩
		System.out.println("child method2()");
	}
	void method3() {
		System.out.println("child method3()");
	}
		
}
public class T02_polyRun {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; // 부모타입으로 형변환
		
		//위에 두줄을 한 줄로 바꿀 수 있다
		Parent parent2 = new Child();
		parent2.method1();
		// 주의 : 오버라이딩한 메소드는 형변환과 상관없이 무조건 오버라이딩한 메소드 호출
		parent2.method2(); // 오버라이딩한메소드는 부모클래스로 형변환했어도 자식메소드로 호출이 된다.
		
		
		
		
	}
}