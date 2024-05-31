package _05_Thread;

import java.awt.Toolkit;
class BeepThread extends Thread {
	//싱글스레드
	public void run() {
		int i = 0;
	for( i=0; i<15; i++);{
		try {	
			Thread.sleep(1000);//100당 1초 쉬게 하는 메소드
		
			System.out.println(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}	


public class T03_MultiThread {

	public static void main(String[] args) {
		// 윈도우에서 나는 경고음소리같은 기능등 여러 기능들이 들어있는 클래스
				int i=0;
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for( i=0; i<5; i++);{
				try {	
					Thread.sleep(500);//100당 1초 쉬게 하는 메소드
					toolkit.beep(); //경고음 내는 메소드
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
				

	}
	
}
