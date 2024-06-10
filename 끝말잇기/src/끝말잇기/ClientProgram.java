package 끝말잇기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		// 서버의 도메인이름
		// 내 pc에서 서버도 돌리고, 클라이언트도 돌리고, 도메인 없음
		// 내가 내꺼에서 돌릴땐 포트번호가 다르면 안됨.
		Scanner sc = new Scanner(System.in);
		int port = 9999; // ServerProgram에서 지정한 포트번호 그대로 가져온다
		
		
//		Socket socket = null;
		
		try {String serverIp =InetAddress.getLocalHost().getHostAddress(); 
			//try() 하나에 다 넣어도 됨.
			try( Socket socket = new Socket(serverIp, port);
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());){
				
				System.out.println(br.readLine());
				while(true) {

					System.out.print("클라이언트 : ");
					String sendMsg = sc.nextLine();
					
					pw.println(sendMsg); 
					pw.flush(); 
					System.out.println("서버 : " + br.readLine());
					if(sendMsg.equals("exit")){
						break;
					}
				}
				System.out.println("서버와 연결 해제함");
			}		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
