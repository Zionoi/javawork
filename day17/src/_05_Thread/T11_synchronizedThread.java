package _05_Thread;

class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}
	
	synchronized void withraw(int money) {
		if(balance >= money) {// 갖고있는돈이 찾고자하는돈보다 크거나 같을때 실행
		
			try {
				Thread.sleep(1000); // 1초 슬립후에 밑에 출금 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}	
	}
 	
}
class ThreadC implements Runnable {
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = ((int)(Math.random()*3)+1)*100; // 100,200,300원중에 랜덤으로
			System.out.println("출금금액 : "+money);
			acc.withraw(money);
			System.out.println("잔액 : " + acc.getBalance());
		}
	}
}

public class T11_synchronizedThread {

	public static void main(String[] args) {
		/*	// 동기화 두 개 이상의 스레드가 하나의 객체에 동시에 접근할때 혼동이 생기지 않도록 하기 위함
			// 스레드의 동기화 
			// 한 번에 하나의 스레드만 객체에 접근할 수 있도록 객체에 락을 걸어서 데이터의 일관성을 유지하는것
			// 1. extends Thread 했을때
			Thread tc1 = new Thread(new ThreadC());
			tc1.start();
			
			Thread t1 = new Thread(new ThreadC());
			t1.start();
			//한줄로
			new Thread(new ThreadC()).start(); // 이렇게 한줄로도 가능 다만 이렇게하면 재사용을 할수가없다. 변수에 넣지 않았기때문에 호출을 못하기때문
			
			// 2. implements Runnable 했을 때
			Thread t2 = new Thread(new ThreadC());
			t1.start();
			t2.start();
			
			
		//두줄로
			Runnable r = new ThreadC(); // 이런식으로 쓰레스로 객체생성후 러너블에 넣어줘도 가능
			new Thread(r).start();
			
		// 한줄로	
		 	new Thread(new ThreadC()).start();
		  
			Thread t3 = new Thread(r); // 그후에 위에처럼 쓰레드매개변수에 변수로 넣으면 위와 같은 상태
		//		t3.start();
		//		new Thread(r).start();
		*/
		
		
		Runnable r = new ThreadC();
		new Thread(r).start();
		new Thread(r).start();
		
		
		
	}

}
