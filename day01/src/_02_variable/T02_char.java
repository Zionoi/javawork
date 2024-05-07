package _02_variable;

public class T02_char {

	public static void main(String[] args) {
		char ch1 = 'a'; // char 변수선언시 '' 한따옴표에 넣는다
		char ch2 = '김';
		char ch3 = '&';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = 'A' + 1;  // A는 유니코드로 65이므로 이 연산의 값은 66유니코드 값 B
		// 변수선언과 동시에 리터럴값(A)를 넣으면 유니코드값에서 계산함
		System.out.println(ch4);
		char ch5 = 'C';
//		char ch6 = ch5 + 1; // 이 변수선언 오류의 이유는 자동 형변환때문임 int로 자동형변환 되기때문에 강제로 형변환하는게 아니라면 이렇게 사용해선 안된다
		
		char ch7 = 'A' + '1'; // 리터럴 값이므로 A의 유니코드(65) + 1의 유니코드(49) = 114 
		System.out.println(ch7); // 유니코드 114는 r
		
		
	}

}
