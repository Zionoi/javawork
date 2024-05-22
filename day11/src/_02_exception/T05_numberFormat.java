package _02_exception;

public class T05_numberFormat {

	public static void main(String[] args) {
		// 자료형이 맞지 않을때
		int i=0;
		String[] str = {"23","1","14","3.141592"};
		try {
			for(i=0;i<str.length;i++) {
				int num = Integer.parseInt(str[i]); // String 자료형인 숫자를 int형으로 형변환 해주는 키워드
				System.out.println(num); // 위에 코드는 배열안의 a와 3.14... 같은 실수자료형이 포함되어있어 int형으로 형변환 할 수 없다
			}
			}catch(NumberFormatException e) {
				System.out.println(str[i]+"는 정수로 변경할 수 없음");
			}
			
				

	}

}
