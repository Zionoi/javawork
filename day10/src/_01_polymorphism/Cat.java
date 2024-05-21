package _01_polymorphism;

public class Cat extends Pet{
	
	public Cat() {
		super("샴고양이", "흰색","얌전", "야옹이");
		
	}
	Cat(String kind, String color, String feature, String name) {
		super(kind,color,feature,name);
		
		
	}
	
	void sound() {
		System.out.println("야옹");
	}
	
	
	
}
