package _02_wrapperClass;

public class T02_wrapper_설명 {

	public static void main(String[] args) {
		/* wrapper 설명

		valueOf() : Integer객체에서 int형 값을 뽑아내는 메소드
					Integer -> 언박싱 -> int 변환
			-언박싱(unboxing) : 참조자료형을 기본자료형으로 바꿔주는것.
			-박싱(boxing) : 기본자료형을 참조자료형으로 변환
	
		*/	
			
			// 언박싱
			
			 Integer num = Integer.valueOf(100);
			 int num1 = num; // 자료형변환 참조자료형을 기본자료형으로 언박싱. 이 경우 자동으로 형변환되어 오토 언박싱이라고 함
			 
			 
			 Character ch = 'z';
			 char c = ch; // 이것도 오토 언박싱 
			 
			 //Integer.parseInt() : 문자열을 인트형으로 바꿈
			 int num2 = Integer.parseInt("100"); // 이렇게 해도 언박싱
			 Integer num3 = Integer.valueOf("100");
	
		
			// boxing
			 int num4 = 10;
			 Integer num5 = Integer.valueOf(num4);
			 
			 String str = "10";
			 Integer num6 = Integer.valueOf(str);
			 
			 double b = 1.3;
			 Double d = Double.valueOf(b);
			 
			 
			 
		
	}

}
