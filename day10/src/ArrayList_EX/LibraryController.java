package ArrayList_EX;

import java.util.ArrayList;

public class LibraryController {
	Member member; 	//Member라는 자료형인 인스턴스 변수						//멤버를 객체생성하여 필드에 저장
	ArrayList<Book> aList = new ArrayList<Book>(); //어레이리스트로 객체 생성
	
	LibraryController(Member m) { 				//멤버객체를 매개변수로 받는 생성자
		member = m;  							//인스턴스 변수 member에 넣기
	}
	
	void info() {								// member를 toString 출력
		System.out.println(member);				
	}
	
	void insertBook() {
		aList.add(new Book("파이썬","아무개","김앤북"));
		aList.add(new Book("mysql","가나다","북북"));
		aList.add(new Book("체육","라마바","길벗"));
	}
	
	void insertBook(Book b) {
		aList.add(b);
	}
	ArrayList<Book> selectALL(){//입력되어있는 책들 정보 전부 호출
		/*		for(Book book : aList) {
					System.out.println(book);
				}*/
		return aList;
	}

	/*	
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
		
	*/
	
	Book searchBook(String bookTitle) {
		Book book = null;
		for(int i=0; i<aList.size(); i++) {
			if(aList.isEmpty()) {
				System.out.println("책이 없습니다");
				break; //for문 종료
			//	return book; // 메소드 종료
			}
			if(bookTitle.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
				System.out.println("검색한 책의 정보 : "+book);
				break;
			}
		}
		if(book==null)
			System.out.println("검색한 책을 찾을 수 없습니다");
		return book;
	}	
	
	
	
	
	
	
}
