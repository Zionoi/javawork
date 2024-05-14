package _02_method;

public class T01_main_maethod {

	public static void main(String[] args) {
		T01_api_method ob1 = new T01_api_method();
		
		ob1.print1();
		int result = ob1.print2(); //값 10이 들어옴
	/*
		 System.out.println(ob1.print1);  // ob1.print1은 반환형이 없는 void이므로 저장공간에 저장할수없고 출력도 x
	*/	
		System.out.println(result);
		System.out.println(ob1.print2());
		
		System.out.println(ob1.print3());
		
		ob1.print4(5);
		
		int re2 = ob1.pirnt5(7, 8); //15
		System.out.println(re2);
		
		ob1.print6("더조은", 100);
		
		T02_api_method ob2 = new T02_api_method();
		System.out.println(ob2.add(5, 6));
		System.out.println(ob2.subtract(9, 7));
		System.out.println(ob2.multiply(8, 5));
		System.out.println(ob2.divide(8, 7));

	}

}
