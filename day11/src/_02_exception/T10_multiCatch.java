package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_multiCatch {

	public static void main(String[] args) {
			// catch문이 여러개
		try {
			int[] num = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("3개의 정수 입력 : ");
			int sum = 0;
			for(int i=0;i<num.length;i++) {
				System.out.println(i+1+"번째 정수 입력");
				num[i]= sc.nextInt();
				sum += num[i];
			}
			num[3] = 5;
			System.out.println("합계 : "+ sum);
		
		
		} catch (ArrayIndexOutOfBoundsException e) { // 배열의 인덱스를 넘어가는 오류만 여기로
			System.out.println("배열의 범위를 넘어섬");
		
		} catch (InputMismatchException e) { //스캐너의 입력을 다른자료형으로 넣는 오류만 여기로
			System.out.println("정수만 넣으세요");
			
		} catch (Exception e) { // 위에 익셉션 잘모르겠다면 그냥 이거하나만 써도 된다. 가장 상위 모든 예외클래스의 최상이 클래스라 다형성때처럼 모든 예외 캐치함 
			System.out.println("예외발생");
		}
	
	
	}
		

}
