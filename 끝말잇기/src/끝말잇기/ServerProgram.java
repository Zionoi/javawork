package 끝말잇기;

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
	                while ((msg = br.readLine()) != null) {
	                    if (msg.equals("exit")) {
	                        System.out.println("채팅을 종료합니다");
	                        break;
	                    }

	                    System.out.println("클라이언트 : " + msg); // 클라이언트로부터 받은 메시지 출력
	                    char lastChar = msg.charAt(msg.length() - 1); // 마지막 문자 추출
	                    System.out.println(lastChar + " 으로 시작하는 단어는?");
	                    System.out.print("서버 : ");

	                    String sendMsg = sc.nextLine();
	                    if (sendMsg.charAt(0) == lastChar) {
	                        pw.println(sendMsg); // 올바른 단어를 전송
	                        pw.flush(); // 그걸 곧바로 보냄
	                    } else {
	                        System.out.println("잘못 입력하셨습니다 다시 입력하십시오");
	                        pw.println("잘못 입력하셨습니다. 다시 입력하십시오."); // 클라이언트에게 잘못된 입력 알림
	                        pw.flush();
						}
						
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 		
		
		

	}

}
