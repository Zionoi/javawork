package _04_document;

public class T01_api_document {
// 사용자가 문서를 객체로 가져오고
// 입력값이 없으면 문서이름을 제목없음1 ,제목없음2...로 나오게
	
	String name;
	static int count;
	
	T01_api_document() {
		System.out.println("제목없음"+ ++count);
	}

	T01_api_document(String name) {
		this.name = name;
		System.out.println("문서 "+this.name +" 생성됨");
	}
}
