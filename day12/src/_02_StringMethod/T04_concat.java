package _02_StringMethod;

public class T04_concat {

	public static void main(String[] args) {
		// concat : 문자열을 연결하여 하나의 문자열로 변환. 괄호안에 있는 문자열을 뒷쪽에 붙여줌
		String str1 = "혼자 공부하는 ";
		String conStr = str1.concat("React");
		System.out.println(conStr);
		
		System.out.println(str1.concat("Spring")); 
	}

}
