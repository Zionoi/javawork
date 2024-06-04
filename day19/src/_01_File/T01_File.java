package _01_File;

import java.io.File;
import java.io.IOException;

public class T01_File {

	public static void main(String[] args) {
		// 자바 자체적으로 파일 인터페이스가 있음 그냥 사용하면됨.
		// 임폴트후 ()안에 파일 이름을 스트링이나 url, 또는 매개변수두개를 꼭 설정해줘야함
		try {
			//1. 경로를 지정하지 않으면 프로젝트폴더 안에 파일이 생성됨
			File f1 = new File("test.txt"); 
			f1.createNewFile(); 
			
			//2. 경로를 지정하여 파일 만들기
								// \: 역슬래시 이후엔 특별한 무언가가 들어온다고 인식함 그래서 \\ 이렇게 두개를 넣어주거나. 그냥 슬래시/ 하나로 대체할 수 있다
			File f2 = new File("C:\\kyh\\javawork\\day19\\tmp\\test2.txt"); //경로뒤에 파일이름 설정
			f2.createNewFile(); //파일 생성까지 꼭 해줘야함 
//			File f2 = new File("C:/kyh/javawork/day19/tmp");
			
			
			//3. 폴더 만들기
			File tempFolder = new File("C:\\kyh\\javawork\\day19\\temp");
			tempFolder.mkdir();  // 리눅스에서 쓰는 명령어 폴더 생성 메소드 Make Directory 라는 뜻
			
			File f3 = new File("C:/kyh/javawork/day19/temp/java.txt");
			f3.createNewFile();
			
			//파일이 존재하는지 확인하는법
			System.out.println("f1이 존재하는가 ? "+f1.exists()); // boolean 으로 반환
			System.out.println("f3이 존재하는가 ? "+f3.exists()); 
			System.out.println("aaa.txt가 존재하는가 ? "+new File("aaa.txt").exists()); //폴더 객체생성만하고 파일 생성은 하지 않은상태. 그러면 false값 반환
			
			// 파일인지 아닌지
			System.out.println("f1은 파일인가 ? "+f1.isFile()); //true
			System.out.println("temp 폴더는 파일인가 ?"+ tempFolder.isFile()); //false
			
			//폴더인지 아닌지
			System.out.println("f1은 파일인가 ? "+f1.isDirectory()); //false
			System.out.println("temp 폴더는 파일인가 ?"+ tempFolder.isDirectory()); //true
			
			
			//만약 폴더를생성하는데 경로없이 이름만 적어준다면 프로젝트에 생성된다.
			File folder = new File("folder");
			folder.mkdir();
			
			//기존에 있는 폴더나 파일을 생성하면 중복생성되지 않는다.
			File f4 = new File("folder/person.txt"); //folder는 위에 만들어놔서 파일만 생성됨.
			f4.createNewFile();
			
			//파일 이름 가져오는법
			System.out.println("f4의 파일명 "+ f4.getName());
			
			//파일의 절대경로를 가져오는법
			System.out.println("f4의 절대경로 " + f4.getAbsolutePath());
			
			//파일의 용량 구하는법
			System.out.println("f4의 파일용량 : " + f4.length());
			
			//f4의 상위폴더 구하는법
			System.out.println("f4의 상위 폴더 : " + f4.getParent());
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} //메소드를 이용해 파일을 만들수 있다.
	}

}
