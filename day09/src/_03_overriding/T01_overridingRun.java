package _03_overriding;

class Over { //부모 클래스
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
}

class OverChild extends Over { //자식클래스
	void show(String adb) {// 오버라이딩시 변수이름은 달라도 상관없음
		System.out.println("자식클래스 메소드 : "+adb);
	}
	
}

public class T01_overridingRun {

	public static void main(String[] args) {
		OverChild oChild = new OverChild();
		oChild.show("자바 프로그래밍");//자식클래스 메소드가 호출됨
		
		Over over = new Over();
		over.show("오라클");
		
		
		
		
		
		
		//overriding 오버라이딩이란?
		/*
		조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경하는 것을 
		오버라이딩이라고 한다
		ex)
		
		class Point{
		int x;
		int y;
		
		String getLocation() {
		 return "x : " + x + " y : " +y;
		}
		
		class Point3D extends Point {
		int z;
		String getlocation() {
		return "x : " + x + " y : " +y + "z : "+z;
		}
		
		{
		
		오버라이딩 조건 (상속일때 사용)
		1. 선언부가 같아야 한다. (이름, 매개변수, 리턴타입)
		2. 접근제어자를 좁은 범위로 변경할 수 없다.
			-조상의 메서드가 protected라면 범위가 같거나 넓은 
			protected나 public으로만 변경할수 있다
		3. 조상의 메서드보다 많은 수의 예외를 선언할 수 없다.	
		
		
		*/
		
		/*
		오버로딩 vs 오버라이딩
		오버로딩 - 기존에 없는 새로운 메서드를 정의하는 것 (new)
		오버라이딩 - 상속받은 메서드의 내용을 변경하는 것(change, modify)
		
		
		*/
	

	}

}
