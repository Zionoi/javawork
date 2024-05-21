package _02_abstract;

public class Dog extends Pet{
	// 생성자 2개 
	
		public Dog() {
		super("포메라니안", "갈색","활발", "멍멍이");
	}

		
		
		Dog(String kind, String color, String feature, String name) {
			//오버라이딩하기
			super(kind,color,feature,name);
		
		}
		//abstract 메서드 2개다 값 넣어줌
		@Override
		void sound() {
			System.out.println("멍멍");
		}
		@Override
		void info() {
			System.out.println("종류 : "+super.getKind());
			
		}
		
}
