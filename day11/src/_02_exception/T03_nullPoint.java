package _02_exception;

public class T03_nullPoint {

	public static void main(String[] args) {
		//null값을 호출할때
//		String data = null; //지역변수. 초기화해줘야함
//		System.out.println(data.toString()); //toString은 객체생성을 해야만 호출할 수 오류
		
		try {
			String data = null; 
			System.out.println(data.toString());
		}catch(NullPointerException e){
			System.out.println("데이터가 들어있지 않습니다");
			System.out.println("메시지 : "+e);
		}
		

	}

}
