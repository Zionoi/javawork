package _05_ObjectStream;

import java.io.*;

public class ObjectStreamApi {
	// ObjectOutputStream 또는 input 보조스트림 사용
	// 출력 메소드 : writeObject(객체);
	// 입력 메소드 : readObject(객체);
	
	
	
	
	//객체를 파일로 출력
	void fileSave() {
		Phone p1 = new Phone("갤럭시", 2000000);
		Phone p2 = new Phone("아이픈", 1800000);
		Phone p3 = new Phone("샤오미", 900000);
		// 보조스트림은 반드시 기반스트림위해서 동작함
		
		//기반스트림 : FileOutputStream 을 사용 (1byte단위로 출력할 수 있는 스트림)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file_object.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
						
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
		
	void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file_object.txt"))) {
/*			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());  // 맨끝을 만나면 EOF익셉션 만남
*/
			while(true) {
				System.out.println(ois.readObject());
				
			}
			
		}catch(EOFException e) {
			System.out.println("파일을 모두 읽었습니다");
		}catch(Exception e) {
			e.printStackTrace();
		
	
		
		
	}
	
	
	
}
}