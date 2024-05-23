package _02_StringMethod;

public class T10_substring {

	public static void main(String[] args) {
		// substring // 스트링 s 대문자 아님
		// 
		String str = "spring aws start";
		
		// 인덱스 번호부터 뒤쪽 문자열 전부 반환
		System.out.println(str.substring(7));  // 결과값 : aws start
	
		// 지정한 인덱스안에 문자열을 반환 (시작인덱스는 문자 포함하고 끝나는 인덱스는 문자를 포함하지 않음)
		System.out.println(str.substring(0, 7)); // 결과값 : spring 
		
		
		
		
		
		
		
	}

}
