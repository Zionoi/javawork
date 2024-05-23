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
			// return;이 있어도 수행
			System.out.println("프로그램 종료");
		}
		System.out.println("return; 이 있으면 수행 안함");
		
		//try나 catch안에 return;이 있다면 메소드는 끝나도 finally는 수행한다.
		/*	
			try {
				
				return;
			}catch{
				
				return;
				
			}finally {
				//메소드는 끝나지만 finally는 수행함
			}System.out.println("수행안함");
			
			*/
		
		
		
		
	}

}
