package _03_lsp;
class Cat {
	void speak() {
		System.out.println("야옹");
	}
}
class WhiteCat extends Cat {
	String color = "white";
//	@Override
//	void speak() {
//		System.out.println("화이트 야옹");
//}
}
class BlackCat extends Cat {
	String color = "Black";
//	@Override
//	void speak() {
//		System.out.println("블랙 야옹");
//	}
}

public class CatRun {

	public static void main(String[] args) {
		Cat cat = new WhiteCat();
		cat.speak(); // 오버라이딩을 하면 무조건 오버라이딩을 한게 호출이 됨.
		WhiteCat whiteCat = (WhiteCat)cat;  // 다시 자식타입으로 형변환
		whiteCat.speak(); // 오버라이딩된 메소드 호출됨.
		// lsp원칙 이렇게 오버라이딩 하는것보단 인터페이스 하나두고 공유하는게 효율적이라고함.
				
		
		
		
	}

}
