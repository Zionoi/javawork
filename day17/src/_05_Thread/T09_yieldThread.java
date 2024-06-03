package _05_Thread;
class ThreadA extends Thread {
	boolean stop = false;  //쓰레드의 종료 목적
	boolean work = true; // yield메소드를 호출한 시점을 알기 위한 목적
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else {
				Thread.yield(); //yield 호출
			}
	}
		System.out.println("ThreadA 쓰레드 종료");
}
}

	class ThreadB extends Thread {
		boolean stop = false;  //쓰레드의 종료 목적
		boolean work = true; // yield메소드를 호출한 시점을 알기 위한 목적
		@Override
		public void run() {
			while(!stop) {
				if(work) {
					System.out.println("ThreadB 작업 내용");
				}else {
					Thread.yield(); //yield 호출
				}
			}
			System.out.println("ThreadB 쓰레드 종료");
		}
	}

public class T09_yieldThread {

	public static void main(String[] args) {
		// yield : 양보
		
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
		
		// a, b 3초동안은 번갈아 가면서 실행
		try {
			Thread.sleep(1); //sleep할땐 꼭 try catch 해줘야함
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("0.5초 끝");
		ta.work = false; // 3초 후에는 B작업 만
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		ta.stop = true; a종료
//		tb.stop = true; b종료
		System.out.println("0.1초 끝");
		tb.work = false; // 3초후에는 A작업
		
	}

}
