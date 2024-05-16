package _07_ex;

public class T01_api_ex {
//생성자
/*	-매개변수가 없는 생성자
	-매개변수로 empName, dept,job
	empNo는 호출될때마다 1씩 증가
*/
	static int empNo = 100;
	String empName = "홍길동";
	String dept = "영업부";
	String job = "과장";
	int age = 25;
	String gender = "남";
	int salary = 2500000;
	double bonusPoint = 0.05;
	long phone = 010-1234-5678;
	String address = "서울시 강남구";
	double bonus;
	
	T01_api_ex() {
		
		String empName = "홍길동";
		String dept = "영업부";
		String job = "과장";
		int age = 25;
		String gender = "남";
		int salary = 2500000;
		double bonusPoint = 0.05;
		long phone = 010-1234-5678;
		String address = "서울시 강남구";
		double bonus;
		this.empNo++;
		System.out.println("empNo : "+empNo);
	}
	T01_api_ex(String empName,String dept,String job ){
		this.empName=empName;
		this.dept = dept;
		this.job = job;
		int age = 25;
		String gender = "남";
		int salary = 2500000;
		double bonusPoint = 0.05;
		long phone = 010-1234-5678;
		String address = "서울시 강남구";
		double bonus;
		this.empNo++;
		System.out.println("empNo : "+empNo);
	}
	
	
	
//	메소드
/* 	-보너스 계산하는 메소드(salary, bonusPoint)
 		메소드 내에서 출력해줌
  	-보너스 계산하는 메소드(salary)
  		bonusPoint 0.1
 		메소드 내에서 출력해줌
 */
	
	double bonus(int salary, double bonusPoint) {
		this.bonus = salary * bonusPoint;
		System.out.println(this.empName+" 보너스 : "+ bonus);
		return bonus;
	}

	double bonus(int salary) {
		this.bonus = salary * 0.1;
		System.out.println(empName+" 보너스 : "+ bonus);
		return bonus;
	}

	
	
	
	
}
