package _02_ArrayList;

import java.util.ArrayList;	// 이런식으로
import java.util.List;		// 하나한 임폴트하기 싫다면

//import java.util.*;      // 이런식으로 java.util의 모든 클래스를 임폴트 할 수 도 있다

class Car {
	
}

public class T01_ArrayList {

	public static void main(String[] args) {
		
		
//			<> 제네릭 :  안에는 객체자료형을 넣어주는 것을 권장함 ex)Integer
//					   여러 자료형을 받을 시 클래스를 만들어객체로 넘겨주는 것을 권장함	

//		ArrayList<객체> 변수명 = new ArrayList<객체>(배열의 갯수);

		
		//Car 객체 자료형만 받겠다는뜻
//		ArrayList<Car> list = new ArrayList<Car>();

				//String 객체만 받겠다는 뜻				15개 만들겠다는 뜻. 배열의 갯수지정 가능. 기본값은 10개
		ArrayList<String> alist = new ArrayList<String>(15);
		
		// 자식객체를 부모타입으로 자동형변환하여 사용가능
		List<String> list = new ArrayList<String>();
		list.add("java"); 		// list[0] 순서대로 인덱스 0번에 배정됨.
		list.add("HTML");	// list[1]
		list.add("database");	// list[2]
		
		//배열 중간에 넣고싶다면
		list.add(1,"객체 모델링");	// list[1]. 기존에 있던 배열들은 하나씩 밀린다. index+1
		list.add("javascript");
		// 배열에 있는 객체 수 알고싶다면
		System.out.println("총 객체 수 : "+list.size());
		
		
		//값을 가지고 올때는 get을 이용해야한다
//		System.out.println(list[3]); // 직졉 index를 사용할 수 없음
		System.out.println(list.get(3)); // 이런 식으로 get(index)메소드를 이용해야함
		
			
		// 리스트의 각 항들을 출력하고싶다면
		
		//일반 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1+ "."+list.get(i));
		}
		System.out.println("______________________");
		int count=1;
		for(String s : list) {
			System.out.println(count++ +"."+s);
		}
		
		System.out.println("______________________");
		//remove
		
		list.remove(2); //해당 인덱스 값 제거. 뒤에 값들이 앞으로 당겨짐
		list.remove(2);
		list.remove("객체 모델링"); //값의 이름을 알고있다면 이런식으로도 지울수 있음
		list.remove(list.get(0)); // 이런식으로도 지울수 있음
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1+ "."+list.get(i));
		}
		
		System.out.println("______________________");
		// add
		list.add("java");
		list.add("Database");
		list.add("HTML");

		for(int i=0; i<list.size(); i++) {
			System.out.println(i+ "."+list.get(i));
		}
		System.out.println("______________________");
		
		// set(index, "넣을 내용") : 해당 인덱스에 기존값을 삭제하고 들어감
		list.set(2, "객체 모델링");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+ "."+list.get(i));
		}
		System.out.println(list.toString());
		
		
		
		
	}

}
