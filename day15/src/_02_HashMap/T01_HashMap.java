package _02_HashMap;

import java.util.*;

public class T01_HashMap {

	public static void main(String[] args) {
		//map 컬렉션 여러 메소드들 자바의정석 ppt 참고. 
//			   <키 자료형, 값 자료형>
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
//		map은 add가 아니라 put으로 입력할수있다.
		map.put("아무개", 95);
		map.put("아무개", 90);
		map.put("아무개", 85);
		map.put("아무개", 67);
		System.out.println("size : "+map.size());
//		map은 키값이 같으면 새로 추가되는게 아닌 덮어쓰기가 되기때문에 위처럼하면 size는 1이 된다
		map.put("홍길동", 58);
		map.put("이소영", 93);
		map.put("최서진", 45);
		System.out.println("size : "+map.size());
//		값을 알고싶다면 get(키)를 넣어주면 값이 리턴된다
		System.out.println("점수 : "+map.get("홍길동"));
		
		
		
		System.out.println(map); // overriding이 되어있어서 주소가아닌 키, 값이 나온다. 배열이 아니기 때문에 []가 아닌 {}로 출력됨
		
		//remove(키) : 객체삭제
		map.remove("이소영");
		System.out.println(map);

		/*
		//clear 전체삭제
		map.clear();
		System.out.println(map);
		*/
		
		// 배열이 아니기때문에 iterrator를 사용한다
		
		
		
		
	}

}
