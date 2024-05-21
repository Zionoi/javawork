package ArrayList_EX;

import java.util.ArrayList;

public class LibraryController {
	Member member; 							//멤버를 객체생성하여 필드에 저장
	ArrayList<Book> aList = new ArrayList<Book>(); //어레이리스트로 객체 생성
	
	LibraryController(Member m) { 				//멤버객체를 매개변수로 받는 생성자
		member = m;  							//인스턴스 변수 member에 넣기
	}
	
	void info() {
		System.out.println(member);
	}
	
	void insertBook(Book b) {
		aList.add(b);
		
	}
	ArrayList<Book> selectALL(){
		/*		for(Book book : aList) {
					System.out.println(book);
				}*/
		return aList;
	}
	Book searchBook(String BookTitle) {
		
		Book book = null; //초기화겸 체커로 사용하기위해 초기값 null지정 
		for(Book book1 : aList) {
			if(book1.getTitle().equals(BookTitle)) {
				System.out.println("검색한 책의 정보 : "+book1);
				book = book1;
			}
		}
		if(book==null)
			System.out.println("검색한 책을 찾을 수 없습니다");
		return book;
		
	}
	
	
}
