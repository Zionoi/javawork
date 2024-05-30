package _02_comparable;

import java.util.*;
		//클래스에서 인터페이스 구현할때는 implements를 사용한다
class Person implements Comparable<Person> {
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int compareTo(Person o) {
		if(age < o.age)
			return -1;
		else if(age == o.age)
			return 0;
		else
			return 1;
	}
	
}

public class T01_comparable {

	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<Person>();
		
		treeset.add(new Person("홍길동", 45));
		treeset.add(new Person("아무개", 36));
		treeset.add(new Person("나자바", 28));
		
		Iterator<Person> iterator = treeset.iterator(); //Iterator에 넣음
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : "+ person.age); //Tree로 되어있는건 정렬이 돼서 출력됨.
		}
		
		
		
		
		

	}

}
