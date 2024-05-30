package ArrayList_EX;

import java.util.*;

public class BookController {
	ArrayList<Book> arrBook = new ArrayList<Book>();
	BookController() {
		arrBook.add(new Book("해리포터", "조앤","판타지",35000));
		arrBook.add(new Book("수학책", "김수학","교육",28000));
		arrBook.add(new Book("이순신", "김학동","위인전",23000));
		arrBook.add(new Book("성경책", "지져스","종교",33000));
	}
	
	
	//list맨 뒤에 넣기
	public void insertBook (Book o) {
		arrBook.add(o);
		System.out.println(o.getTitle()+" 추가 완료");
	}

	//리스트 목록 모두 보여주기
	/*	ArrayList<Book> listAll() {
			return arrBook;
		}*/
	
	public boolean listAll() {
		
		if(arrBook.size()==0) {
			System.out.println("보유하고 있는 도서가 없습니다");
			return false;
		}else {
			System.out.println("보유중인 도서 목록");
			for(int i=0; i<arrBook.size();i++)
			System.out.println(i+1+"."+arrBook.get(i));
			return true;
		}
	}
	
//	searchBook : 책 검색하여 객체 리턴
//		교수님 버전
/*	  	ArrayList<Book> searchBook(String title){ //여러권 반환시킬땐 ArrayList<Book>을 사용한다 //글자가 포함되어있으면 다 검색해줌
			ArrayList<Book> searchList = new ArrayList<>();
			for(Book book : arrBook) {
				if(book.getTitle().contains(title))
					searchList.add(book);
			}
			return searchList;
			
			
		}
		
*/

	public Book searchBook (String title) { // 책한권반환할땐 그냥 Book //타이틀이 정확히 일치하는것만
		for(Book book : arrBook) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}return null;
	}
	

//	deleteBook(title, author) : 책 제목과 저자가 맞으면 list에서 삭제. 삭제한 객체 리턴

	Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i=0;i<arrBook.size();i++) {
			if(arrBook.get(i).getTitle().equals(title) && arrBook.get(i).getAuthor().equals(author)) {
				removeBook = arrBook.remove(i);
				break;
			}
		}
		return removeBook;
		
	}
	
	
	/*	
		public String deleteBook (String title, String author) {
			
			for(int i=0;i<arrBook.size();i++)
			if(arrBook.get(i).getTitle().equals(title) && arrBook.get(i).getAuthor().equals(author)) {
			arrBook.remove(title);
	//		arrBook.remove(author);
			return "제목 : " + title + ", 저자 : : "+author+" 삭제 완료";
			}
			return "삭제할 도서가 없습니다.";
		}
		*/

	//	ascBook() : 오름차순 정렬
	public int ascBook() {
		arrBook.sort(null); // String클래스 sotr()메소드는 compareTo()가 호출됨. 
		
		return 1;
	}
	
	
	
	@Override
	public String toString() {
		return "BookController [arrBook=" + arrBook + "]";
	}


	
	
	
}
