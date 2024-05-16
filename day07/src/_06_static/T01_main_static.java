package _06_static;

public class T01_main_static {

	public static void main(String[] args) {
		T01_api_static as1 = new T01_api_static();
		T01_api_static as2 = new T01_api_static();
		as1.num = 1000; //인스턴스 필드 변수 변경
		System.out.println("as1.num : "+as1.num);// as1, as2 각각 다른 값이 출력됨
		System.out.println("as2.num : "+as2.num);

		as1.sNum = 20000; // static 정적필드인 sNum은 as1객체에서 수정해도 as2객체에서도 값이 변해서 출력됨
		System.out.println("as1.sNum : "+as1.sNum);
		System.out.println("as2.sNum : "+as2.sNum);
		// 정적필드 변수는 클래스명으로도 호출가능
		System.out.println(T01_api_static.sNum);
				
		
	}

}
