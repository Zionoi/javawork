package _05_singleton;

public class T01_main_singleton {

	public static void main(String[] args) {
//		T01_api_singleton s1 = new T01_api_singleton(); //오류. 생성자를 private로 막아두었기때문
		T01_api_singleton singleton1 = T01_api_singleton.getSingleton(); //객체의 주소 반환됨
		T01_api_singleton singleton2 = T01_api_singleton.getSingleton(); 
		T01_api_singleton singleton3 = T01_api_singleton.getSingleton(); 
		
		// 주소가 같은가?
		if(singleton1 == singleton2)
			System.out.println("같은 객체를 가리키고 있음");
		else
			System.out.println("다른 객체");
	
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);// 같은 주소가 출력됨.
	
	
	
	}

}
