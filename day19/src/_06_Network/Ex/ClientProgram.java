package _06_Network.Ex;

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
		
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		
		try {
//			로컬로 할거니 내 pc ip 얻어오기()
			String serverIp ="192.168.50.50"; 
			int port = 9004; // ServerProgram에서 지정한 포트번호 그대로 가져온다
			
//			1) 서버에 연결 요청 보내는 구문 (요청하고자 하는 서버의 ip주소와 포트번호를 제시
			socket = new Socket(serverIp, port);
			
//			2) 서버와 입출력 기반스트림 생성
//			3) 보조스트림 통해서 성능개선
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			pw = new PrintWriter(socket.getOutputStream());	
			
			
//			서버의 환영메시지 출력
			System.out.println(br.readLine());
			
			while(true) {
				System.out.print("김요한 : ");
				pw.println(sc.nextLine()); // 변수에 담아서 보내도 됨
				pw.flush(); // 쌓아두지않고 바로 보냄
				
				System.out.println("강민석 : " + br.readLine());
				
			}
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
