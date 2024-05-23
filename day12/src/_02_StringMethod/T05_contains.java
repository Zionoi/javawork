package _02_StringMethod;

public class T05_contains {

	public static void main(String[] args) {
		// contains : 문자열 안에 찾고하는 문자열이 포함되어 있는지 검사 반환형은 있으면 true, 없으면 false
		String str = "JSP 웹 프로그래밍";
		boolean result = str.contains("웹");
		System.out.println(result);
		
		if(str.contains("웹"))
			System.out.println("웹페이지를 만드는 프로그램");
		else
			System.out.println("기타 프로그램");
		
		
	}

}
