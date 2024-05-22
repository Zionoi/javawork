package _04_interface;

public interface RemoteControl {
	public static final int MAX_VOLUME = 100;
	
	// public static final을 붙이지 않으면 컴파일시 자동으로 붙인다.
	int MIN_VOLUME = 0;  // 그러므로 이 변수는 상수
	
	//인터페이스에는 무조건 추상메소드만 있어야함
	public abstract void turnOn();
	//메소드도 변수처럼 public abstractd을 붙이지 않으면 컴파일시 자동으로 붙인다.
	void turnOff();
	void setVolume(int volume);
	
	/*	구현이 된 메소드는 생성할 수 없다.
		void setChannel(int channel) {
			System.out.println(channel);
		}
		*/
	
	
	// default 메소드 : 실행문을 넣을 수 있다
	// 오버라이딩을 해도 되고 필요없으면 안해도 된다.
	default void search (String msg) {
		System.out.println("나중에 추가한 메소드" + msg);
	} 
	
	
	// static 메소드 : 실행문을 넣을 수 있다
	// 오버라이딩을 할 수 없다.
	static void info() { //오버라이드x
		System.out.println("static() 메소드");
	}
	
	

}
