package _06_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	/*	
	 * 현재 구동중인 서버가 있으면 클라이언트는 그서버로 요청을 보낼 수 있음 => 응답결과가 돌아옴
		- 요청과 응답에 의해서 프로그램이 돌아감("통신"한다라고 표현)
		- 웹에서는 통신방식 : http 프로토콜 통신.(https : 보안이 추가된것)
		
	
	* 자바만을 가지고 서버와 클라이언트간에 간단한 통신하기	
	  이때 데이터를 입출력하고자 한다면 서버와 클라이언트간에 스트림(연결통로)이 필요
	
	
	* 소켓 : 프로세스간의 통신을 담당. 스트림을 연결하기위한 문. 소켓 port 번호 필요
	
	* 소켓 프로그래밍(tcp, udp)
		-TCP : 데이터를 정확하고 안정적으로 전달 가능(신뢰성). 느림 (이메일, http)
		-UDP : 신뢰성이 없느 데이터 전달. 그대신 빠름 (실시간 동영상 서비스, 토렌트)
	*/

	/*
		* TCP(Transmission Control Protocol)
		 - 서버, 클라이언트 1:1 소켓 통신
		 - 데이터를 교환하기 전에 서버, 클라이언트가 연결되어 있어야됨.
		 
		* Socket
		 - Input/OutputStream을 가지고 소켓통신을 함
	
		* ServerSocket
		 - 포트와 연결(Bind)되어 외부의 연결요청을 기다리다 연결요청이 들어오면 수락해줄 용도
		 수락 => 통신할 수 있는 socket 생성 
	
	
	*/
	
	
	
	
	
	public static void main(String[] args) {
		//TCP 하는법
		// 1) 포트번호 지정
		int port = 9001;
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;	//입력용 스트림 (보조스트림)
		PrintWriter pw = null; 		//출력용 스트림 (보조스트림) 
		
		ServerSocket server = null;
		
		
		try {
			// 2) ServerSocket 객체 생성시 포트 결합(Bind) // 연결요청이 오면 그걸 받아줄 역할
			server = new ServerSocket(port);
		
			//3) client의 요청이 올때까지 대기 상태
			System.out.println("클라이언트의 요청을 기다리고 있음... 로딩중...");
		
			
			//4) 연결 요청이 들어오면 수락 후 해당 클라이언트와 통신할 수 있는 서버측 소켓 객체 생성
			Socket socket = server.accept(); // 수락시 accept(); 메소드 사용 
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청 함");
		
			/*	
			// 5) 클라이언트와 입출력할 기반스트림 생성 (바이트 스트림밖에 안됨)(통로스트림 생성)
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
				
			// 6) 성능향상을 위해 보조스트림 사용 ( 5)만 사용해도 상관은 없음)
			br = new BufferedReader(new InputStreamReader(is)); // 버퍼드리더니까 리더기반스트림is 넣어줌
			*/
					// 버퍼드리더를 사용하기위해 1byte인 socket.getInputStream()을 같은 2byte인 InputStreamReader 로 바꾼후 버퍼드리더에 넣어 객체생성함.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 위에처럼 변수에 안넣고 바로 객체생성할수도있음
			pw = new PrintWriter(socket.getOutputStream());		// PrintWriter는 위에 리더처럼 같은 리더 사용 안해도됨. 편함
			// 데이터 출력시 print(), println() 메소드를 가지고 있는 보조스트림 //편하게 출력가능
			
			pw.println("환영합니다 😊😊😊😊😊😊🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔"); //printWriter를 사용했기때문에 println사용가능 이모지 쓸수있음
			
			// 쌓이기 전에 비워줌
			pw.flush(); // 버퍼에 쌓아두지않고 바로 보냄
			
			while(true) {
				// 7)스트림을 통해 읽고 쓰기
				// 클라이언트측 메시지 읽기
				System.out.println("클라이언트 : " + br.readLine()); // 버퍼드리더에서 한줄씩 읽어옴
				
				// 클라이언트에게 메시지 보내기
				System.out.print("서버 : "  );
				pw.println(sc.nextLine()); // 키보드로 적은 내용을 출력 할수 있게 해줌
				pw.flush(); // 그걸 곧바로 보냄
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 열어놨던 스트림 모두 닫아줌
				pw.close();
				br.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

}
