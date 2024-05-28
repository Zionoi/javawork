package _02_wrapperClass;

import java.util.regex.Pattern;

public class T03_regular {

	public static void main(String[] args) {
		// 정규표현식
		
		//() : 그룹핑
		// \d : 숫자중 하나 == [0-9] 들어오시오
		//{} : 숫자 자리수 안에숫자만큼 설정
		//{n,m} : n개 부터 m개 까지 들어오시오
		
		//전화번호 정규표현식 구현방법
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		
		String data = "02-123-5675";
		
		boolean result = Pattern.matches(regExp, data); //정규식 비교하는 메소드 boolean으로 반환된다
		System.out.println(result);
		
		if(result)
			System.out.println("정규식과 일치합니다");
		else
			System.out.println("정규식과 일치하지 않습니다");
		
		
		
		// 이메일체크
		// 문자나 숫자 1개이상 @ 문자나숫자 . 문자 
		// 문자나 숫자 1개이상 @ 문자나숫자 . 문자 . 문자
		//ex) sample123@google45.com
		//ex) sample123@google.com
		//ex) sample123@google.or.kr
		
		// \\w : 문자나 숫자만 들어올수있는 정규식
		// + : +가 붙으면 무조건 한개 이상 들어와야한다
		//^ : ^ 헷이 []안에 들어있지않으면 무조건 이걸로 시작해야한다는 뜻임 
		// 		^이 []안에 들어있으면 해당 글자는 빼라는 뜻
		//이메일체크
		regExp = "^[a-zA-Z0-9]+\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		data = "kyh00827@google.com";
		result = Pattern.matches(regExp, data); //정규식 비교하는 메소드 boolean으로 반환된다
		System.out.println(result);
		
		if(result)
			System.out.println("정규식과 일치합니다");
		else
			System.out.println("정규식과 일치하지 않습니다");
		
		
		
		
		
		
		
		
	}

}
