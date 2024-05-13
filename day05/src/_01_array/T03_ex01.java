package _01_array;

import java.util.Scanner;

public class T03_ex01 {

	public static void main(String[] args) {
		// 사용자로부터 3사람의 국어, 수학, 컴퓨터 점수 입력
		/* 번호	국어	수학	컴퓨터	총점	평균
		  	------------------------------
			1	90	100	100		290	96.67
			2	90	100	90		280	95.00
			3	90	80	100		270	90.00
		----------------------------------
			총점 270	280	290
			평균	90	93.	97.5
		
		*/
		int score [][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		/*	
			System.out.println("첫번째학생 국어점수 입력 : ");
			score[0][0] = sc.nextInt();
			System.out.println("첫번째학생 수학점수 입력 : ");
			score[0][1] = sc.nextInt();
			System.out.println("첫번째학생 컴퓨터점수 입력 : ");
			score[0][2] = sc.nextInt();
			
			System.out.println("두번째학생 국어점수 입력 : ");
			score[1][0] = sc.nextInt();
			System.out.println("두번째학생 수학점수 입력 : ");
			score[1][1] = sc.nextInt();
			System.out.println("두번째학생 컴퓨터점수 입력 : ");
			score[1][2] = sc.nextInt();
			
			하나하나씩 받을수도 있지만
			*/
	
		/*		// 점수를 한번에 다 받을수도 있다
				System.out.println(1+".번째학생 국어, 수학, 컴퓨터 점수 입력 (ex-80 60 70): ");
				score[0][0] = sc.nextInt();
				score[0][1] = sc.nextInt();
				score[0][2] = sc.nextInt();
				
				System.out.println(2+"번째학생 국어, 수학, 컴퓨터 점수 입력 (ex-80 60 70): ");
				score[1][0] = sc.nextInt();
				score[1][1] = sc.nextInt();
				score[1][2] = sc.nextInt();
			*/	
		for(int i=0; i<score.length; i++) { // score.length 행의 길이만큼 i를 반복
			System.out.print(i+1+".번째학생 국어, 수학, 컴퓨터 점수 입력 (ex-80 60 70): ");
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = sc.nextInt();

			}
		}
		
	/*	sum += score[0][0] 학생별 점수 총합 구하려면 이렇게
		sum += score[0][1]
		sum += score[0][2]*/

			System.out.println("번호\t국어\t수학\t컴퓨터\t총점\t평균");
			System.out.println("----------------------------");
			for(int i=0; i<score.length; i++) { // for문 반복문으로 간단하게 가능
				System.out.print(i+1+"\t");
				int sum = 0;
					for(int j=0; j<score[i].length; j++) {
						
						System.out.print(score[i][j]+"\t");
						
						sum += score[i][j]; //총점 // 1번째 학생의 총점이 들어있음으로 반복문 초반에 sum을 0으로 초기화해줘야함
						
					}
					System.out.print(sum+"\t");
					System.out.printf("%.2f\n",(double)sum/score[i].length);// 평균구하는 식
					//System.out.println((double)sum/score[i].length);// 평균구하는 식
		
		
		
		
		
		/*	-------------------------------------------------------------------------
			int[][] score = new int[3][5];
			Scanner sc = new Scanner(System.in);
			int kor;
			int mth;
			int com;
			int i =0;
			
			for( i=0; i<score.length-1;i++) {
				for(int j = 0; j<score[i].length; j++) {
				System.out.println("국어, 수학 컴퓨터 점수를 차례대로 입력하시오(ex- 87 51 76) (입력한 학생수 "+i+"명) : ");
			 kor = sc.nextInt();
			 mth = sc.nextInt();
			 com = sc.nextInt();
				score [i][]
				i++;
				p++;
			
			}
			}
			*/

		/*	System.out.println("두번째 학생 국어, 수학 컴퓨터 점수를 차례대로 입력하시오(ex- 87 51 76) : ");
			
			int kor2 = sc.nextInt();
			int mth2 = sc.nextInt();
			int com2 = sc.nextInt();
			System.out.println("세번째 학생 국어, 수학 컴퓨터 점수를 차례대로 입력하시오(ex- 87 51 76) : ");
			
			int kor3 = sc.nextInt();
			int mth3 = sc.nextInt();
			int com3 = sc.nextInt();*/
		/*
				int total1 = kor1+mth1+com1;
					int total2 = kor2+mth2+com2;
					int total3 = kor3+mth3+com3;
				
					double aver1= total1/3.0;
					double aver2= total2/3.0;
					double aver3= total3/3.0;
				
				String[] cla = {"번호", "국어", "수학", "컴퓨터", "총점", "평균"};
				
				
				System.out.println(cla);
				*/
			}
	}

}
