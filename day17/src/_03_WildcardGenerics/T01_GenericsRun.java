package _03_WildcardGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		Applicent<Person> ap = new Applicent<Person>(new Person());
//		Applicent<Student> ap2 = new Applicent<>(new Person());// 제네릭에 해당하는 자료형으로 매개변수에 객체생성할때 자료형 맞춰줘야한다. 부모관계여도 안됨
		Applicent<Student> ap3 = new Applicent<>(new HighStudent()); // 자식관계일땐 가능
		Course.registerCourse(new Applicent<Person>(new Person())); 
		
		//모든사람 신청 가능
		Course.registerCourse(new Applicent<Person>(new Person()));
		Course.registerCourse(new Applicent<Worker>(new Worker()));
		Course.registerCourse(new Applicent<Student>(new Student()));
		Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
		System.out.println("-----------------------------");
		
		
		// 학생만 신청가능
//		Course.registerCourse2(new Applicent<Person>(new Person())); // Course2는 Student와 Student를 상속받은 객체만 들어올 수 있다// 부모는 안됨
		Course.registerCourse2(new Applicent<Student>(new Student())); 
		Course.registerCourse2(new Applicent<HighStudent>(new HighStudent())); 
		Course.registerCourse2(new Applicent<MiddleStudent>(new MiddleStudent())); 
		System.out.println("-----------------------------");
		
		
		// 직장인과 일반인만 신청 가능
		Course.registerCourse3(new Applicent<Person>(new Person())); 
		Course.registerCourse3(new Applicent<Worker>(new Worker())); 
//		Course.registerCourse3(new Applicent<Student>(new Student())); Couse3은 Worker와 super를 사용해 Worker의 부모클래스만 들어올 수 있다 *Course 클래스 확인하기
//		Course.registerCourse3(new Applicent<쫄따구>(new 쫄따구())); // super를 쓰면 본인과 부모클래스만 들어올수 있으므로 자녀클래스도 들어 올 수 없다.
		
		
		
		
		
		
		
		
	}

}
