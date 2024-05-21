package _02_abstract;

public class Cat extends Pet{
	
	public Cat() {
		super("샴고양이", "흰색","얌전", "야옹이");
		
	}
	Cat(String kind, String color, String feature, String name) {
		super(kind,color,feature,name);
		
		
	}
	
	
	
	//abstract 메서드 2개중 하나만 값 넣어줌
	void sound() {
		System.out.println("야옹");
	}
	@Override
	void info() {
		
	}
	
	
	
}
