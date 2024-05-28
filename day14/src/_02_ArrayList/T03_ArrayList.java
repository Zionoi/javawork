package _02_ArrayList;
import java.util.*;

public class T03_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		
		
		//      어디서부터 어디까지 가져오시오 뒤에 인덱스는 포함하지 않는다
//		list.subList(3, 6);
		List<Integer> list2 = new ArrayList<Integer>(list.subList(3, 6)); //클래스 생성할때 배열갯수를 이런식으로 설정할수도 있다
		System.out.println(list2.toString());
		
		
		List<Integer> listran = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			int random = (int)(Math.random()*10);
			listran.add(random);
		}
		System.out.println(listran.toString());
		
		Collections.sort(listran);
		
		System.out.println(listran);
		
		
		//containsAll() : list는 list2의 요소를 모두 가지고 있는가?
		System.out.println("list는 list2의 요소를 모두 가지고 있는가? " + list.containsAll(list2));
		
		//retainAll : 해당 요소는 제외하고 나머지만 가져오려면(교집합만 가져올때 사용). 교집합만 남기고 모두 삭제
		System.out.println("교집합 : " + list.retainAll(listran));
		System.out.println(list);
		System.out.println(list2); // retainAll을 사용해서 두배열의 교집합을 제외하곤 값이 삭제됨
		
		
		//.clear();기존에 있던 리스트 값 제거
		list.clear();
		list2.clear();
		
		for(int i=0; i<10; i++) {
			list.add(i+1);
		}
		
		
		
	
		list2.add(7);
		list2.add(3);
		
		//문제. list2에 들어있는 객체가 list에 있으면 삭제후 나머지 출력
		/*		int i=0;
				for(int li2 : list2) {
					if(list.contains(li2))
						System.out.println("실행됨");
						list.remove(li2.get(i));
				}System.out.println(list.toString());
				*/
		/*		for(int i=0;i<list2.size();i++) {
					list.contains(list.get(0));
					list.contains(list.get(1));
					if(list.contains(list.get(i))) // 이렇게 돌면서 지우면 지운자리에 뒤에 인덱스값들이 당겨져 오므로 원하는값이 안나올 가능성이 있다
						list2.remove(i);
				}*/
		for(int i=list2.size()-1; i>=0; i--) { //이렇게 배열의 뒷부분부터 돌게하면 지워도 인덱스 값들이 앞으로 밀릴 걱정하지 않아도 된다.
			if(list.contains(list2.get(i))) 
				list2.remove(i);
		}

		System.out.println(list);
		System.out.println(list2);
	
	
	}

}
