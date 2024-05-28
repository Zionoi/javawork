package _02_ArrayList;

import java.util.ArrayList;

public class T02_ArrayList {

	public static void main(String[] args) {
//		<제네릭> 안넣고도 생성은 가능하나 권장하지 않음
//		 매개변수에 어떠한 객체라도 받겠다는 뜻
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(45.76);
		list.add("6");
		list.add(Integer.valueOf(7));
		list.add(new String("98"));
		
		//위에 들어올 자료형이 여러개일 경우에는 가장 상위 클래스인Object로 설정한다
		Object obj = list.get(0);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		int num1 = (int)list.get(0); // int형으로 형변환
		double dou = (double)list.get(1);// 실수형으로 형변환
		int num2 = Integer.parseInt((String)list.get(2));// list.get(2)는 객체자료형임으로 String으로 강제형변환해야 Integet.parseInt 메소드를 사용해 int형으로 바꿀수 있다
		int num3 = (int)list.get(3);
		int num4 = Integer.parseInt((String)list.get(4));
		
		System.out.println("합계 :" + (num1+dou+num2+num3+num4)); // 위처럼 객체자료형을 일반자료형으로 언박싱해주면 연산 가능하다
		
		
		
		
		
		
		
		
		
		
		
	}

}
