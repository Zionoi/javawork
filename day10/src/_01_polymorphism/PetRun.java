package _01_polymorphism;

public class PetRun {

	public static void main(String[] args) {
			Pet cat = new Cat();
			Pet dog = new Dog();
			Pet frog = new Frog();
		
			Play play = new Play();
			
			cat.info();
			System.out.println(cat); // toString오버라이딩
			dog.info();
			frog.info();
			
			play.diskThrow(cat);
			play.feed(cat);
			play.feed(dog);
			
			Pet dog2 = new Dog("리트리버","금색","사교적","황구");
			dog2.info();
			System.out.println("-----------");
			System.out.println(dog2);
			play.diskThrow(dog2);
	}

}
