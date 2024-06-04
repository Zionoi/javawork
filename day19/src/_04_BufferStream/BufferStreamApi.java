package _04_BufferStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamApi {
	// 버퍼스트림 : 보조스트림(기반스트림과 함께 동작, 기반스트림없이 단독으로 사용 불가능)
	/*				=> 외부매체와 직접 연결하지않음
	
	*/

	/*
	void fileSave() {
		// 기반스트림은 fileWriter를 사용할 예정
		// 그 위에 보조 스트림 : BufferWriter로 출력속도 향상
		
		
		// 순서
		// 1. 기반스트림 먼저 생성
		// 2. 보조스트림 생성(기반스트림 객체를 전달하면서 생성)
		// 3. 파일 쓰고
		// 4. 파일 닫고 (보조스트림과 기반스트림 둘다 닫아야함) 
		
		
		
		
		//1.
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//1. 기반스트림 생성
			fw = new FileWriter("file_buffer.txt");
				
			//2. 보조스트림 생성
			BufferedWriter bw = new BufferedWriter(fw); // 어떤 기반스트림사용할건지 ()소괄호 안에 넣기
			
			
			// 한줄로 
			bw = new BufferedWriter(new FileWriter("file_buffer.txt"));
			bw.write("안녕하세요? \n");
			bw.write("식사는 잘하셨나요? \n");
			
			// \n 말고 줄바꿈 메소드가 있다
			bw.newLine(); // 줄바꿈 메소드
			bw.write("나는 자바가 좋아요");
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
	//				fw.close(); // 위에 보조스트림생성을 기반스트림과 같이 한줄로했을경우 fw는 null이 그대로 있기때문에 같이 닫을 필요가 없다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}*/
	
	// 자바 jdk7버전부터 close로 반납하지 않아도됨
	// try-catch-resoutce 구문으로 자원반납을 하지 않는다
	/*
	try(try블럭내에서 사용할 스트림 객체 생성 구문) { // 원래 try에는 ()소괄호가 없음 여기다 스트림객체를 넣으면 try구문이 끝날때 해당 스트림 반납까지 해줌
	
	} catch(예외클래스 e){
	
	}
	
	
	*/
	
	
	
	//close없는 버전 ex
	
	void fileSave() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("file_Buffer.txt"))) { // 변수에 넣어서 소괄호에 넣어야 이후에 변수명 호출로 기능 사용할수있음
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.newLine();
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			bw.write("안녕하세요?\n");
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//입력 버퍼
	void fileRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("file_Buffer.txt"))) {
			/*
			System.out.println((char)br.read());
			// 한줄 단위로 읽어오는 메소드
			System.out.println(br.readLine()); //버퍼에 담겨있는것중에서 한줄단위로 가져오시오
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			
			String value = null;
			// readLine으로 했을땐 -1이 아니라 null값으로 비교해야한다.
			while((value = br.readLine()) != null) { 
				System.out.print(value);
			}
			
			int value2 = 0;
			while((value2 = br.read()) !=-1)
				System.out.println((char)value2);
			
			
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
