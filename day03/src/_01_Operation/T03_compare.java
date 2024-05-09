package _01_Operation;

public class T03_compare {

	public static void main(String[] args) {
		// == : 같은가?  ,  != : 같지 않은가?  
		int num1 = 10;
		int num2 = 50;
		
		boolean re1 = num1 == num2; //기본자료형 비교는 주소가 아니라 값이 같은가?, 객체 자료형은 주소가 같은가?
		System.out.println("num1과 num2의 값이 같은가? " + re1); 
		System.out.println("num1과 num2의 값이 같은가? " + (num1 == num2));
		
		System.out.println("num1과 num2의 값이 같은가? " +(num1 != num2));
		
		
	}

}
