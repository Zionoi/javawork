package _02_StringMethod;

public class T08_lastIndexOf {

	public static void main(String[] args) {
		// lastIndexOf : 지정한 문자열을 오른쪽부터 검색해서 존재하는위치 인덱스번호 반환. 없으면 -1 반환
		
		
		String str = "abcabcabca";
		
		System.out.println(str.lastIndexOf('a')); //9
		System.out.println(str.lastIndexOf("abc")); //스트링도 가능 6
		
		// lastIndexOf(String, fromIndex)
		// fromIndex는 index 앞을 보고, 문자열 걸쳐져 있으면 그 문자열도 찾는다
		System.out.println(str.lastIndexOf("abc",3)); //몇번인덱스부터 찾을지도 설정할수 있음
		System.out.println(str.lastIndexOf("a",6)); //찾고자하는 문자열이 설정한 인덱스에 걸쳐져있어도 시작인덱스 기준으로 문자열완성후 반환 6
		
		

			
				
	}

}
