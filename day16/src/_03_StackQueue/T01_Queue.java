package _03_StackQueue;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	@Override
	public String toString() {
		return "Message [command=" + command + ", to=" + to + "]";
	}
	String command;
	String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}



public class T01_Queue {

	public static void main(String[] args) {
		/* LIFO 와 FIFO 컬렉션
		 후입선출(LIFO : Last In First Out)	
		 	나중에 넣은객체가 먼저 빠져나가는 구조
		 선입선출(FIFO : First In First Out)
		 	먼저넣은 객체가 먼저 빠져나가는 구조
		 
		 LIFO 자료구조를 제공 => 스택 클래스
		 FIFO 자료구조를 제공 => 큐 인터페이스
		 	
		 
		 Stack
		 	stack<E> stack = new Stack<E>();
		 	stack<E> stack = new Stack<>();
		 E push(E item) 스택에 넣는다
		 E pop() 스택의 맨 위객체를 빼낸다
		 
		
		Queue
			Queue<E> queue = new LinkedList<E>();
			Queue<E> queue = new LinkedList<>();
		 E offer(E item) 스택에 넣는다
		 E poll() 먼저들어온 객체를 빼낸다
				
		*/

		
		Queue<Message> msgQueue = new LinkedList<Message>();
		msgQueue.offer(new Message("sendMail", "홍길동"));
		msgQueue.offer(new Message("sendSMS", "아무개"));
		msgQueue.offer(new Message("sendKatalk", "김요한")); // LinkedList로 넣어서 배열로 쓰긴하나 인덱스번호로 출력할수는 없다
		
//		System.out.println(msgQueue[0]); // 오류
		
		System.out.println(msgQueue);// Queue에는 기본적으로 toString 오버라이딩 안되어있음 따로 해줘야함
		
		while(!msgQueue.isEmpty()) {
			Message msg = msgQueue.poll();
			switch(msg.command) {
			case "sendMail" :
				System.out.println(msg.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS" :
				System.out.println(msg.to + "님에게 SMS을 보냅니다");
				break;
			case "sendKatalk" :
				System.out.println(msg.to + "님에게 카카오톡을 보냅니다");
				break;
			}
		}
		
		
		
		
		
	}

}
