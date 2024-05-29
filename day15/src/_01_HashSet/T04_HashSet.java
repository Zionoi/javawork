package _01_HashSet;

import java.util.*;

public class T04_HashSet {

	public static void main(String[] args) {
								//<제네릭>안에 한쪽만 자료형 적어도 자동으로 반대쪽에 자료형을 넣어준다
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			
			set.add((int)(Math.random()*45)+1);// 1~45의 랜덤 정수를 set에 add함 // set을 Integer로 생성했기때문에 랜덤정수는 int형이지만 set로 들어갈때 자동으로 Integer wrapper클래스로 형변환되서 들어간것
		}// set에는 중복되는값은 안들어감. size가 5가 될때까지 중복정수는 거르면서 set.add 반복됨
		System.out.println(set);
		/*		
				set.clear();
				
				for(int i=0; set.size()<6;i++) {
					set.add((int)(Math.random()*45)+1);
				}// 이렇게되면 i가5가 될때까지 반복하나 중복값은 들어가지 않기때문에 반복문 끝난후 set의 size가 얼마가 될지 알 수 없다.
				System.out.println(set);
				*/
		//set은 순서가 없어서 그자체로는 정렬하지 못함
		// 정렬을 하려면 List로 변환해줘야 함 (ArrayList, Vector, LinkedList 모두 사용가능
		
		List list = new ArrayList(set);
		Collections.sort(list);//list 정렬하는 메소드
		
		System.out.println(list);
		
		
		
	}

}
