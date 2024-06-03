package _05_supplier;

import java.util.function.*;

public class T01_supplier {

	public static void main(String[] args) {
		// supplier : 매개변수 없고 리턴값만 있는 함수적 인터페이스
//	반환형이있다면 제네릭에 그 객체 자료형 써주면 됨		//반환형이 있다면 그 자료형에 맞게 강제형변환 해야함
		Supplier<String> sup = () -> { return "aaa"; }; 
//		Supplier<String> sup1 = () -> "aaa";  // 한줄이면 이렇게 줄일수 있음

		sup.get(); // 매개변수없으니 그냥 쓰면 됨.
		System.out.println(sup.get()); // 그자체로 사용하거나
		String str = sup.get(); // 또는 변수에 담아서 써도됨
 		System.out.println(str);
 		
 		
 		//반환형이 int일 경우 
// 						매개변수 없으니 ()괄호만
 		IntSupplier isup = () -> 5;
 		IntSupplier isup2 = () -> (int)(Math.random() * 45 +1);
 		System.out.println(isup2.getAsInt());// IntSupplier 에서는 변수사용시 그냥 get이 아니라 getAsInt()라는 메소드가 따로 있음
 		
 		
 		//더블이나 참거짓 사용시 각각 자료형 적어주면된다.
 		BooleanSupplier bsup = () -> 5 > 6; // 참 거짓으로 반환
 		System.out.println(bsup.getAsBoolean()); // getAsBoolean(); 각각 자료형마다 메소드이름 다르니 확인하기
 		
 		
 		
 		
 		
	}

}
