package _02_ArrayList;

import java.util.*;

public class T04_BoardArrayList {
	public static void main(String[] args) {
	
	List<Board> list = new ArrayList<Board>();
	
	Board b1 = new Board("제목1", "내용1", "글쓴이1");
	list.add(b1);
	list.add(new Board("제목2", "내용2", "글쓴이2"));
	list.add(new Board("제목3", "내용3", "글쓴이3"));
	list.add(new Board("제목4", "내용4", "글쓴이4"));
	list.add(new Board("제목5", "내용5", "글쓴이5"));
	
	Board b2 = list.get(1);
	System.out.println(b2); //toString 사용해서 클래스생성하면 정보를 string으로 바로 출력가능
	System.out.println(b2.getTitle() + ", "+ b2.getContent() + ", " +b2.getWriter()); //toString 안하면 일일히 이렇게 get메소드를 가져와 써야한다
	
	Board b3 = new Board(); //set도 가능
	b3.setTitle("title1");
	b3.setContent("게시판 내용");
	b3.setWriter("아무개");
	
	list.add(b3);// 리스트 추가
	System.out.println("-----------------------");
	
	//리스트 목록 출력할때 
	//일반 for문
	for(int i=0; i<list.size();i++) { 
		System.out.println(list.get(i).getTitle()+ ", "+list.get(i).getContent()+ ", "+list.get(i).getWriter());
	}
	
	//향상된 for문
	for(Board b : list) {
		System.out.println(b.getTitle()+ ", "+b.getContent()+ ", "+b.getWriter());
	}
	
	
	
	//삭제
	list.remove(2);
	for(Board b : list) {
		System.out.println(b.getTitle()+ ", "+b.getContent()+ ", "+b.getWriter());
	}
	
	
	
	
	
	
	}
}
