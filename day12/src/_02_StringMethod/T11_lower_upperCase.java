package _02_StringMethod;

public class T11_lower_upperCase {

	public static void main(String[] args) {
		// 대문자를 소문자로 소문자를 대문자로
		
		String upper = "Java program";
		String lower = upper.toLowerCase();
		System.out.println(lower); // upper에 있는 문자열을 전부 소문자로 변환하시오.
		
		System.out.println(lower.toUpperCase());// lower에 있는 문자열을 전부 대문자로 변환하시오
		
		
	}

}
