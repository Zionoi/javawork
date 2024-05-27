package _01_StringBuffer_bulider;

public class T03_Math {

	public static void main(String[] args) {
		// Math클래스
		// 수학계산에 유용한 메서드. 자바의정석 파워포인트 검색후 어떤 메서드들이 있는지 확인하기
		
		
		// 절대값 Math.abs()
		System.out.println("-11의 절대값 : " + Math.abs(-11));  //11
		System.out.println("-11.45의 절대값 : " + Math.abs(-11.45));  //11.45
		
		//소수점 이하 무조건 올림 Math.ceil()
		System.out.println("13.1의 올림 : "+ Math.ceil(13.1)); //14
		System.out.println("-13.1의 올림 : "+Math.ceil(-13.1)); // -13
		
		// 소수점 이하 무조건 내림 Math.floor()
		System.out.println("13.7d의 내림 : " + Math.floor(13.7)); // 13
		System.out.println("-13.7d의 내림 : " + Math.floor(-13.7)); // -14
		
		System.out.println("-----------------------------------");
		
		//가장 가까운 정수값 반환 Math.rint
		System.out.println("13.1의 가까운 정수값 : "+Math.rint(13.1)); //13.0
		System.out.println("13.7의 가까운 정수값 : "+Math.rint(13.7)); //14.0
		//딱 중간일땐 위로 반올림값 출력
		System.out.println("13.5의 가까운 정수값 : "+Math.rint(13.5)); //13.0
		System.out.println("-13.5의 가까운 정수값 : "+Math.rint(-13.5)); //-14.0
		
		//소수점 이하 반올림
		System.out.println("13.1의 반올림 : " + Math.round(13.1)); //13
		System.out.println("13.7의 반올림 : " + Math.round(13.7)); //14
		//round와 rint 둘 다 마이너스일때는 가까운정수로 반올림한다
		System.out.println("-13.1의 반올림 : " + Math.round(-13.1)); //-13
		System.out.println("-13.7의 반올림 : " + Math.round(-13.7)); //-14
		
		//두 수중 큰 수 반환
		System.out.println("7과 8중 큰 숫자 : "+Math.max(7, 8)); //8
		//두 수중 작은 수 반환
		System.out.println("7과 8중 큰 숫자 : "+Math.min(7, 8)); //7
		
		System.out.println("-----------------------------------");
		//Math.pow 제곱연산 구하는 메소드
		
		 System.out.println("10의 3승 : "+(int)Math.pow(10, 3)); // 10의 3승 == 1000
		 System.out.println("1024의 5승 : "+Math.pow(1024, 5)); // 1024의 5승 == 1000

		 // 제곱근 구하는 메소드 Marh.sqrt
		 System.out.println("25의 제곱근 : "+Math.sqrt(25)); //루트 5.0
		 System.out.println(Math.cos(5.6)); //코사인 0.7755658785102496
		 System.out.println(Math.sin(6)); //사인 -0.27941549819892586
		
		 System.out.println("-----------------------------------");
		// 소수점 둘째자리까지 얻기
		double value = 12.34567;
		double value2 = value*100; // 100을곱해서 소수점을 둘째자리까지 보낸뒤
		System.out.println(value2);
		long re = Math.round(value2); // 라운드로 반올림. Math.round()의 반환형은 long형이므로 long을 써야함 int사용시 강제형변환필요
		int result = (int)Math.round(value2);
		double re2 = Math.round(value2); //long보다 double의 자료형이 더크므로 이렇게 하면 자동형변환이 된다
		System.out.println(result);
		System.out.println(result/100.0); //소수점 이하까지 출력해야하니 double로 강제형변환해야함
		
		
		double ran = Math.random()*100;// 0 ~ 99.99999999...
		double ran2 = Math.round(ran); // 반올림
		System.out.println(ran2/100);//다시 100으로 나누면 0.00 소숫점 둘째까지 표현됨 
		
		double ran11 = (Math.random()*100)+1;// 1 ~ 100.99999999...
		double ran12 = ran11*100;
		double ran13 = Math.round(ran12);
		System.out.println(ran13/100);
		
		
		
	}

}
