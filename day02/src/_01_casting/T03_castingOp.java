package _01_casting;

import java.util.Scanner;

public class T03_castingOp {

	public static void main(String[] args) {
		// **int 형보다 작은 자료형의 연산은 모두 int로 자동 형변환 됨
		byte b1 = 10;
		byte b2 = 20;

		// byte result= b1 + b2; // int 형보다 작은 자료형의 연산이므로 이식 그대로는 오류가 남
		int result = b1 + b2;
		byte result2 = (byte) (b1 + b2);

		char c1 = 'A';
//		char c2 = c1 + 1; // char + int = int형으로 자동형변환되기때문에 그보다 작은 char에 넣을수 없다 고로 오류
		int c3 = c1 + 1;
		char c2 = (char) (c1 + 1);
		System.out.println(c2);
		System.out.println(c3);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2; // int/int = int로 자동 형변환되기때문에 몫만 나오는것. 나머지는 소멸됨
		System.out.println(num1 + "/"+num2 + "의 몫 : "+result3);
		
		double dou2 = 3;
		double result4 = num1 / dou2; // int / double은 double로 자동형변환 됨
		System.out.println(result4);
		
		/*
		 double = int / double
		 double = double / int
		 double = double / double
		 */
		
		num1 = 100;
		num2 = 3;
		double re = (double)num1 / num2;
		re = num1 / (double)num2; 
		re = (double)num1 / (double)num2;
		
		double re2 = num1 / num2; // double = int / int 의 경우 이미 값에 나머지가 소멸된 상태로 double로 들어감으로 33.0으로 출력됨
		System.out.println(re2); 
		

		
	}

}
