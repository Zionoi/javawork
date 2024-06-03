package _03_Lamda;

public class T01_lamda {

	public static void main(String[] args) {
		MyMethod mm;
		
		mm = (x, y) -> { // 매개변수가 두개일땐 무조건 () 소괄호 해줘야한다.
			int result = x+y;
			return result;
		};
		
		
		System.out.println(mm.method(8, 5));
	
		mm = (x, y) -> { 
			return x+y;
		};
		
		System.out.println(mm.method(5, 55));
		
		
		// 구현부가 한줄이면 return 생략 가능
		mm = (x, y) -> x+y;
		System.out.println(mm.method(78, 2));
	
		
		
		// 내가 정의한 함수도 사용할 수 있다
		mm = (x, y) -> sum(x,y);
		/*	
			mm = new MyMethod() {
				@Override
				int method(int x, int y) {
					int result = sum(x, y);
					return result;
				}
			};
			*/
	
	}	
	static int sum(int x, int y) {
		return x+y;
	}
}
