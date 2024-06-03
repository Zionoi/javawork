package _04_consumer;

import java.util.function.*;

//자바에서 기본으로 만들어져있는 인터페이스를 이용해 람다식 만들 예정. 그러므로 인터페이스를 따로 만들 필요가 없다.

public class T01_consumer {

	public static void main(String[] args) {
		// Consumer interface : 매개변수1개, 리턴값 없음
		
		//1. 매개변수 1개 모든 객체
//	패키지명<제내릭 내맘대로 객체넣기> 변수이름 = 매개변수1개 -> 구현부  
		Consumer<String> consumer = x -> System.out.println(x); // 임폴트 해야함
		consumer.accept("java"); // x 에 java가 들어가고  x출력
		
		
		//2. 매개변수 2개 : 앞에 Bi라는 접두어 붙임. 리턴값 없음
//	 				<객체, 객체>
		BiConsumer<String, String> biCon = (a, b) -> System.out.println(a+ ", "+b);
			biCon.accept("더조은","의료용 Ai");
		
		//3. 매개변수가 한개인데 더블형일때. DoubleConsumer 는 더블만 받을수 있어서 제네릭 없어도 된다.
		DoubleConsumer douCon = d -> System.out.println(d);
		douCon.accept(4.32);
			
		
		//4. 매개변수 2개중 1개는 모든 객체, 1개는 int형
//					<오브젝트에 해당하는객체> 왜 스트링만 넣어도 되는건지는 모르겠다 그냥 외우자
		ObjIntConsumer<String> oiCon = (o,i) -> System.out.println(o+ ", "+i);
		oiCon.accept("program", 2);
		

	}

}
