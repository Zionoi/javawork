package _01_array;

public class T02_2차원배열 {

	public static void main(String[] args) {
				
		/*
		int[] iarray = nuew int[5];   열
		int[][] iarray2 = nuew int[3][5];  행 열
		int[][][] iarray3 = nuew int[2][3][5];  고 행 열
		
		
		
		
		*/
		
				
				// 2차원 배열 [행의index][열의index]
				// 배열표시가 두개   
				int[][] score = {
								 { 1, 2, 3, 4, 5},  // [0]
								 { 6, 7, 8, 9,10},  // [1]
								 {11,12,13,14,15}   // [2]
								};
								/*						//[0][1][2][3][4]	 인덱스번호
										 
										System.out.println(score[0][2]);// 인덱스번호로 좌표 호출 결과값 3
										System.out.println(score[2][3]);//  결과값 14
										
										//3차원 배열은
										//배열표시가 세개 [][][]
								
										
										// 행의 길이를 가져오고싶다면
										System.out.println("행의 길이 : "+score.length); // .length를 쓰면 행(세로)의 길이를 구해준다
										System.out.println("score[0]의 길이(열길이) : "+score[0].length); // 변수옆에 대괄호하고 인덱스번호를 붙이면 열의(가로)길이를 구해준다
								*/
		
				//가정 위에 배열을 전부다 출력하고싶다면
				/*
				score[0][1]
				score[0][2]
				score[0][3]
				score[0][4]
				score[0][5]
				하나하나 다적으면 너무 비효율적 for을 사용할수 있다
				*/
/*					
				for(int i=0; i<3; i++) { // i는 스코어의 행의 길이까지 반복되야하므로 3 대신 score.length로 바꿔도 된다
					for(int j=0; j<5;j++) {// 마찬가지로 열의 길이를 반복해야하므로 5대신 score[0].length를 사용할수있다
						System.out.println(score[i][j] + ", ");
				}
				System.out.println();
	}
				for(int i=0; i<score.length; i++) { // i는 스코어의 행의 길이까지 반복되야하므로 3 대신 score.length로 바꿔도 된다
					for(int j=0; j<score[i].length;j++) {// 마찬가지로 열의 길이를 반복해야하므로 5대신 score[0].length를 사용할수있다
										// 열의 길이가 열마다 다를수도있으므로 인덱스번호를 i로 설정하면 정상출력 할수있다
						System.out.println(score[i][j] + ", ");
					}
					System.out.println();
				}*/
			
				
				//변수에 덮어쓰기도 할 수 있다
	/*	
				 1, 3, 5, 7, 9
				11,13,15,17,19
				21,23,25,27,29
			
	*/
				
	/*		
				for(int i=0; i<score.length; i++) {
					
					for(int j =0; j<score[i].length; j++) {
						score[i][j] = score[i][j]*2-1;
						System.out.print(score[i][j]+",");
						
					}System.out.println();
					
				}	
				
	*/			
				/*다른방법
				  1, 3, 5, 7, 9
				 11,13,15,17,19
				 21,23,25,27,29 
				  
				 */
				/*			
					  int count = 1; // 위 변수 증가값 넣어줄 임의 변수count설정
					  
							for(int i=0; i<score.length; i++){ // i는 score행 값만큼 반복
							for(int j=0; j<score[i].length; j++){// j 는 score의 '열갯수'(열안의 값이 아님)보다 작을때만 반복 -> j< score[i].length
							score[i][j] = count;
							System.out.print(score[i][j] + ", ");
							count +=2;
						}
						System.out.println();
					}
				*/				
					
				
				
	int[][] iArr= {{1,2,3},
					{4,5},
					{6,7,8,9}};
/*		[0].length = 3
		[1].length = 2
		[2].length = 4
*/		// 위처럼 열마다 배열 갯수가 다른경우 값 덮어쓸때 꼭 길이값에 [i].length를 쓰기			
/*
	
	for(int i=0; i<iArr.length; i++){ // i는 score행 값만큼 반복
					for(int j=0; j<iArr[i].length; j++){// j 는 score의 '열갯수'(열안의 값이 아님)보다 작을때만 반복 -> j< iArr[i].length
					}System.out.print(iArr[i][j] + ", ");
				}				
				*/	
					
					
	
	}
}
