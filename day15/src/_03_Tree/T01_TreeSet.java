package _03_Tree;

import java.util.*;

public class T01_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);//위에 Interger로 먼저 형변환 해뒀기때문에 여기선 그냥 숫자만 입력해도 자동 형변환 된다.
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//가장 작은값
		System.out.println("가장 낮은 점수 : "+scores.first()); //78
		
		//가장 높은값
		System.out.println("가장 높은 점수 : "+scores.last());  //98
		
		//lower(int) : int보다 바로 아래 점수 . 
		System.out.println("95점 바로 아래 점수 : "+scores.lower(95));  //87
		
		//ceiling(int) : int보다 바로 위의 점수 
		System.out.println("95점 바로 위의 점수 : "+scores.higher(95)); // 98
		
		//95점이거나 없으면 바로 아래점수
		System.out.println("95점이거나 없으면 바로 아래점수 : "+scores.floor(95)); // 95
		
		//95점이거나 없으면 바로 위의점수
		System.out.println("95점이거나 없으면 바로 아래점수 : "+scores.ceiling(95)); // 95
		
		
		//TreeSet에 들어있는 객체수 size()
		
		//들어있는 객체수
		System.out.println("들어있는 객체 수 : " + scores.size());  //5
		
		System.out.println();
		while(!scores.isEmpty()) {
			scores.pollFirst(); //맨앞 객체 하나 삭제
			System.out.println("남아있는 객체 수 : " + scores.size());
		}
		
		
		
		
		
		
	}

}
