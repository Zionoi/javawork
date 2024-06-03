package _05_Thread;



class AutoSaveThread extends Thread {
	@Override
	public void run() {
		while(true) {// 데몬스레드는 보통 무한반복으로 만든다. 메인스레드가 종료될때 같이 종료되기 때문
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				break; // 오류나면 멈추시오
			}
			autoSave();
		}
	}
	
	void autoSave() { // 자동저장 메소드
		System.out.println("파일이 자동저장됨");
	}
	
}



public class T08_DaemonThread {

	public static void main(String[] args) {
		AutoSaveThread t = new AutoSaveThread();
		//꼭 true를 써줘야한다.
		t.setDaemon(true); // 데몬스레드는 꼭 start전에 시작해줘야한다
		t.start();
		
		for(int i=0;i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
	}

}
