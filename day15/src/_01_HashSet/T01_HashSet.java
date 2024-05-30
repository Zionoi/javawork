package _01_HashSet;

import java.util.*;

class ClassA{
	String str;
	
	public ClassA() {}
	public ClassA(String str) {
		this.str = str;
	}
	
	
	
}



public class T01_HashSet {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		ClassA ca1 = new ClassA("java");
		set2.add(ca1);
		set2.add(new ClassA("oracle"));
		set2.add(new ClassA("qwer"));
		set2.add(new ClassA("asdf"));
		set2.add(new ClassA("zxcv"));
		
		int size = set2.size();
		System.out.println("set2에 저장된 객체의 갯수 : "+size); // HasgSet은 인덱스번호가 없기때문에 객체를 가져오려면 iterator를 사용해야한다
		/*	
		//			제네릭<자료형>			set2에 있는걸 i에 담아준다
			Iterator<ClassA> i = set2.iterator();
			System.out.print("set2 출력 : ");
			while(i.hasNext()) {
				//꺼내올땐 next()
				ClassA ca = i.next();
							//그냥 ca를 호출하면 들어있는 주소가 출력됨 //.변수명까지 같이 적으면 제대로출력된다
				System.out.print(ca.str+" ");
			}
			*/
		// 출력시 계속 호출이 되도록 메소드로 구현하면 편하다 (아래에 구현해둠)
		
		iteratorPrint(set2.iterator());
		
		set2.add(new ClassA("aws"));
		iteratorPrint(set2.iterator());
		

		// 삭제 : oracle
		
		Iterator<ClassA> i = set2.iterator();
		while(i.hasNext()) {
			ClassA ca = i.next();
			String s = ca.str;
//			if(s.equals("oracle"))
			// 그냥 ca를 쓰면 주소랑 비교하게됨. str을 제대로호출해야 이름 비교 가능
			if(ca.str.equals("oracle"))
//				set2.remove(ca); // 바로 set2에서 지우면 오류가 뜸. 직접set2에 접근할수없고 변수 Iterator에 넣고 지워야함
				i.remove(); // 이렇게 해야함
		}
		
		iteratorPrint(set2.iterator()); //oracle이 삭제됨
		
		
	}
	//메인메소드
	
	// static이 안붙어있으면 메인클래스에서 사용시 객체생성을 따로 해야한다.
	static void iteratorPrint(Iterator<ClassA> i) {
		while(i.hasNext()) {
			ClassA ca = i.next();
			System.out.print(ca.str+" ");
	}
		System.out.println();
	}
	
	
	
	
	
	
}
