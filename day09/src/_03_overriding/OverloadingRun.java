package _03_overriding;

class Loading {
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str);
	}
}

class LoadingChild extends Loading{ 
	//부모클래스의 메소드와 매개변수 자료형이 다르므로 오버로딩
	void show (int price) { // 오버로딩
		System.out.println("자식클래스 메소드 : " + price);
	}
		
		//메소드이름과 자료형이 같으므로 오버라이딩
		void show(String str) { // 오버라이딩
			System.out.println("자식클래스 메소드 : "+str);
		}
		
	
}


public class OverloadingRun {
	public static void main(String[] args) {
		LoadingChild lChild = new LoadingChild();
		lChild.show(25000);//오버로딩
		lChild.show("리액트");//오버라이딩

	}

}
