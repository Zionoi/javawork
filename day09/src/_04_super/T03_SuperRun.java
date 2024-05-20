package _04_super;

class Parent3 {
	int x;
	int z;
	Parent3(){
		System.out.println("부모생성자 호출");
		x = 10;
		z = 10;
	}
	
}

class Child3 extends Parent3{
	int x;
	int y;
	Child3() {
		System.out.println("자식생성자 호출");
		x = 10*10;
		y = 10*10;
	}
}

class GrandChild extends Child3{
	int x;
	GrandChild() {
		System.out.println("손자 생성자 호출");
		x = 10*10*10;
		
	}
}

public class T03_SuperRun {

	public static void main(String[] args) {
		GrandChild child = new GrandChild(); //자식생성자를 호출하면 자동으로 부모생성자도 객체생성 된다
		System.out.println(child.x);
//		System.out.println(child.super.x);//super는 메인에서 호출 할 수 없다. super는 상속받은 곳에서만 사용가능
		System.out.println(child.y);//부모클래스
		System.out.println(child.z);//부모클래스의 부모클래스 //변수이름이 다르다면 상속받은 클래스 거슬러올라가서 호출가능
		
		/*
		
	
		*/
		
		

	}

}
