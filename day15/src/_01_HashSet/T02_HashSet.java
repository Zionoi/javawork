package _01_HashSet;

import java.util.*;

public class T02_HashSet {

	public static void main(String[] args) {
//		int[] inte = {1,23}; // Set에는 객체만 들어올수 있기때문에 int가 아닌 Integer로 객체생성해야한다.
		String[] inte = {"1", "23"}; // String[]으로 객체생성하면 편하다.
		Object[] objArr = {"1", Integer.valueOf(1),"2","2","2","3","3","4","4","4","4"};
		
		Set set1 = new HashSet();
		
//		set1.add(inte[0]);
		
		//objArr를 다 넣어주려면 for사용하면된다
		set1.add(objArr[0]);
		
		for(Object obj : objArr) {
			set1.add(obj);
		}
			
//		iteratorPrint(set1.iterator()); // 중복값은 제외하고 출력하는데 1은 두개가 출력됨. 이유는 String 1과 Integer 1 은 자료형이 다르므로 다른 객체라고 인식하기 때문
		
		
		//객체 전체 삭제
		set1.clear();
		System.out.println("set1의 size : "+set1.size());
		
		
		
		
		
	}
	//메인메소드
	
		// static이 안붙어있으면 메인클래스에서 사용시 객체생성을 따로 해야한다.
		static void iteratorPrint(Iterator<Object> i) {
			while(i.hasNext()) {
				Object ca = i.next();
				System.out.print(ca+" ");
		}
			System.out.println();
}
}