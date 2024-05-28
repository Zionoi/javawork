package _01_localDateTime;

import java.text.DecimalFormat;
import java.text.ParseException;

public class T05_DecimalFormat {

	public static void main(String[] args) {
		double number = 1234567.89;
		double number2 = 3.0;
		
		
//		DecimalFormat df =new DecimalFormat("#,###");
		//0이면 무조건 자리차지, # 있으면 없으면 출력 안함
							//변수 df대신 바로 괄호안에서 선언해도된다//0은 무조건 자리차지
		System.out.println(new DecimalFormat("0").format(number));  // 정수출력, 소수점은 반올림
							//#은 자리가 있으면 출력하고 아니면 출력x
		System.out.println(new DecimalFormat("#").format(number));
		
		System.out.println(new DecimalFormat("0.0").format(number));//소수점 첫째자리까지 반올림 후 출력하시오 		
		System.out.println(new DecimalFormat("#.#").format(number));
		
		System.out.println(new DecimalFormat("0.0").format(number2));
		System.out.println(new DecimalFormat("#.#").format(number2));
		System.out.println(new DecimalFormat("0000000000000.0000").format(number));
		System.out.println(new DecimalFormat("#############.####").format(number));
		System.out.println("----------------------------------");
		System.out.println(new DecimalFormat("#,###.##").format(number));
		System.out.println(new DecimalFormat("0,000.00").format(number));
		
		
		//스트링을 대시멀포맷으로 고쳐서 그걸 다시 숫자로 변경(, 컴마 때문에 바로 변경 안됨)
		String stNum = "1,234,567.89";
		DecimalFormat df = new DecimalFormat("#,###.##");
		try {
			Number num = df.parse(stNum); // try catch로 해야함
			System.out.println(num); //Number는 객체라서 연산할 수 없음
			double d = num.doubleValue();// num을 double형(실수형)으로 변환
			System.out.println(d);
			System.out.println("--------------------------");
			
			System.out.println(new DecimalFormat("#,###.##").parse(stNum).doubleValue()); // 위에를 이렇게 한 줄로 바꿀수 있음
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
