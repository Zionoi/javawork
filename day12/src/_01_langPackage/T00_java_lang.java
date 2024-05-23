package _01_langPackage;

public class T00_java_lang {

	public static void main(String[] args) {
		// java.lang 패키지
		/*
		 -자바 프로그램의 기본적인 클래스를 담은 패키지
		 -포함된 클래스와 인터페이스는 import없이 사용
		 -주요 클래스
		 
		 Object
		 System
		 Class
		 String
		 StringBuffer, StringBuilder
		 Math
		 Wrapper(Byte, Short, Character, Integer, Float, Double)
		 
		 
		 
		 
		 
	//	Object 클래스의 메서드
	 	- 모든 클래스의 최고 조상. 오직 11개의 메서드만을 가지고 있다
	 	-notify(), hashCode(), toString()은 적절히 오버라이딩해야 한다
	 	
	 		//Object클래스의 메서드
	 		 
	 		  protected Object clone() : 객체 자신의 복사본을 반환한다.
	 		  public boolean equals (Object obj)  : 객체 자신과 객체 obj가 같은 객체인지 알려준다(같으면 true) (주소가 같은가)
	 		  protected void finalize() : 객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출. 이 때 수행되어야하는 코드가 있는 경우에만 오버라이딩한다
	 		  public Class getClass() : 객체 자신의 클래스 정보를 담고 있는 Class인스턴스를 반환
	 		  public int hashCode() : 객체 자신의 해시코드를 반환한다.
	 		  public String toString() : 객체 자신의 정보를 문자열로 반환한다.
	 		  아래부터는 쓰레드사용시 사용
	 		  public void notify() : 객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다.
	 		  public void notifAll() : 객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.
	 		  public void wait() :
	 		  public void wait(long timeout) :
	 		  public void wait(long timeout, int nanos) : 다른 쓰레드가 notify()나 notifyAll()호출할 때까지 현재 쓰레드를 무한히 또는 지정된 시간(timeout, int nanos)동안 기다리게 한다. (timeiut은 천 분의 1초, nanos는 10의9승분의 1초)
	 		 
		 
		 
		 
		 
		 
		 
		 */
	}

}
