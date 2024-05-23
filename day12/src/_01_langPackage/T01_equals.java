package _01_langPackage;

class Value {
	int value;

	Value(int value) { // int값을 받아서
		this.value = value;// 인스턴스변수에 값을 넣어주는 생성자
	}
		
		@Override
		public boolean equals(Object o) { // equals를 오버라이딩함 어떤객체가 들어올지 모르니 가장 최상위 객체인 Object를 매개변수로 받음. 그럼 모두 받을수 있다
			boolean b = value == ((Value)o).value; // 인스턴스변수가 오브젝트에 들어있는 value와 같은가? value형이므로 강제로 형변환한다
			return b;
		
			//위에 코드를 return value == ((Value)o).value; 한줄로 바꿀수 있다.
		}
			
}

public class T01_equals {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		// Object클래스의 equals는 주소가 같은가를 물어본다.
		// 오버라이딩으로 값이 같은가를 묻는 메소드를 만들어 사용
		if (v1.equals(v2))
			System.out.println("v1과 v2가 같다");
		else
			System.out.println("v1과 v2가 다르다");
		// v1, v2의 값은 같으나 각각의 주소가 다르므로(객체가 다름) equals비교시 false

		Value v3 = v1; // v1을 v3에 넣으시오. 같은 객체. 주소가 같음
		if (v1.equals(v3))
			System.out.println("v1과 v2가 같다");
		else
			System.out.println("v1과 v2가 다르다");
		// 이경우에는 같은 v1에서 v3로 같은 주소를 옮겨받았기 때문에 equals 비교시 true

		
		
		
		/*
		toString()
		-객체의 정보를 문자열(String)로 제공할 목적으로 정의된 메서드
				16진수의 해시코드를 얻어온다
		
		*일반적으로 의미 있는 문자정보가 나오도록 재정의
		-Date 클래스 - 현재 시스템의 날짜와 시간정보 리턴
		-String 클래스 = 저장하고 있는 문자열 리턴메서드
		
		String str = new String("kim"); //str에 객체 주소를 넣음
		System.out.println(str);// 원래대로라면 해시코드 주소가 출력되어야하지만 toString메소드를 미리 오버라이딩 재정의 해둬서 kim이 출력된다
		
		
		
		
		
		*/
	}

}
