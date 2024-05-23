package _02_StringMethod;

public class T03_charArray {

	public static void main(String[] args) {
		// chatArray : char배열을 스트링으로
		
		String str = new String("혼자 공부하는 SQL");
		
		char[] chArray = {'혼','자','J','S','P'};
		String str2 = new String(chArray); // 자동으로 스트링변환후 문자열 출력
		
		System.out.println(str2);

		char ch = str.charAt(3);
		System.out.println(ch);
		
	}

} 
