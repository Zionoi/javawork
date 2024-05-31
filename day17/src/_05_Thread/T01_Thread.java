package _05_Thread;

class Thread1 extends Thread{
	@Override
	public void run() {
		setName("my쓰레드"); //쓰레드에 이름넣어주고 싶으면 쓰레드 상속받았을 경우엔 이렇게 해주면된다
		for(int i=0;i<1000;i++) {
			System.out.println(i+getName());
		}
			
			
	}
}
class Thread2 implements Runnable{
	@Override
	public void run() {
		Thread.currentThread().setName("imple쓰레드"); // Runnable를 상속맏았을 경우에 스레드에 이름 넣어주고싶으면 이렇게 하면 된다
		for(int i=10;i<1000;i++) {
			System.out.println(i*1000);
		}
}
}
class Thread3 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("ㅡ");
		}
}

}



public class T01_Thread {

	public static void main(String[] args) {
		// process_Thread
		/*
		프로세스 : 실행 중인 프로그램, 자원(resources)과 스레드로 구성
		스레드 : 프로세스 내에서 실제 작업을 수행.
				모든 프로세스는 하나 이상의 스레드를 가지고 있다.
					프로세스 : 스레드 = 공장 : 일꾼
					
					
		싱글 스레드 프로세스 = 자원 + 스레드
		
		
		멀티 스레드 프로세스 = 자원 + 스레드 + 스레드 +... 스레드

	
	
		멀테프로세스 vs 멀티스레드
		하나의 새로운 프로세스를 생성하는것보다
		하나의 프로세스에서 여러 스레드를 생성하는게 비용이 절감된다
		
		
		많은 프로그램들이 멀티스레드로 작성되어있다.
		그러나, 멀티스레드 프로그래밍이 장점만 있는 것은 아니다.
		
		멀티스레드의 장단점
		장점
		- 자원을 효율적으로 사용
		- 사용자에 대한 응답성(responseness)이향상된다
		- 작업이 분리되어 코드가 간결해 진다
			"여러모로좋다"
		
		
		단점
		- 동기화(synchronization)에 주의해야한다.
		- 교착상태(dead-lock)가 발생하지 않도록 주의해야 한다.
		- 각 스레드가 효율적으로 고르게 실행될 수 있게 해야 한다.
			"프로그래밍할 때 고려해야 할 사항들이 많다."
*/

			Thread1 t1 = new Thread1();
			Thread t2 = new Thread(new Thread2()); // Runnable을 impliment 했을땐 이렇게 객체를 불러온다
			Thread3 t3 = new Thread3();
			t1.start(); //스레드 시작하는 방법
			t2.start();
//			t3.start();
			







		
	}


}