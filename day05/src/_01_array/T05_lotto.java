package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T05_lotto {

	public static void main(String[] args) {
		// 로또 만들기
		/*
		 1. 6개의 1차원 정수배열 만들기
		 2. 1~45까지의 숫자를 랜덤으로 추출해서 배열에 넣기
		 3. 만약 뽑은 번호가 배열에 있다면 다시 뽑고, 없다면 배열에 넣는다.
		 4. 6개의 번호를 다 뽑을 때까지 반복한다.
		 5. 6개의 번호를 출력

		 */
		/*	
			int[] lotto = new int[6]; // 정수가 6개인 배열 초기값 [0,0,0,0,0,0]

			int index = 0;
			while(true) {
				int temp = (int)(Math.random()*45)+1;  //1~45까지의 랜덤 정수를 만드는 식을 임의 변수temp에 넣는다


				boolean insert = true;			//배열에 들어있는 값과 temp의 값이 다르면
				for(int i=0; i<=index; i++){			// 반복횟수를 lotto.length로해도 오류는 없으나 그렇게되면 앞회차에서는 불필요하게 반복되는 수가 생기므로 index번호만큼 돌게한다
					if(lotto[i] == temp) 
					{	insert = false; 		//배열에 들어있는 값과 temp의 값이 같으면
						break;					//insert의 값이 true이면 배열에 temp의 값을 넣어줌
					}
				}
				if(insert ==true) {//==true가 없어도 똑같이 실행된다. 위에 boolean으로 선언해서 값이 true false중에 하나로 설정된다
					lotto[index]=temp;  //insert가 true이면 lotto배열에 temp값 넣게
					index++;
				}
				if(index == 6) // 배열이 6개가 꽉 차면 while 빠져나오기
					break; 

			}		
				System.out.println(Arrays.toString(lotto));
		 */

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
		/*			int[] arrB = new int[10];
						for(int i=0; i<10;i++) {
							arrB[i]=i+1;
							System.out.print(arrB[i]+", ");
						} for(int i = 9; i>=0;i--) {
							System.out.print(arrB[i]+", ");
						}

		 */

		// 3. 사용자로 부터 입력받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력
		Scanner sc = new Scanner(System.in);
		/*			System.out.println("숫자를 입력하세요 : ");
					int num1 = sc.nextInt();
					int[] arrC = new int[num1];
						for(int i=0; i<num1;i++) {
							arrC[i]= i+1;
						System.out.println(arrC[i]+", ");
						}
		 */

		// 4. 길이가 5인 배열에 사과, 귤, 포도, 복숭아, 참외로 초기화한후 배열 인덱스를 이용하여 귤 출력
		String[] arrD = new String[5];
		arrD[0] = "사과";
		arrD[1] = "귤";
		arrD[2] = "포도";
		arrD[3] = "복숭아";
		arrD[4] = "참외";
		// arrD[] = {"사과","귤","포도","복숭아","참외"};
		System.out.println(arrD[1]);

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
						
				}System.out.println(inputChar+"개수 : "+num+"개");
		
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
					
					if(num6>6) {
						System.out.println("잘못입력하셨습니다");
					}else {
					System.out.println("선택한 요일 : " + day[num6]);
					}
			*/

		/*			
					7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
					   배열 전체의 합 출력
		 */
			System.out.println("숫자를 입력하시오 : ");
			int num7 = sc.nextInt();
			int[] inputArr= new int[num7];
			int i=0;
			int inputTo = 0;
			
			while( i<inputArr.length) {
				System.out.println("입력한 수만큼 숫자를 입력하시오 (엔터로 구분) : ");
				int inputNum = sc.nextInt();
				
				inputArr[i] = inputNum;
				inputTo += inputNum;
				i++;
				}
			System.out.println("배열의 합 : "+inputTo); 
			
			
		
		
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
		/*
					System.out.println("3이상의 숫자를 입력하시오 : ");
					int num8 = sc.nextInt();
					
					if(num8%2==0 || num8<3) {
						System.out.println("다시 입력하세요.");
					
					
					}else {
					for(int i=1; i<=num8; i++) {
						System.out.print(i+", ");
					}
					for(int i=num8-1;i>0;i--) {
						System.out.print(i+", ");
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

		/*			
					10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
					     1~10 사이의 난수를 발생시켜 배열에 초기화 후
					     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

					     ex.
					     5 3 2 7 4 8 6 10 9 10 
					     최대값 : 10
					     최소값 : 2

		 */

		//

	}

}
