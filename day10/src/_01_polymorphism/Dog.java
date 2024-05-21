package _01_polymorphism;

public class Dog extends Pet{
	// 생성자 2개 
	
		public Dog() {
		super("포메라니안", "갈색","활발", "멍멍이");
	}

		
		
		Dog(String kind, String color, String feature, String name) {
			//오버라이딩하기
			super(kind,color,feature,name);
		
		}
		
		void sound() {
			System.out.println("멍멍");
		}
		
}
