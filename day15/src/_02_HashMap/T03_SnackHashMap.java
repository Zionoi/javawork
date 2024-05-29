package _02_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class T03_SnackHashMap {

	public static void main(String[] args) {
		Map<String, Snack_api> map = new HashMap<String, Snack_api>(); //api Snack을 넣을거니까 <제네릭>자료형에 Snack을 넣어준다
		
		
		
		map.put("스윙칩", new Snack_api("칠리맛", 430));
		map.put("홈런볼", new Snack_api("초코", 580));
		map.put("사또밥", new Snack_api("단맛", 530));
		map.put("썬칩", new Snack_api("매운맛", 480));
		
		System.out.println(map); // 오버라이딩 해놔서 설정해놓은 문구 출력됨. 오버라이딩 안하면 주소 출력
		
		//put : 키값이 있으면 값을 덮어쓰기ㅡ, 키값이 없으면 넣기
		map.put("홈런볼", new Snack_api("순한새우맛", 300));
		System.out.println(map);
		
		
		//replace : 키에 해당하는 값 변경(키가 없으면 실행 안함)
		map.replace("칸초", new Snack_api("양념치킨맛", 700));
		System.out.println(map);
		
		// map은 곧바로 Iterator에 넣을 수 없다
//		1) Iterator mapKey = map.iterator();//map은 엔트리(키,값)으로 저장되어있기때문에 map-> set 으로 바꾼후 Iterator를 사용할수있다
//			1.1 Mapt => Set으로 변경
		Set<String> keySet = map.keySet();// .keySet : map에 들어있는 키를 모두 가져오시오라는 메소드
		
//			1.2 Set => Iterator에 담기
		Iterator<String> itKey = keySet.iterator();// itKey엔 키만 들어있다
		
//			1.3 Iterator를 돌면서 출력
							//안에 값이 있는지(null)인지 아닌지
				while(itKey.hasNext()) {
								//위에서 먼저<String>으로 형변환 해뒀었기때문에 여기엔 그냥 객체이름만 적어도 된다. 위에서 형변환 안했다면 여기서 (String)itKey로 강제형변환 해야한다
					String key = itKey.next(); 
					Snack_api value = map.get(key); // key에 해당하는 벨륙값을 리턴
					System.out.println(key + " : " + value);
					
				}
		
		
//		2) EntrySet() 이용하는 방법
		Set entrySet = map.entrySet(); //.entrySet(); : map안에 들어있는것을 엔트리형태(키, 값)로 가져오는것
		//제네릭을 넣으려면 매개변수는 1개만 넣어야 됨
//		Set<String, Snack_api> e = map.entrySet(); //이렇게 자료형을 두개 담을 수 없다
//		Set<Entry<String, Snack_api>> entrySet = map.entrySet(); // 이런식으로 <Entry<String, Snack>>으로 담아서 넣어야한다
			
		Iterator itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
//			itEntry.next(); // itEntry는 키, 값 다있기때문에 Entry에 저장해야함
			
			Entry entry = (Entry)itEntry.next();
			
			String key = (String)entry.getKey(); // Entry 중에서 key만 얻어옴. key는 String타입
			
			Snack_api value = (Snack_api)entry.getValue(); 
			
			System.out.println(key + " / " + value);
		}
			
			Set<Entry<String, Snack_api>> entrySet2 = map.entrySet();
			Iterator<Entry<String, Snack_api>> itEntry2 = entrySet2.iterator();
			while(itEntry2.hasNext()) {
				Entry<String, Snack_api> entry = itEntry2.next();
				
				String key = entry.getKey();
				Snack_api value = entry.getValue();
				
				System.out.println(key + " - " + value);
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}
