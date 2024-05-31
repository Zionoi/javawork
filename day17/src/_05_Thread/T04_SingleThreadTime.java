package _05_Thread;

public class T04_SingleThreadTime {

	public static void main(String[] args) {
		
		//밀리세컨드 단위로 가져오는 메소드
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		for(int i = 0; i<500; i++) {
			System.out.println("&");
		}
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+(endTime-startTime));
		
		for(int i=0;i<500;i++) {
			System.out.println("#");
		}
		System.out.println();
		System.out.println("총 소요시간 : "+ (System.currentTimeMillis()-startTime));
		
	}

}
