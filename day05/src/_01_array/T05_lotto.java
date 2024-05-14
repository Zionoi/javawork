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


	}

}
