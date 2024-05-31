package _05_Thread;
class PThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print("#");
			for(int j=0; j<10000000; j++);// 비어있는 for문이 돌아가는동안 쉬게되니 sleep과 같은 기능을 의도함
		}
	}
}
class PThread2 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print("|");
			for(int j=0; j<10000000; j++);// 비어있는 for문이 돌아가는동안 쉬게되니 sleep과 같은 기능을 의도함
		}
	}
}

public class T06_ThreadPriority {

	public static void main(String[] args) {
		// ThreadPriority : 스레드 우선순위
		// 우선순위 숫자로 넣어주거나 멕스나 민같은 문자로 설정도 가능하다
		
		PThread pt1 = new PThread();
		PThread2 pt2 = new PThread2();
		
		//.getPriority() : 쓰레드의 우선순위를 가져옴 설정 안하면 기본 설정값 5
		System.out.println("pt1의 우선순위 : " + pt1.getPriority()); 
		System.out.println("pt2의 우선순위 : " + pt2.getPriority()); 
		
		//.setPriority() : 쓰레드의 우선순위를 int 값으로 설정하는 메소드 1~10까지 설정가능
//		pt1.setPriority(7);
//		System.out.println("pt1의 우선순위 : " + pt1.getPriority()); 
//		또는 
		pt2.setPriority(Thread.MAX_PRIORITY);
		pt2.setPriority(Thread.MIN_PRIORITY);// 이런식으로 최댓값 최솟값을 설정할수도 있다
		pt2.setPriority(9);
		pt1.start();
		System.out.println();
		pt2.start();
		
	}

}
