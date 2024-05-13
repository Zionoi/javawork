package _01_array;

public class T01_1차원배열 {

	public static void main(String[] args) {
		
		/*		
				int num1 = 1;
				int num2 = 2;
				int num1 = 3;
				int num2 = 4;...*100라고 가정해보면 굉장히 비효율적이다
				
		*/
		// 1차원 배열
		//배열은 
		//배열[]
		
		// 배열을 이용하면 변수를 컴퓨터가 훨씬 더 빨리 찾아올수있다(프로그램 최적화)
		

		int[] arrayInt = new int[5]; // 선언한 갯수만큼 int 자료형 저장공간을 만들어준다
		int arrayInt1[] = new int[3]; //배열 [] : 배열 표시 대괄호는 자료형 또는 변수명옆에 붙여준다(c언어에서는 자료형 옆에다가만 대괄호 해줘야 오류가 안뜸)
		arrayInt[0] = 10;  //이런식으로 변수값 설정할 수 있음
		arrayInt[2] = 20; 
		System.out.println(arrayInt[2]);// 변수명[] 대괄호안 인덱스 번호로 변수 호출
		
		arrayInt[0] = 10; 
		arrayInt[0] = 10; 
		arrayInt[0] = 10; 
		
	
		int arrayInt2[] = {1,2,3,4,5}; // 이런식으로 중괄호로 먼저 배열에 변수 설정해주면 배열 변수가 몇개인지 먼저 적어줄 필요 없다
		
		char[] arrayChar = {'a','b','c'}; // char형은 외따옴표로 변수구분
		String[] arrayStr = {"홀길동","아무개"};//String형은 쌍따옴표로 변수구분
		double[] arraudou = {35.56, 90.34};
		// 배열은 같은 자료형일때만 가능하다
		
		
		int[] arrayInt3 = new int[5]; // index번호 : 0~4
		//arrayint3[5] = 9; // 인덱스번호가 4까지밖에없는데 인덱스번호를 5번 설정하면 오류뜸 index 범위를 넘어서 넣을 수 없음
		arrayInt3[4] = 9;
		
		// 가정 배열 100개를 만들어서 1~100까지의 값을 넣고싶다면
		
			int[] arrayInt4 = new int[100];
			/*
			arrayInt4[0] = 1;
			arrayInt4[1] = 2;
			arrayInt4[2] = 3; //... 하나씩 넣으면 너무 비효율
			*/
		
		// 배열에 규칙이 있을땐 반복문 사용가능
		
		for(int i=0; i<100; i++) {
			arrayInt4[i] = i+1;
			System.out.print(arrayInt4[i]+",");// 이런식으로 변수설정 가능
		}
		
		
		/*
		 배열 변수설정후 변수값을 아무것도 안넣으면
		 초기값은
		 int      0
		 double   0.0
		 char	  0
		 Strin    null
		 boolean  false 
		 으로 설정된다
		
		 
		 */
	}

}
