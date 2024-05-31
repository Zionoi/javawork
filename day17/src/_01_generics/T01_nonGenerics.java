package _01_generics;

class Box {
	private Object object;
	void set(Object objcet) {
		this.object = object;
	}
	Object get() {
		return object;
	}
}

class Auction { }

public class T01_nonGenerics {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get(); // Object타입으로 받았으니 String변수에 담으려면 String으로 강제형변환 해야한다.
		
		box.set(new Auction()); // 클래스를 객체생성해서 담음
//		Object a = box.get();  // 이렇게 기본적으로 오브젝트 타입이여서 Object에 담으면 형변환 필요없다.
		Auction a = (Auction)box.get(); // Object에서 Auction으로 강제형변환후 변수에 담음
		
		
		
	}

}
