package _01_Operation;

public class T01_assignment {

	public static void main(String[] args) {
		// % 값을 나눈 나머지
		int num1= 10;
		int num2 = 3;
		int result = num1 % num2;
		System.out.println("몫 : "+ num1 / num2);
		System.out.println("나머지 : " + result);
		
		num1 = num1 + 10; // 객체에 덮어쓰기 할수있다 num1 값은 20으로 바뀐다
		System.out.println(num1);
		
		num1 += 10;  // 명령어를 단축할수도 있다 20+10
		System.out.println(num1);// 30
		num1 += 5;  // 30+5
		System.out.println(num1); //35
		
		num1 -= 8;  //35-8
		System.out.println(num1);  //27
		
		num1 -= 17; //27-17
		System.out.println(num1);  //10
		
		num1 *= 3; //10*3
		System.out.println(num1); // 30
		
		num1 /= 3; // 30/3
		System.out.println(num1); // 10 
		
		num1 %= 4; // 10 % 4 (%는 나머지를 구하는 연산자)
		System.out.println(num1); // 2
		
		int num3 = 300_000_000; // _ : 큰 숫자 입력시 , 대신 _를 사용하면 컴퓨터는 _를 인식하지않고 숫자그대로 출력한다. 사람이 숫자를 직관적으로 보기에 좋다. 
		System.out.println(num3);
		
		
		
	}

}
