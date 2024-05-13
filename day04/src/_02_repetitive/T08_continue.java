package _02_repetitive;

public class T08_continue {

	public static void main(String[] args) {
		// break : 반복문을 탈출
		// continue : 실행문을 실행하지 않고 다시 반복문을 실행
		//						~을 제외 할때 많이 사용				
		
		//예를들어 1~100까지 합계중 3의 배수를 제외한 합계를 구하시오
		/*	
			int sum = 0;
			for (int i=1; i<=100; i++) {
				if (i%3==0)
					continue; // 반복문으로 돌아감
				sum += i;
				System.out.println(sum);
			}
			System.out.println("1~100까지 3의 배수를 제외한 합계 : " + sum);
			*/
		// 	같은 자료형일때
		/*	int num1;
			int num2;
			int num3;*/
		//	int num1, num2, num3; // 이런식으로 변수를 한번에 선언 할 수 있음
		//	int num1=4, num2=9, num3=5;  //이렇게 각각 변수값 설정도 가능하다
			
		  int num4, num5, num6;
			 num4=num5=num6=5; // 이런식으로 줄일 수 있다
		
		//for문 사용시 여러개의 변수 사용가능
/*		 for(int i=1, j=20; i<=10; i++,j--) { //주의) 조건식은 무조건 하나만 넣어야한다
			 System.out.println(i + ", "+j);
		 }
		 
		 for(int i=1, j=20,x=15,y=3; j>=10; i++,j--,x-=2,y+=5) { //조건식을 제외한 곳들은 몇개가 들어가던 상관없다
			 System.out.println(i+","+j+","+x+","+y);
		 }*/
		 //for문을 while문처럼 사용할수있다
		 
		 //예를들어
		 //while(true)는 무한반복
			/*		 
					 for(;;) { // 이런식으로 세미콜론 두개만 넣으면 for도 무한반복 가능
						 System.out.println(num4);
						 if(num4 >= 8)
							 break;
						 num4++;
					 }
			*/
		 
/*		//중첩for문에서 원하는 반복문을 빠져나오고 싶을 때
			 forloop: for(int dan=2; dan<=9;dan++) { // 이름 명시
				 for(int i=1; i<=9;i++) {
					 System.out.println(dan+"*"+i+"="+ dan*1);
					 if(i==5)
						 break forloop; // for문에 이름을 설정하고 break뒤에 붙였던 이름을 달면 해당 for문을 빠져나온다
				 }
				 System.out.println();
			 }*/
	
			 
			 
		outer : for(int dan=2; dan<=9;dan++) {
				mid : for(int i=1; i<=9;i++) {
					for(int z=1; z<=5;z++) {
					System.out.println(dan+","+i+","+ z);
					if(z==3)
						break mid;
					}System.out.println("mid for문 종료");// z가 3일때 이름 입력한 ofr문을 빠져나감으로 종료문구가 안나온다
				}System.out.println();
			}System.out.println();
			 
			 
			 
			 
			 
			 
		 
		 
	}

}
