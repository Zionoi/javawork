package _02_exception;

public class T09_tryCatchFinally {
								
								//아규먼트
	public static void main(String[] args) {
		//main 아규먼트 설정하는법 : 위에 설정바에 Run -> Run configurations -> argument
		
		
		
		// finally 는 무조건 실행되어야할때 사용함. 
		
		try {
			System.out.println(args.length);
			System.out.println(args[0]);
			System.out.println(args[4]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 범위를 넘어섬");
		} finally {
			// 예외와 상관없이 무조건 실행
			System.out.println("프로그램 종료");
			
		}
		
		
		
		
		
	}

}
