package _03_LinkedList;

import java.util.*;

public class T01_LinkdList {

	public static void main(String[] args) {
		/*
		LinkedList
		-인접 객체를 체인처럼 연결해서 관리
		-객체 삭제와 삽입이 빈번한 곳에서 ArrayList보다 유리
		-검색할때는 ArrayList가 더빠르다
		*/
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(0,1);// 인덱스번호 0에 , 값 1 추가
		list.addFirst(0);// addFirst맨앞에 추가
		list.addLast(20); // add나 addLast나 뒤에추가하는것 같기때문에 잘 사용하지 않는다
		list.add(50);
		System.out.println(list);
		
		list.remove(1); // index 1번 삭제
		System.out.println(list);
		list.remove(); // 맨 앞노드 삭제. 아래것보다 얘를 좀더 많이 쓴다고함
		System.out.println(list);
		list.removeFirst(); // 맨 앞노드 삭제
		System.out.println(list);
		list.removeLast(); // 맨 뒷 노드 삭제
		System.out.println(list);
		
		list.add(10);
		list.add(0,1);// 인덱스번호 0에 , 값 1 추가
		list.addFirst(0);// addFirst맨앞에 추가
		list.addLast(20); // add나 addLast나 뒤에추가하는것 같기때문에 잘 사용하지 않는다
		list.add(50);
		//LinkedList는 객체별로 주소로 연결되어있음. 검색시 1번부터 연결된 주소로 차례대로 순회를도는데 순서대로 저장되는게 아니기때문에 자료가 많아지면 검색속도가 느려짐
		//iterator 이터레이터를 사용하면 위에 문제점을 해결 할 수 있다
		
		//gpt설명
		// LinkedList는 각 요소가 이전 요소와 다음 요소에 대한 참조를 가지고 있는 이중 연결 리스트입니다.
		// 검색 시 리스트의 처음이나 끝에서부터 순차적으로 탐색하므로, 요소가 많아질수록 검색 속도가 느려집니다.
		// 그러나 삽입과 삭제는 특정 위치에서 빠르게 수행할 수 있습니다.
		// Iterator를 사용하면 컬렉션을 안전하고 효율적으로 순회할 수 있습니다.
		// Iterator를 통해 요소를 순회하면서 중복을 체크하거나 조건에 따라 요소를 제거할 수 있습니다.
		// 모든 요소를 한 번씩 접근하여 작업을 수행하고 종료하는 형태입니다.
		
		
		// for문을 쓰면 비효율적 검색 속도 느려짐 : i번째 주소는 i-1번에 들어있어서 i-1을 먼저 찾아야 되고 i-1의 주로를 찾아려면 i-2를 먼저찾아야됨
		//									결과적으로 0~i까지 다시 돌아야 됨
		for(int i=0; i<list.size(); i++) {
			list.get(i);  // 이경우에 list의 i 인덱스값을 가져오려면 반복시마다 매번 객체에 처음부터 돌아가서 차례대로 주소를 찾아가야하기때문에 반복수가 i펙토리얼이 된다. 굉장히 비효율
		}											
		
		//Iterator : 리스트를 순회할 수 있게 해주는 클래스
		Iterator<Integer> iterator = list.iterator();	// list의 객체를 넣어줌
	
		// hasNext()  => 남아있는객 체가 있는가? true false 반환
			while(iterator.hasNext()) {
				// next() => 순회하면서 객체를 얻어옴
				System.out.print(iterator.next() + " ");
			
			
		}
		
	}

}
