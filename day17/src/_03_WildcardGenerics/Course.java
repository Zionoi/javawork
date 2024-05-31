package _03_WildcardGenerics;

public class Course {
	// 모든 사람이면 등록 가능					//<?> 제네릭 안에 와일드카드를 넣으므로Object는 자동 상속됨
	static void registerCourse(Applicent<?> a) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 course에 등록함"); // .getClass().getSimpleName() 패키지경로가 포함되어있지 않는 클래스 이름만 나옴
	}
	
	// 학생만 등록 가능							<? extends Student : 스튜던트와 스튜던트를 상속받은 객체들만 받겠다
	static void registerCourse2(Applicent<? extends Student> a) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 course2에 등록함");
	}
	
	// 직장인 일반인 등록 가능					// Worker와 Worker의 부모만 가능
	static void registerCourse3(Applicent<? super Worker> a) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 course3에 등록함");
	}
	
	
	
}
