package _01_StringBuffer_bulider;

public class T01_StringBuffer {

	public static void main(String[] args) {
		// StringBuffer클래스의 특징
		/*
			- String처럼 문자형 배열(char[])을 내부적으로 가지고있다
			
			- 그러나, String클래스와 달리 내용을 변경할 수 있다 (mutable)
			
			- 인스턴스를 생성할 때 버퍼(배열)의 크기를 충분히 지정해주는 것이 좋다
			(버퍼가 작으면 성능 저하 - 작업 중에 더 큰 배열의 생성이 필요)
			
			- String 클래스와 달리 equals를 오버라이딩하지 않았다.
			
			자바의정석 StringBuffer클래스의 생성자와 메서드 파워포인트 검색 자료보기
			
			
		
		// Stringbuilder
		 
		 	- StringBuffer와 동일한 기능
		 		StringBuffer에서 쓰레드의 동기화만 뺀 클래스

		*/
	
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2)); //false
		// equals()를 오버라이딩하지 않음(주소가 같은가?)
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));//false
	
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1 == s2 ? " + (s1 == s2));	//false
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));	//true
		System.out.println("---------------------------------------");
		// toString()은 오버라이딩 되어 있음(문자열 반환)
		System.out.println("sb1="+sb1); // abc
		
		
		
		//문자열을 뒤에 추가하고싶을땐 .append()를 사용하면된다. 입력값은 숫자 문자 다 가능
		
		sb1.append("def");
		System.out.println("sb1="+sb1); //abcdef
		
		sb1.append(123); //숫자도 가능
		System.out.println("sb1="+sb1); //abcdef123
		
		sb1.append(true);
		System.out.println("sb1="+sb1); //abcdef123true
		System.out.println("---------------------------------------");
		
		
		
		//delete
		sb1.deleteCharAt(8); //index번호에 해당하는 문자 하나 삭제 
		System.out.println("sb1="+sb1); //abcdef12true
	
		
		sb1.delete(6, 12);
		System.out.println("sb1="+sb1); //abcdef
		
		
		
		//중간에 삽입하려면 insert
		// 		  해당인덱스 앞에 내용삽입 == int offset해당 숫자만큼 떨어뜨려서 삽입
		sb1.insert(1, "java");
		System.out.println("sb1="+sb1); //ajavabcdef
		
		
		//해당글자를 다른글자로 대체해주려면 replace
		
		//replace(index번호부터, index번호까지 삭제후, "문자열 삽입") 
		sb1.replace(5, sb1.length(), " spring");
		System.out.println("sb1="+sb1); //sb1=ajava spring
		
		//문자열 거꾸로 출력할땐 reverse()
		System.out.println("sb1.revers = "+ sb1.reverse()); //gnirps avaja
		
		//StringBuffer크기 가져오려면 capacity()
		//capacity() : StringBuffer객체가 생성될때 크기를 설정안했다면 기본버퍼 크기 16byte로 자동설정된다
		
		StringBuffer sb5 = new StringBuffer(); //기본생성크기 16byte
		StringBuffer sb6 = new StringBuffer("a"); //하나 더 들어가서 17byte
		System.out.println("sb5의 버퍼크기 : "+ sb5.capacity()); //16byte
		System.out.println("sb5의 버퍼크기 : "+ sb6.capacity()); //17byte
		
		StringBuffer sb7 = new StringBuffer(32); // 스트링버퍼 생성시 생성자 매개변수에 숫자를 입력하면 버퍼크기 설정가능
		System.out.println("sb7의 버퍼크기 : "+sb7.capacity()); // 버퍼크기 32byte
		
	
	
	}

}
