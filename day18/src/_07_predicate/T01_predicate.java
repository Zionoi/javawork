package _07_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class T01_predicate {
//	predicate : 참 거짓 리턴 펑션은 리턴값의 자료형을 정해줄수있었다면 predicate는 불린형으로 정해져있음
	
	static List<Student> list = Arrays.asList(
			new Student("홍길동", "남", 100),
			new Student("박길동", "남", 89),
			new Student("아무개", "여", 87),
			new Student("김나래", "여", 85),
			new Student("김욯나", "남", 69)
			);
	static boolean Predicate(Student student) {
		return student.getGender().equals("남");
	}
	
	// 남, 여 별 평균 구하기
	static double avg(Predicate<Student> predicate){
		int sum = 0, count =0;
		for(Student student : list){
			if(predicate.test(student)) {
				count++;
				sum += student.getCom();
			}
		}
		return (double)sum / count;
	}
	
	
	static int sum(Predicate<Student> predicate) {
		int sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				sum += student.getCom();
			}
		}return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getGender().equals("남"));
		System.out.printf("[남자 평균 점수] = %.2f\n", maleAvg);
		
		double femaleAvg = avg(t -> t.getGender().equals("여"));
		System.out.printf("[여자 평균 점수] = %.2f\n", femaleAvg);
		
		
		
		boolean bb = Predicate(new Student("강호동","여",95));
		System.out.println(bb);
		
		int maleSum = sum(t -> t.getGender().equals("남"));
		System.out.printf("[남자 점수 총합] = %s\n", maleSum);
		
		int femaleSum = sum(t -> t.getGender().equals("여"));
		System.out.printf("[여자 점수 총합] = %s\n", femaleSum);
		
		
		
		
	}

}
