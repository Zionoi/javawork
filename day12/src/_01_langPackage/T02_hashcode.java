package _01_langPackage;

public class T02_hashcode {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc"); // new로 각자 객체생성했으므로 원래는 둘다 주소가 달라야하지만
		String str3 = str1;
		
		// String클래스는 equals, hashCode를 오버라이딩 해놓은 상태라 두개다 같은 객체로 인식
		System.out.println(str1.equals(str2)); // 미리 재정의 해둔 상태여서 주소가 같다고 나온다
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//identityHashCode : static 메소드 - 원래 객체의 해시코드(고유)를 출력해주는 기능
		// 출력해보면 원래는 다른 객체이기때문에 다른 해시코드가 나옴
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3)); // str1과 같다 같은 주소를 넘겨받았기 때문에
		//System : 클래스 이름
		//

	}

}
