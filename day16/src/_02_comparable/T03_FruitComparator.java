package _02_comparable;

import java.util.*;
public class T03_FruitComparator {

	public static void main(String[] args) {
													//내림차순 메소드 만들어둔 FruitDescending 클래스 여기다 객체생성
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitDescending());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 7000));
		
		Iterator<Fruit> i = treeSet.iterator();
		while(i.hasNext()) {
			Fruit fruit = i.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}
		
		
		
		/* LIFO 와 FIFO 컬렉션
		 후입선출(LIFO : Last In First Out)	
		 	나중에 넣은객체가 먼저 빠져나가는 구조
		 선입선출(FIFO : First In First Out)
		 	먼저넣은 객체가 먼저 빠져나가는 구조
		 
		 LIFO 자료구조를 제공 => 스택 클래스
		 FIFO 자료구조를 제공 => 큐 인터페이스
		 	
		 
		 Stack
		 	stack<E> stack = new Stack<E>();
		 	stack<E> stack = new Stack<>();
		 E push(E item) 스택에 넣는다
		 E pop() 스택의 맨 위객체를 빼낸다
		 
		
		Queue
			Queue<E> queue = new LinkedList<E>();
			Queue<E> queue = new LinkedList<>();
		 E offer(E item) 스택에 넣는다
		 E poll() 먼저들어온 객체를 빼낸다
		
		
		*/
		
	}

}
