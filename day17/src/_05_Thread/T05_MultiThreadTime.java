package _05_Thread;
class MultiThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.println("#");
		}
		System.out.println();							//startTime을 static으로 만들어서 클래스이름붙이면 객체생성없이 그냥 사용가능하다
		System.out.println("쓰레드 소요시간 : "+ (System.currentTimeMillis()-T05_MultiThreadTime.startTime));
	}
}
public class T05_MultiThreadTime {
	static long startTime = 0;
	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		mt.start(); //스레드를 먼저 시작하고 시간을 넣어줌
		
		//밀리세컨드 단위로 가져오는 메소드
		startTime = System.currentTimeMillis();
		System.out.println(startTime);
		//for문의 소요시간을 구하려면
		for(int i = 0; i<500; i++) {
			System.out.println("&");
		}
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("메인 소요시간 : "+(endTime-startTime));
		
		
		
	}

}
