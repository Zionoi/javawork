package _02_Lamda;

public class T02_lamda {

	public static void main(String[] args) {
		// 매개변수(아규먼트)가 한개인 메소드를 람다식으로 구현해보자
		MyOneArgs02 mo = new MyOneArgs02() {// 인터페이스를 객체생성
			
			@Override
			public void method(int x) {
				int result = x*2;
				System.out.println(result);
				
			}
		};// 세미콜론 잊지말기
		mo.method(4); //8 매개변수 int로 한개 받고있으니 정수 아무거나 넣으면 메소드 실행됨
		
		//람다식으로 바꾸면
		mo = (x) -> {
			int result = x*3; // 람다식에선 *3으로 해보자
			System.out.println(result);
		};//세미콜론 잊지말자
		
		mo.method(4); //12
		
		//식이 한줄이면 이런식으로 {}대괄호 빼고 한줄로도 만들수 있다
		mo = (x) -> System.out.println(x*4); // 여기선 *4로 해보자

		mo.method(4); //16
		
	}

}
