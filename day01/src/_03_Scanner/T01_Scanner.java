package _03_Scanner;

import java.util.Scanner;
//import _02_variable.T02_char; // 객체를 가져올때 main이 두개가 있으면 안됨
//import _02_variable.*; //*를 달아주면 패키지안에 클래스를 전부 가져오겠다는 뜻
public class T01_Scanner {

	public static void main(String[] args) {
		//SCANNER 스캐너
				/* - System.in
				 * 키보드 장치를 직접 제어하고 키를 입력을 받는 java의 표준 입출력 스트림
				 * 키 값을 바이트 정보로 리턴
				 * - Scanner클래스
				 * System.in으로 받은키 값(바이트 정보)들을 문자, 정수, 실수, 불린, 문자열 등으로 변환
				 * java.util.Scanner 클래스
				 * 
				 * 객체를 가져와야함 가져오는 코드
				 * import java.util.*;
				 * Scanner scan = new Scanner(System.in);
				 * String str1 = scan.nest();
				 * 
				 */
				/* - 지시자
				 * String next() - 단어 단위로 문자열 리턴 *문자
				 * String nextLine() - 띄어쓰기를 포함하여 한 라인을 읽음.*문자열
				 * int nextInt() - int를 읽음.*정수
				 * long nextLont() - long을 읽음. * 정수
				 * float nextFloat() - float 을 읽음 * 실수
				 * double nextDouble() - double을 읽음 * 실수
				 * boolean nextBoolean() - boolean을 읽음 * 참,거짓을 읽음
				 */
		
		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.print("이름을 입력하세요 : "); String name = scan.next(); // 문자열의 단어
		 * System.out.println("당신의 이름은 " + name); // 스캐너를 쓸때는 위에 출력문으로 어떤값을 입력해야하는지 적어주면
		 * 좋다
		 * 
		 * System.out.print("나이를 입력하세요 : "); int age = scan.nextInt(); // 정수형이면 Int
		 * System.out.println("당신의 나이는 " + age);
		 * 
		 * System.out.print("키를 입력하세요 : "); double key = scan.nextDouble(); // 실수형이면
		 * double System.out.println("키 : " + key);
		 */
		
		/*
		 * System.out.print("당신은 남자입니까(true, false)? "); boolean gender =
		 * scan.nextBoolean(); System.out.println("당신은 남자입니까? " + gender);
		 */		 
		
		/*
		 * System.out.print("주소를 입력하세요 : "); String address = scan.next(); // 엔터를 친곳까지
		 * 인식되기때문에 사용에 조심해야함 System.out.println("주소 : " + address);
		 * 
		 * System.out.print("주소를 입력하세요 : "); String address2 = scan.nextLine();
		 * System.out.println("주소 : " + address2);
		 */
		
		System.out.print("당신의 성별은 무엇입니까? ");
		//String gender2 = scan.next();
		char gender3 = scan.next().charAt(0); // 인덱스 번호로 입력받는 값에 순번을 골라 출력할수있음
		//System.out.println("성별 : "+ gender2); 
		System.out.println("성별 : "+ gender3);
		
		
		
	}

}
