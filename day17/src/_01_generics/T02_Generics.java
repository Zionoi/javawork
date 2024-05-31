package _01_generics;

class Delivery<T> {
	private T t;
	void set(T t) {
		this.t = t;
	}
	T get() {
		return t;
	}
}

class Gmarket<T> { }

public class T02_Generics {

	public static void main(String[] args) {
		Delivery<String> del = new Delivery<String>();
		del.set("program");
		String str = del.get();// 애초에 String 자료형이여서 자료형변환 필요없다
		
		Delivery<Integer> del2 = new Delivery<>();
		del2.set(7);
		int value = del2.get();
		
		Delivery<Gmarket> del3 = new Delivery();
		del3.set(new Gmarket());
		Gmarket g = del3.get();
		
		/*	Delivery<Gmarket> del4 = new Delivery();
			del4.set(new Box()); //del4는 제네릭에 Gmarket 객체만 들어올수 있게 설정했으므로 Box나 String 같은 다른객체가 들어오면 오류가 뜬다 
			Gmarket g = del4.get();*/
		
		
		
		
		
		
		
		
	}

}
