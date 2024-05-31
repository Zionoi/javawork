package _02_multiGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		//<> Tv객체, 문자열 객체만 받을거라는 뜻
		Product<Tv,String> p1 = new Product<>();
		
		p1.setKind(new Tv());
		p1.setModel("스마트 TV");
		
		Tv kind = p1.getKind(); // p1은 Tv형이므로 변수 자료형도 Tv로 해줘야한다
		String model = p1.getModel(); // 위와 같음
		
		
		System.out.println(kind);
		System.out.println("제품명 : " + kind + " / 모델명 : " + model);
		
		Product<Car, Integer> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel(2024);
		
		Car kindCar = p2.getKind();
		int modelCar = p2.getModel();
		
		System.out.println("제품명 : " + kindCar + " / 모델명 : " + modelCar+"년형 SUV");
		
		
	}

}
