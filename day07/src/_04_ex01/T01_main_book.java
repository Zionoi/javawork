package _04_ex01;

public class T01_main_book {

	public static void main(String[] args) {
		// 객체 생성할 때 다른 값으로 넣고 출력하기
		T01_api_book book1 = new T01_api_book();
		T01_api_book book2 = new T01_api_book("수학의 정석");
		T01_api_book book3 = new T01_api_book("화성학",9876543);
		T01_api_book book4 = new T01_api_book("해리포터",8561235,38000);
		
			book2.sellcount();
			book3.sellcount();
			book2.sellcount();
			System.out.println();
		book1.sellcount();
		book1.sellcount();
		
		System.out.println("book1 : "+book1.bookName);
		System.out.println("book2 : "+book2.bookName);
		System.out.println("book2 : "+book2.ISBN);
		System.out.println("book3 : "+book3.bookName);
		System.out.println("book4 : "+book4.bookName);

	
		// 변수의 초기화
		/*
			-변수를 선언하고 처음으로 값을 저장하는 것
			-멘버변수(인스턴스변수, 글래스변수)와 배열은 각 타입의 기본값으로 자동초기화되므로 초기화를 생략할 수 있다.
			-지역변수는 사용전에 꼭! 초기화를 해주어야한다
		*/
		/*		class InitTest {
					int x;  //인스턴스 변수
					int y;	//인스턴스 변수 		
					
					void method1() {
						int i;	// 지역변수
						int j = i; // 컴파일 에러! 지역변수를 초기화하지 않고 사용했음 // i에 값을 먼저 넣어줘야함.
					}
				}
					*/
		
		/*
			멤버변수의 초기화 방법
			1. 명시적 초기화(explicit initialization)
			
			class Car {
			int door = 4;		//기본형 변수의 초기화
			Engine e = new Engine();  	// 참조형 변수의 초기화
			
			2. 생성자
			Car(String color, String gearType, int door) {
			 this.color
			}
			
			
			
		*/
		
		/*상속(inheritance)이란
			- 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것. //new로 객체생성안해도 사용할 수 있음
			- 두 클래스를 조상과 자손으로 관계를 맺어주는 것.
			- 자손은 조상의 모든 멤버(속성=변수)를 상속받는다. (생성자, 초기화블럭 제외)
			-자손의 멤버개수는 조상보다 적을 수 없다.(같거나 많다.)
			
			// class  자손클래스 extends 조상클래스 {
			  
			  		//...
			  		
				}
			
			ex)
			
			 class Point{
			 	int x;
			 	int y;
			 	
			 }
			 
		
		class Point3D {
		 	int x;
		 	int y;
		 	int z;
		
		}
		
		==
	
		class Point3D extends Point{
		    int z;
		}
		
		
		
		*/
		
		// 클래스간의 관계 - 상속관계
		/*
			class Parent {}
			class Child extends Parent {}
			class Child2 extends Parent {}
			class GrandChild extends Child {} // Child와 Parent 둘다 사용가능
			class GrandChild extends Child,Parent {}  // 이렇게는 사용못함 자바는 다중상속이 안됨. c언어는 가능함
		*/
		
		
		// 클래스간의 관계 - 포함관계(composite)
	/*		
		-포함 이란?
		-
		
		
		
		
		
		
		
	*/	
		
		
		/* 상속 vs 포함
		 원은 점이다 = Circle is a Point.
		 원은 점을 가지고 있다. - Circle has a Point.  
		 
		 상속관계 = '~은 ~이다. (is-a);
		 포함관계 = '~은 ~을 가지고 있다.(has-a)' 
		
		*/
		
	}

}
