package _01_HashSet;

import java.util.HashSet;
import java.util.Set;

class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
//		return Objects.hash(age, name); 이름과 나이를 가지고 해쉬코드만듬 // 단축키로 생성한 해쉬코드 오버라이딩 메소드
		return name.hashCode()+age; // 이름으로 해쉬코드만들고 나이를 더함. 이렇게도 가능하다
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return age == member.age && name.equals(member.name);
		}
		return false;
	
}

}


public class T03_HashSet_hashcodeOverride {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		
		
		System.out.println("size : "+set.size());
		for(Member element : set) {
			System.out.println(element); // 출력시 하나의 주소만나온다 . set에 들어간 두개의 값이 같아 같은 주소로 인식하기 때문 size가 1로 출력되는것도 같은이유
			System.out.println(element.name + ", "+ element.age);
		}// set에서 for문을 사용할 순 있지만 비효율적임.
		
		
		
	}

}
