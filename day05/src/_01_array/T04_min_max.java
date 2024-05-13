package _01_array;

import java.util.Arrays;

public class T04_min_max {

	public static void main(String[] args) {
		//자리바꿈
				/*
				int num1 = 10;
				int num2 = 20;
				
				num1 = num2;  // num2의 20을 num1에 덮어쓰기
				num2 = num1; // 자리바꿈 안됨. num1은 이미 20으로 바뀌었기때문에
				*/
				//자리바꿈을 하려면 임시변수를 하나 더 만들어둔후 거기에 저장해둔다
				int num1 = 10;
				int num2 = 20;
				
				int temp = num1;
				
				num1 = num2;  
				num2 = temp; 
		
		
		
				/*		
						// min_ max
						// 1차원 배열의 min값과 max값 가져오기
						int[] score = {8,4,9,2,6,1,3,5,7};
						
						//min값 구하기
						int min = score[0];  //min = 8 이걸 각 인덱스마다 크기 비교후 대상이 작으면 자리바꿈 대상이 크면 그대로 넘어가기
						
						for(int i=1; i<score.length ;i++) {// 1차원행렬일땐 열의 갯수구할때 변수옆에 []를 넣지 않는다. 2차원부터 열의 갯수구할땐 []을 넣는다
						if(min>score[i]) {
							min=score[i];
							}
						}System.out.println("최솟값 : "+min);
						
						for(int i=1; i<score.length ;i++) {// 1차원행렬일땐 열의 갯수구할때 변수옆에 []를 넣지 않는다. 2차원부터 열의 갯수구할땐 []을 넣는다
							if(min<score[i]) {
								min=score[i];
								}
							}System.out.println("최댓값 : "+min);
						
						*/
		
			/*		
					//index번호 연산 가능
						int k=0;
						System.out.println(score[k]);//k는 0이니 8이 출력
						System.out.println(score[k+5]); // 0,1,2,3,4,5번째 index값인 1번이 출력됨
						k=2;
						System.out.println(score[k*3]);
						System.out.println(score[k-1]);// 연산자 다 가능
					
						*/
			
			int arri[] = new int[10];
			for(int i=0; i<arri.length; i++) {
				arri[i] = (int)(Math.random()*10); //0~9까지 랜덤으로 i값 생성
			}
			for(int i=0; i<arri.length; i++) {
				System.out.print(arri[i]+", "); //
			}
			
			System.out.println();
			//Arrays 클래스 라이브러리(API)를 이용한 출력  
			System.out.println(Arrays.toString(arri));//위에 for문을 사용하지 않고도 랜덤값 출력 가능 (오버라이딩)
			

	}

}
