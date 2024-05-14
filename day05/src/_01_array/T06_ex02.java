package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T06_ex02 {

	public static void main(String[] args) {
		


		// 문제
		// 1. 길이 10인 배열을 선언하고 1~10까지 반복문을 이용하여 순서대로 넣고 출력하기
		/*	
			int[] arrA = new int[10];
		
		
			for(int i=0; i<10; i++) {
				arrA[i] = i+1;
				System.out.print(arrA[i]+", ");
		
			}
		
		
		
		
					System.out.println();
		 */

		// 2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣고 값 출력
		/*
					int[] arrB = new int[10];
							for(int i=0; i<arrB.length;i++) {
								arrB[i]=10-i;
								System.out.print(arrB[i]+", ");
							} 
		*/	
		 

		// 3. 사용자로 부터 입력받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력
			Scanner sc = new Scanner(System.in);
			/*	
						System.out.println("숫자를 입력하세요 : ");
						int num1 = sc.nextInt();
						int[] arrC = new int[num1];
							for(int i=0; i<num1;i++) {
								arrC[i]= i+1;
							System.out.print(arrC[i]+", ");
							}
			 */
		/*
				// 4. 길이가 5인 배열에 사과, 귤, 포도, 복숭아, 참외로 초기화한후 배열 인덱스를 이용하여 귤 출력
				String[] arrD = new String[5];
				arrD[0] = "사과";
				arrD[1] = "귤";
				arrD[2] = "포도";
				arrD[3] = "복숭아";
				arrD[4] = "참외";
				// arrD[] = {"사과","귤","포도","복숭아","참외"};
				System.out.println(arrD[1]);
		*/
		/*			
					5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
					   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
					   ex)
					   문자열 : application
					   문자 : i
					   application에 i가 존재하는 위치(인덱스) : 4 8 
					   i 개수 : 2
		
		 */
		/*	
					String[] s;
			
					System.out.println("문자를 입력하시오 : ");
					String inputString = sc.next();					//단어 입력 받음
					char[] charArray = new char[inputString.length()]; // char 배열 변수 선언
			
					for (int i = 0; i < inputString.length(); i++) {	
						charArray[i] = inputString.charAt(i); // 입력받은 단어 글자별로 char배열에 덮어쓰기
			
					}
					int num=0;
					System.out.println("검색할 문자를 입력 : "); 
					char inputChar = sc.next().charAt(0);   // 검색할 글자 입력받음
					
					System.out.println("문자열 : "+inputString);
					System.out.println("문자 : "+inputChar);
					System.out.println(inputString+"에"+inputChar+"가 존재하는 위치(인덱스)");
					for(int i = 0; i<inputString.length();i++) {
						if(inputChar == charArray[i]) {
							System.out.print(i+" ");
							num++;
						}
							
					}System.out.println("\n"+inputChar+"개수 : "+num+"개");
			
		*/	

		/*			
					6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
					   숫자와 같은 요일 출력
					   ex.
					   0 ~ 6 사이 숫자 입력 : 4			
					   금요일
					   0 ~ 6 사이 숫자 입력 : 7
					   잘못 입력하셨습니다.
		 */
		/*		
						String[] day = {"월", "화", "수", "목", "금", "토", "일"};
						System.out.println("0~6까지의 번호를 입력하세요 : ");
						int num6 = sc.nextInt();
						
						if(num6>6 || num6<0) {
							System.out.println("잘못입력하셨습니다");
						}else {
						System.out.println("선택한 요일 : " + day[num6]);
						}
				*/

		/*			
					7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
					   배열 전체의 합 출력
		 */
		/*		
					System.out.println("숫자를 입력하시오 : ");
					int num7 = sc.nextInt();
					int[] inputArr= new int[num7];
					int i=0;
					int inputTo = 0;
					
					while( i<inputArr.length) {
						System.out.println("입력한 수만큼 숫자를 입력하시오 (엔터로 구분)입력횟수("+i+"회 : ");
						int inputNum = sc.nextInt();
						
						inputArr[i] = inputNum;
						inputTo += inputNum;
						i++;
						}
					System.out.println(Arrays.toString(inputArr));
					System.out.println("배열의 합 : "+inputTo); 
		*/

			/*			
					8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
					   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
					   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
					   다시 정수를 받도록 하세요. 
		
					   ex.
					   정수 : 4
					   다시 입력하세요.
					   정수 : -6
					   다시 입력하세요.
					   정수 : 5
					   1, 2, 3, 2, 1
		 */
			/*//풀이1
				while(true)	{
						System.out.println("\n3이상의 숫자를 입력하시오 : ");
						int num8 = sc.nextInt();
						
						if(num8%2==0 || num8<3) {
							System.out.println("다시 입력하세요.");
						continue;
						
						}else {
						for(int i=1; i<=num8/2+1; i++) {
							System.out.print(i+", ");
						}
						for(int i=num8/2;i>0;i--) {
							System.out.print(i+", ");
						}
						}		
						
						}
			*/
			//교수님 풀이
			/*
				while(true) {
					System.out.println("정수 입력 : ");
					int num8 = sc.nextInt();
					
					if(num8>=3 && num8%2==1) {
						int iarr8[] = new int[num8];
						
						int value = 1;
						for(int i=0; i<iarr8.length; i++) {
							if(i < num8/2)
								iarr8[i] = value++;
							else
								iarr8[i] = value--;
							if(i < iarr8.length-1)			// 결과값 마지막에 ,를 안찍고싶다면 if문을 이용하면 해결가능
								System.out.print(iarr8[i]+", ");
							else 
								System.out.println(iarr8[i]);
						}
						break;
						
					}else {
						System.out.println("다시 입력하세요");
					}
				}
			*/	
			
			

		/*			
					9. 사용자가 입력한 값이 배열에 있는지 검색하여
					   있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
					   단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
					   ex.
					   치킨 이름을 입력하세요 : 양념			
					   양념치킨 배달 가능
		
					   치킨 이름을 입력하세요 : 불닭
					   불닭치킨은 없는 메뉴입니다.
		 */
		/*//내 풀이
			String[] chiMenu = { "후라이드", "양념", "간장", "마라" };
			boolean found = false;
			
			System.out.println("치킨 이름을 입력하세요 : ");
			String order = sc.next();
			for (int i = 0; i < chiMenu.length; i++) {
				if( order.equals(chiMenu[i]) ) {
					System.out.println(chiMenu[i]+"치킨 배달 가능");
					found = true;
					break;
				}
			}
			if(!found)	
			System.out.println(order+"치킨은 없는메뉴입니다");
		 */
		/*	//교수님 풀이
				String[] chickens = {"양념","후라이드","파닭","허니버터"};
				System.out.println("치킨 이름 입력 : ");
				String menu = sc.next();
				
				boolean flag = false;
				for(int i = 0; i<chickens.length; i++) {
					if(menu.equals(chickens[i])) {//String은 서로 값이 같은지 물어보려면 equals를 써야함
						flag = true;
						break;
					}
				}
				
				if(flag)
					System.out.println(menu + "치킨 배달 가능");
				else
					System.out.println(menu + "치킨은 없는 메뉴 입니다");
			*/	
		/*			
					10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
					     1~10 사이의 난수를 발생시켜 배열에 초기화 후
					     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		
					     ex.
					     5 3 2 7 4 8 6 10 9 10 
					     최대값 : 10
					     최소값 : 2
		
		 */
		/*	//내풀이
				int[] arr10 = new int[10];  //10개 값 저장할 수 있는 배열 선언
				
				
				for(int i = 0; i<arr10.length; i++) { //배열 길이 갯수만큼 반복되는 반복문 시작
					int randomint = (int)(Math.random()*10)+1; // 1~10까지 랜덤 정수 생성
					arr10[i] = randomint; // 생성된 랜덤정수를 배열 i 번째에 배정
					System.out.print(arr10[i]+" "); //배정된 i번째 배열값 출력 
				}									//반복
				int min = arr10[0];
				int max = arr10[0];
				for(int i= 0; i <arr10.length;i++) {
					if(min > arr10[i]) {
						min = arr10[i];
						
					}
				}
				for(int i= 0; i <arr10.length;i++) {
					if(max < arr10[i]) {
						max = arr10[i];
						
					}
				}
				System.out.println("\nmin 값 : "+min);
				System.out.println("max 값 : "+max);
			
			//
			*/
		
			//교수님 풀이
			int[] iarr10 = new int[10];
			for(int i=0; i<iarr10.length;i++) {
				iarr10[i] = (int)(Math.random()*10)+1;
				System.out.print(iarr10[i]+" ");
			}
			
			int min = iarr10[0];
			int max = iarr10[0];
			
			for(int i=1; i<iarr10.length; i++) { // i를 0이아닌 1부터해도 된다. 변수 min과 max가 배열인덱스 0의 값이기 때문에
				if(min>iarr10[i])
					min = iarr10[i];
				
				if(max < iarr10[i])
					max = iarr10[i];
			}
			System.out.println("\nmin 값 : "+min);
			System.out.println("max 값 : "+max);
	
	}
}
