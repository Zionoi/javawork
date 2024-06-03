package _05_Thread;
class SumThread extends Thread {
	private int sum;

	public int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<= 10000;i++) {
			sum += i;
		}
		System.out.println("종료");
	}
	
	
	
	
}



public class T10_joinThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumT = new SumThread();
		sumT.start();
/*
		try {
			Thread.sleep(1); //  위에 스레드가 끝날때까지 기다렸다가 출력 받기위해 슬립 사용. 그러나 위에 스레드가 언제끝날지 모르기때문에 원하는결과가 안나올수 있음
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
*/		
		
		try {
			sumT.join(); // 그러기 위해 사용하는것이 join. sumT라는 스레드가 끝날때까지 기다렸다가 실행하기위한 목적
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		
		System.out.println("1~10000까지 합 : " + sumT.getSum());
		
	}

}
