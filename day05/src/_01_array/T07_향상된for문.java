package _01_array;

import java.util.Arrays;

public class T07_향상된for문 {

	public static void main(String[] args) {
		/* 	향상된 for문 
			- 배열에서만 사용가능
			- 배열을 처음부터 끝까지 사용할 때 사용 (배열의 부분적용 불가능)
		*/ 
	
		int num[]= {1,2,3,4,5};
		
		for(int result : num) {//배열을 넣어줄 임의 변수생성 자료형은 넣을 배열의 자료형으로 지정해야함
			System.out.println(result); //1,2,3,4,5 출력
	
		}
		
		String name[] = {"홍길동","아무개","김길동"};
		for(String result1 : name) {
			System.out.println(result1);
		}
		
		
		// 배열의 단점 
		//	-배열의 크기가 넣을 값보다 크면 메모리가 낭비된다
		// 	-배열의 크기가 적을 경우 나중에 늘릴 수 없다
		//	
		
		
		// 배열의 크기가 적을경우 copy 하여 만들어야 함
		
		int[] oldScore = {98, 34, 65, 80, 52}; // 배열의 크기가 5개인데 더 추가해야할때
		int[] newScore = new int[10];			// 새로 배열을 더크게 생성후 여기에 덥어 쓴다
		
		for(int i=0; i<oldScore.length; i++) {
			newScore[i] = oldScore[i];
		}
		newScore[5] = 57;
		System.out.println(Arrays.toString(newScore)); 
		// 위와 같은 경우가 많아서 라이브러리(api)로 만들어져있음 
		// System.Arraycopy(복사할배열, 복사할index번호, 새배열,새배열의index(부터넣기),몇개가져올지)
		
		System.arraycopy(oldScore, 0, newScore, 6, 4);
		// oldScore에 인덱스 몇번부터 카피후 newScore에 몇번인덱스에 넣겠다 마지막 번호는 갯수 몇개를 가져올지
		System.out.println(Arrays.toString(newScore)); 
		
		
		
		//문제 3개를 넣을 수 있는 문자열 배열 만들어서 값을 넣고 10개짜리 배열을 만들어서 복사하여 넣기
		//(index 5번부터 2개만 넣기)
		String[] srtarr = {"서울","광주","강동"};
		String[] newsrt = new String[10];
		
		System.arraycopy(srtarr, 0, newsrt, 5, 2);
		
		System.out.println(Arrays.toString(newsrt));
		
		
		
	}

}
