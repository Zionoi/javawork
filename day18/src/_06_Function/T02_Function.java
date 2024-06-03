package _06_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class T02_Function {
//	static 클래스변수로 만듬/				asList : 배열을 만드는 매서드
	static List<Student> list = Arrays.asList(
			new Student("홍길동", 79, 100),
			new Student("박길동", 84, 89),
			new Student("김요한", 90, 87),
			new Student("아무개", 58, 85),
			new Student("김김김", 96, 69)
			);
	
	// 출력메소드											변수명
	static void printString(Function<Student, String> function ) { // 임폴트 해야함
		for(Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	// 출력메소드					int일땐 <>에 들어오는 객체만 적어주면 됨
	static void printInt(ToIntFunction<Student> function ) { // 임폴트 해야함
		for(Student student : list) {
			System.out.println(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}
	
	// 평균을내는 출력 메소드
	// 반환형 double 매개변수 (ToIntFunction)
	static void printEp(ToDoubleFunction<Student> function) {
		double sum = 0;
		for(Student student : list) {
			sum += function.applyAsDouble(student); 
			
		}
		double result = sum/list.size(); 
		System.out.println(result);
	}
	// 교수님이 만든 평균출력 메소드
	static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
			
		}
		double avg = (double)sum/list.size(); 
		return avg;
	}
	
	
	/*	static void printTotal(ToIntFunction<Student> function) {
			int sum = 0;
			for(Student student : list) {
				sum += function.applyAsInt()+
				System.out.println(student.getName()+"의 총점 : "+sum);
			}
		}
		*/
	
	
	public static void main(String[] args) {
		// Function : 매개변수도 있고 리턴값도 있는 함수적 인터페이스
		System.out.println("[학생 이름]");
		printString(t -> t.getName()); // 한줄이면 {} 안해도됨. Student api의 정보 가져오는것
		
		System.out.println("[영어 점수]");
		printInt(t -> t.getEng());
		
		System.out.println("[컴퓨터 점수]");
		printInt(a -> a.getCom()); // 변수이름은 내맘대로임. 상징적인것

		
		System.out.println("[영어 평균]");
		printEp(p -> p.getEng());
		
		double engAvg = avg(p -> p.getEng());
		System.out.printf("[영어 평균] = %.2f\n", engAvg);

		double comAvg = avg(p -> p.getCom());
		System.out.printf("[컴퓨터 평균] = %.2f", comAvg);
		
		
		/*	System.out.println("결과");
			printTotal(p -> p.getCom()+p.getEng());
			*/
		
	}

}
