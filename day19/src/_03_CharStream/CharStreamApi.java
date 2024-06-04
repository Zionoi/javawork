package _03_CharStream;

import java.io.*;

public class CharStreamApi {
	//문자기반 스트림 : 2byte씩 전송
	/*
	xxxReader : 입력용 스트림
	xxxWriter : 출력용 스트림
	
	*/
	
	// 출력용 스트림
	void fileSave() {
		FileWriter fw = null;
		
		//파일이 있으면 연결 없으면 생성후 연결
		try {
			// 1. 생성
			fw = new FileWriter("file_char.txt");
			
			// 2.
			fw.write('김'); // 2byte라 한글도 가능
			fw.write("문자열도 가능");// 문자열도 가능. 전송될땐 한글자씩 전송
			fw.write(' '); // 띄어쓰기 할땐 이렇게
			fw.write('A');
			fw.write("\n");
			
			//캐릭터 배열도 가능
			char[] arr = {'t', 'j', 'o', 'e', 'u', 'n'}; 
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 입력용 스트림
	void fileRead() {
		FileReader fr = null;
		try {
			fr = new FileReader("file_char.txt");
			
			
			int value = 0;
			while((value=fr.read())!=-1) {
				//  캐릭터 형변환을 하면 문자로 가져올수있음. 그냥 value 출력시 아스키코드 숫자 출력됨
				System.out.print((char)value);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				3. 스트림 반납
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
}
