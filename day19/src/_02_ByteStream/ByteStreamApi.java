package _02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamApi {
	/*
	 xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어온다)
	 xxxIutputStream : xxx매체로 데이터를 출력하는 통로(외부매체로 데이터를 내보낸다. 쓴다)
	 
	 */
	
	// 외부매체는 파일되는것. 외부매체 파일에 출력을 한다. 데이터를 파일로 내보내기. 즉 저장
	void fileSave() {
		// FileOutputStream : 파일과 직접 연결해서 1byte단위로 출력하는 스트림
		
		
		// 순서 
		// 1. 스트림 생성(통로만들기)
		// 2. 스트림으로 데이터를 출력(메소드 활용)
		// 3. 다 사용한 후 스트림을 반납
		
		
		//1. 
		// 파일이 없으면 만들어주고 있으면 통로 연결
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("file_byte.txt");
			//2. 파일에 데이터 출력하고자 할때 write메소드 사용
			// 숫자를 출력하든 문자를 출력하든 파일에 기록되는건 문자로 기록됨(아스키코드)
				fout.write(97);// 아스키코드로 문자가 써짐 아스키코드에서 97은 a
				fout.write('b'); // 쌍따옴표"" 안됨. 1byte 만 가능 . 한글도 안됨 한글은 2byte임
			
			//배열도 가능 byte자료형 배열만 가능
			byte[] arr = {99, 65, 100};
			// 연결해서 쓰시오같은 명령하지 않으면 기본적으로 덮어쓰기됨
			fout.write(arr);
			
			//write(매개변수가 1개) : 매개변수에 있는 문자를 쓰시오
			//write(byte[], 얼만큼떨어져서(offset), 몇개(int len)
			fout.write(arr, 1, 2);
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. 다 사용한 후 스트림을 반납
		try {
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	// 외부매체로부터 파일을 읽어온다. (입력 : 파일로부터 데이터 가져오기)
	void fileRead() {
		/*		1. 스트림생성(통로만들기)
				2. 스트림으로 데이터를 입력 받아오고(메소드 활용)
				3. 다 사용후 스트림 반납 .close
		*/	
		//FileInputStream : 파일로 부터 1byte 단위로 입력 받는 스트림
		
		FileInputStream fin = null; // try안에서 생성하면 지역변수기때문에 close할때 오류. 밖에서 변수 선언 미리 null값으로 하기
		try {
			//1.
			fin = new FileInputStream("file_byte.txt"); // 빈생성자 없기때문에 비워두면 생성안됨.
		
			//2. read() 메소드 이용
			//1byte씩 아스키코드로 읽어옴(숫자)
			// 들어있는 값 만큼 출력문 넣어줘야 다 읽어옴
			/*System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());*/
			
			// 반복문을 사용하면 된다.
			/*// fin.read()는 맨끝이 되면 -1이됨 그것을 이용한 반복문
				
				// 이렇게 하면 하나씩 건너띄어서 나옴
				while(fin.read() != -1) { //여기서도 리드로 읽고
					System.out.println(fin.read()); // 여기서도 리드로읽기 때문
				}
				*/
			// 그래서 무한반복으로 돌면서 매번 조건검사를 하는게 일반적
	/*		while(true) {
				int value = fin.read();
				if(value == -1)  // .read()가 끝에 다다르면 -1이됨
					break; //  -1이 되면 반복문 종료
		System.out.println(value); // -1이 아니면 출력문 실행 // 변수에 안넣고 바로 fin.read() 넣으면 또 퐁당퐁당 출력되니 변수로 실행하기
			}*/
			
			//해결방법 2. 권장방법
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value); // 문자로 출력하고싶다면 char로 강제형변환하면 된다.
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 오류던 아니던 무조건 실행
			try {
				fin.close(); //finally 키워드로 오류가나던안나던 스트림 반납한다
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
