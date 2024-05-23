package _02_StringMethod;

public class T01_indexOf {

	public static void main(String[] args) {
		// indexOf : 검색한 문자열이 존재하는지 확인후 인덱스 위치를 알려준다. 인덱스는 0부터 시작. 존재하지 않으면 -1리턴
		// 			
		String str = "ai program";
		int index = str.indexOf("program");
		System.out.println(index);
		
		index = str.indexOf("abc");
		System.out.println(index);
		
		if(str.indexOf("java")<0)
			System.out.println("자바프로그램이 아닙니다.");
		else
			System.out.println("자바프로그램입니다");
		
	}

}
