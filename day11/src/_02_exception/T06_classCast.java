package _02_exception;

class Animal{}
class Dog extends Animal{
	
}
class Cat extends Animal{}
public class T06_classCast {

	public static void main(String[] args) {
		
	/*		
			try {
				Animal ani = new Animal();
				
				
				Dog dog = new Dog();
				Cat cat = new Cat();
				
				Animal aniDog = dog;
				Animal aniCat = cat;
				
				dog = (Dog)aniDog; // 형변환 가능. aniDog최초 객체 생성시 자식격인Dog로 생성후 부모클래스로 형변환한거라 Dog의 저정공간이 남아있어 다시 자식격 Dog 형변환 할수있다
				dog = (Dog)ani; // 오류. ani최초 객체생성시 바로 부모격 Animal로 생성해서 자식클래스 저장공간이 만들어지지 않음. 자식형변환 불가능
				
				
				
			}catch(ClassCastException e) {
				System.out.println("부모타입을 자식의 타입으로 형변환 할 수 없음");
			}
			
		*/	
		
		/*	위에 try catch문 대신에 instanceof 키워드로 자료형 확인할수 있다.		
				if(ani instanceof Dog) { // ani 가 Dog로 만들어 졌는가?
					dog = (Dog)ani;
				}else {
					System.out.println("변경 불가");
					{
				}
		*/		
		
		T06_classCast t = new T06_classCast();
		Dog dog = new Dog();
		t.change1(dog);
		
		change2(dog);  // static은 객체생성 하지 않아도 사용할 수 있다.
		
		if((change2(dog)) == null) {
			System.out.println("변환불가");
		}else {
			dog = change2(dog);
		}
		
	}
	public void change1(Animal animal) {
		Dog dog = (Dog)animal;
		
	}
	public static Dog change2(Animal animal) {
		Dog dog = null; // 아래에서 리턴값을 받으려면 if문 밖에 저장공간을 미리 만들어놔야한다.		
		if(animal instanceof Dog) {
		dog = (Dog)animal;
		}return dog;
	}
}
