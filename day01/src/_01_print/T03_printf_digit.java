package _01_print;

public class T03_printf_digit {

	public static void main(String[] args) {
		
		System.out.printf("%7d\n", 32000); // 자리를 차지하게 하려면 %뒤에 숫자를 적으면 뒤에 글포함해서 입력값만큼 자리를 차지한다
		System.out.printf("%7d\n", 320000);
		System.out.printf("%7d\n", 3200); // 일종의 정렬효과를 줄 수 있음.
		System.out.println("------------------------");
				
		//숫자 앞에 0을 넣으면 빈자리는 0으로 채운다.
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 320000);
		System.out.printf("%07d\n", 3200); 
		System.out.println("------------------------");
		
		//숫자앞에 마이너스를 넣으면 왼쪽정렬이 된다
		System.out.printf("[%10s]\n", "abcdefg");
		System.out.printf("[%-10s]\n", "abcedfg"); 
		System.out.printf("[%s]\n", "abcedfg"); 
		System.out.println("------------------------");
		
		System.out.printf("%6.2f\n", 13.456);// . 도 자리 하나를 차지함 %뒤에 나오는숫자는 총 자리를 의미하고 .붙이고 나오는 숫자는 반올림후 그 값까지만 표시
		System.out.printf("%.3f\n", 13.123456);// %뒤에 숫자 생략하고 .숫자를 넣으면 앞에 숫자는 알아서 자리를 맞춰줌
		
		System.out.format("%.3f", 1094.12838495);

		
		
	}

}
