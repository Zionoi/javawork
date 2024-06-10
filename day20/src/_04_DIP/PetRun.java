package _04_DIP;

public class PetRun {

	public static void main(String[] args) {
		IPet cat = new Cat(); 
		System.out.println(cat);
		IPet dog = new Dog();	
		System.out.println(dog);
		
		
		Pet pet = new Pet();
		
		pet.setPet(new Dog()); // Dog는 IPet을 상속받아서 그냥 생성 가능하다.
		System.out.println(pet.getPet());
		
		pet.setPet(new Cat()); // 애완동물 추가로 더 들어와도 Pet 클래스에서 일일히 추가안하고 클래스 하나만 추가하면 간단하게 생성 가능하다.
		System.out.println(pet.getPet());
		
	}

}
