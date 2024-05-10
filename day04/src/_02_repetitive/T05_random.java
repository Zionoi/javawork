package _02_repetitive;

public class T05_random {

	public static void main(String[] args) {
		// Math클래스(수학에 관련된 클래스 객체생성을 하지않고 사용할 수 있음)
		// Math라는 클래스안에 random이라는 메소드를 가져오는 명령어
			Math.random();// Math.random으로 나오는 값은 double형으로 나옴
			
			double random1 =Math.random();
			System.out.println(random1);// 실수형 0 ~ 0.9999999999999999... 사이의 숫자 랜덤 생성
		System.out.println("--------------------");
		
		
		// 랜덤 메소드로 0~ 9.99999999999999까지의 숫자를 표현하고싶다면 곱하기 10을 해주면 됨
		
		random1 = Math.random() * 10;
		System.out.println(random1); // 실수형 0 ~ 9.999999999999999... 사이의 숫자 랜덤 생성
		System.out.println("--------------------");
		
		// 랜덤 정수만 얻고싶다면 int로 강제 형변환 하면 얻을수 있다
		
		int random2 = (int)random1; // 정수로 강제 형변환 : 0 ~ 9
		System.out.println(random2); 
		System.out.println("--------------------");
		
		// 1~10까지의 랜덤 정수를 얻고싶다면 강제형변환 후에 +1 해주면 된다
		int random3 = (int)random1 + 1; // 정수로 강제 형변환한 후 1 증가 : 1 ~ 10
		System.out.println(random3); 
		System.out.println("--------------------");
		
		// 0~4까지 숫자중 랜덤으로 추출
		// 0 ~ 0.99999999 * 5 = 0 ~ 4.999999999 이후 int로 강제 형변환 하면 0~4까지 랜덤정수 구할 수 있다
		int random4 = (int)(Math.random()*5); // Math 앞에만 int를 붙이면 0만 남고 나머지는 소멸되므로 소괄호로 먼저 5를 곱해준후 int로 형변환 해야한다
		System.out.println(random4);
		
		// 1~5까지 랜덤 정수 구하려면 +1 해주면 된다
		int random5 = random4 + 1; // 1~5
		
	
		
	}

}
