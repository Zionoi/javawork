package _01_Operation;

public class T02_increase {

	public static void main(String[] args) {
		// ++ 1증가
		int num1 = 10;
		
		num1 = num1 +1;
		num1 += 1;
		// 위의 연산을 줄여 줄 수 있다
		num1++; // ++ : 1 증가
		
		System.out.println(num1);
		
		num1 = 10;
		num1--; // -- : 1 감소
		System.out.println(num1);
		
		++num1; // 앞에 붙여도 됨
		System.out.println(num1);
		
		--num1;
		System.out.println(num1); // 단한연산자일때는 연산자가 앞이나 뒤나 결과는 똑같음
		
		// 이항연산자일때는 연산자의 위치에 따라 결과가 달라짐
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + ++num3; // 이항연산시 ++이 숫자앞에 붙으면 연산전에 본인을 먼저 1 증가시키고 연산함
		System.out.println(result); // 22
		
		num2 = 10;
		num3 = 10;
		result = ++num2 + num3++; // ++이 뒤에 붙으면 연산을 하고난 후에 본인을 1증가시킨다
		System.out.println(result);// 21
		
		num2 = 10;
		num3 = 10;
		result = num2-- + num3--; // --도 똑같음. 결과는 20. 연산후 num2와num3는 1씩 감소 9
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		int num4 = 10;
		result = ++num2 + num3-- - num4++; // 11 + 10 - 10 = 11
		System.out.println("num2 : "+ num2 + ", num3 : "+num3 + ", num4 : "+num4 + ",  result : "+result);
	}

}
