package _07_Socket;

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
	
	public static void main(String[] args) {
		int port = 9999;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			try(ServerSocket server = new ServerSocket(port)) {
				System.out.println("클라이언트의 요청을 기다리고 있음... 로딩중...");
		
				Socket socket = server.accept(); // 수락시 accept(); 메소드 사용 
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청 함");
		
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
						PrintWriter pw = new PrintWriter(socket.getOutputStream())){		
					pw.println("환영합니다 😊😊😊😊😊😊🤔🤔🤔🤔🤔🤔🤔🤔🤔🤔"); 
			
					pw.flush(); // 버퍼에 쌓아두지않고 바로 보냄
				    String msg = null;
					while((msg = br.readLine()) != null) {
						if(msg.equals("exit")) {
							System.out.println("채팅을 종료합니다");
							break;
						}
						System.out.println("클라이언트 : " + msg); // while 조건문에서 리드라인 이미 읽어옴
					
						System.out.print("서버 : "  );
						pw.println(sc.nextLine()); // 키보드로 적은 내용을 출력 할수 있게 해줌
						pw.flush(); // 그걸 곧바로 보냄
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 		
		
		

	}

}
