package _02_HashMap;

import java.util.*;

public class T02_HashMapEX {

	public static void main(String[] args) {
		// 사용자의 id(키)d와 pw(값)을 hashMap에 저장 (데이터 3개)
		
		// 사요앚로부터 id와 pw받ㅇ사ㅓ
		
		//1. id가 없으면 : 입력한 id는 없습니다
		//2. pw가 맞지않으면 : pw가 맞지 않습니다
		//3. id와 pw가 맞으면 종료
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myid", "1234");
//		map.put("myid2", 003456); // 숫자라고 int로 하면 00은 빠지고 3456만 들어가서 원하는대로 입력이 안됨. String으로 바꿔주기
		map.put("kyh00827", "d1234");
		map.put("rladygks2848", "1q2w3e");
		
		//값이 존재하는지 확인하려면
		map.containsKey("kyh00827");
		System.out.println(map.containsKey("kyh00827"));
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ID : ");
			String inputId = sc.next();
			System.out.println("PW : ");
			String inputPw = sc.next();
			
			if(map.containsKey(inputId)) {
				if(map.get(inputId).equals(inputPw)) {
					System.out.println("로그인 성공.");
				break;
				}else
					if(map.containsKey(inputId))
						System.out.println("PW를 잘못 입력하셨습니다");
			}
			else
				System.out.println("없는 ID 입니다");
		}
		
		

	}

}
