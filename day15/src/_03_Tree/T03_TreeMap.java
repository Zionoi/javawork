package _03_Tree;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;



public class T03_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		
		//저장시 엔트리구조로 저장되는데 키를 기준으로 저장됨. 사전 알파벳순 기준
		treeMap.put("apple", 1000);
		treeMap.put("banana", 3000);
		treeMap.put("cherry", 2000);
		treeMap.put("grape", 5000);
		treeMap.put("mango", 1000);
		treeMap.put("orange", 500);
		treeMap.put("peach", 1000);
		treeMap.put("watermelon", 10000);
		
		System.out.println("[d~n 사이의 단어 검색]");
		// 범위검색시 TreeMap에선 subMap을 사용한다. Set에선 subSet ("시작문자", 시작문자 포함할건지(true,false),끝 문자, 끝문자 포함여부(true,false))
		NavigableMap<String, Integer> raviMap = treeMap.subMap("c", true,"n",false);
		System.out.println(raviMap); //이렇게해도 가능
		
		for(Entry<String, Integer> entry : raviMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		
		
		
		
		
	}

}
