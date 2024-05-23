/*package _01_langPackage;

class Point implements Cloneable { // clone사용시 반드시 Cloneable로 implements 해야함
	int x;
	int y;
	
	Point(){}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = "+x+", y = "+y;
	}
	
	
	@Override
	public Object clone() {//어떤객체가 들어올지 모르므로 가장 최상위 클래스인 Object를 사용해 반환한다.
		Object obj = null;
		try {
			obj = super.clone();		// 부모클래스 호출해서 리턴 해주면됨 (왜?)
		} catch (CloneNotSupportedException e) { 
			e.printStackTrace();
		}
		return obj;
	}
	//클론사용시 이 형태 그대로 사용하면 됨.
	
}


public class T04_clone {

	public static void main(String[] args) {
		//clone()
		
			객체 자신을 복제해서 새로운 객체를 생성하는 메서드
			Cloneable인터페이스를 구현한 클래스의 인스턴스만 복제할수있다
			Object클래스에 정의된 clone()은 인스턴스변수의 값만을 복제한다
		 	인스턴스변수가 참조형일 때, 참조하는 객체도 복제되게 오버라이딩 해야함
		
		
		Point original = new Point(3,5);
		Point copy = (Point)original.clone(); // 오버라이딩한 clone 호출 부모클래스 Object에서  자식타입Point로 바꿔줘야함
		Point p1 =new Point();
		 
		 
		System.out.println(original);
		System.out.println(copy);
		System.out.println(p1);
		
		p1.x = 10;
		p1.y = 20;
		
		copy = (Point)p1.clone();
		System.out.println(p1);
		
		
	}

}
*/