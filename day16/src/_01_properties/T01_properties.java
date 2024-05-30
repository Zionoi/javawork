package _01_properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class T01_properties {

	public static void main(String[] args) {
		// properties : Map계열 => key,value 세트로 저장된다는 뜻
		// HashMap과의 차이 : Properties에는 키 = String, 값 = String으로 담는다. HashMap은 키값 자료형 자유롭게 가능
		
		Properties prop = new Properties();
		//Map계열이니 put을 이용해 담을 수 있으나 Properties 한정 setProperties를 이용해 담을수도 있음
		
		// 값을 추가할 때
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties"); // 키값이 같은게 들어오면 value에 덮어쓰기가 된다. 중복저장 x. 저장되는 순서도 없음.
		
		System.out.println(prop); // 출력 {Set=HashSet, List=ArrayList, Map=Properties}
		
		
		// key를 얻어올 때
		// 2. getProperty(String key) 
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("AAA")); //키가 존재하지 않으면 null 반환
		
		// 파일의 형태로 가져오거나 내보낼때 properties를 많이 사용한다
		
		//파일로 내보내기 .store(newFileOutputStream(파일이름.확장자));
		/*		try {   			//를 이용해 이동경로 설정한 후 아래와같이 작성		
					prop.store(new FileOutputStream("test.properties"), "propertiesTest");
					prop.storeToXML(new FileOutputStream("test.properties"), "propertiesTest");
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				*/
		
		/* Comparable 과 Comparator
		
		TreeSet과 TreeMap의 자동정렬
			-TreeSet의 객체와 TreeMap의 키는 저장과 동시에 자동 오름차순 정렬
			-TreeSet과 TreeMap은 정렬을 위해 java.lang.Comparable을 구현한 객체를 요구
				* Integer, Double, String은 모두 Comparable 인터페이스를 구현한 
		
		
		
		
		*/
	}

}
