package _02_exception;

public class T02_Exception {

	public static void main(String[] args) {
/*	1)
		try {
			// 예외가 나올 수 있는 프로그램
			int a = 5/0;  //오류
			System.out.println(a);
			int b = 5/2;
			System.out.println(b);
		} catch(Exception e) { //  try에서 예외가 발생 했을 때 수행. 변수 e : 예외 발생에 대한 메세지가 들어감
			// 가장상위클래스이므로 모든 예외를 포함
			System.out.println("0으로 나눌 수 없습니다");
			
			
		}
*/
		
//	2)
			System.out.println(1);
			System.out.println(2);
		try {
			//예외가 나올 수 있는 프로그램
			System.out.println(3); 
			System.out.println(3/0); //오류 catch로 넘어감
			System.out.println(4);// 수행 안함
		}catch(Exception e) {
			// 예외가 발생 했을 때 수행
			System.out.println(5);
		}
		System.out.println(6);
		
		
		
	}

}
