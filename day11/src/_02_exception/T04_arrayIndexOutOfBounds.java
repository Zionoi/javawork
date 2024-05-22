package _02_exception;

public class T04_arrayIndexOutOfBounds {

	public static void main(String[] args) {
		//배열의 크기를 벗어났을때
		String[] str = {"abc","def", "ghi"};
//		str[3] = "kim";
		
		try {
			str[3] = "kim";
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열을 벗어났습니다");
			e.printStackTrace();// 오류 메세지를 출력해주는 키워드
		}

	}

}
