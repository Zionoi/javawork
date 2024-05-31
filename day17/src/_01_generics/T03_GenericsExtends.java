package _01_generics;

import java.util.*;

class Fruit {
	@Override
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit { //Fruit 상속받음
	@Override
	public String toString() {
		return "Apple";
	}
}
class Banana extends Fruit { //Fruit 상속받음
	@Override
	public String toString() {
		return "Banana";
	}
}
class Tjoeun { //상속 x
	@Override
	public String toString() {
		return "tjoeun";
	}
}
class Box2<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) { //사용자로부터 list의 몇번째 index값을 받을지 입력받고 해당 값 반환 메소드
		return list.get(i);
	}
	int size() { // list 사이즈 반환 메소드
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
	
	
	
}

public class T03_GenericsExtends {

	public static void main(String[] args) {
		Box2<Fruit> fruitBox = new Box2<>();
		Box2<Apple> appleBox = new Box2<>();
		Box2<Tjoeun> tjoeunBox = new Box2<>();
		
		fruitBox.add(new Fruit()); 
		fruitBox.add(new Apple()); 
		fruitBox.add(new Banana()); //상속관계라 추가 가능
		
//		fruitBox.add(new Tjoeun()); //Fruit과 상속관계가 아니기때문에 오류 발생 
	
		appleBox.add(new Apple()); //애플만 담을 수 있다 다른건 안됨
//		appleBox.add(new Fruit()); //상속관계여도 부모는 super를 넣지 않으면 넣을수 없음
		
		tjoeunBox.add(new Tjoeun()); // Tjoeun만 담을수 있다
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(tjoeunBox);
		
		System.out.println(fruitBox.size());
		
		
		
		
		
		

	}

}
