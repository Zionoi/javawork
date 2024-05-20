package kr.co.tjeun.run;
import java.util.Scanner;

import kr.co.tjeun.domain.Book;
public class BookArrayrun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[3];
	
	for(int i=0 ; i<books.length;i++)	{
		System.out.print(i+1+"번째 책이름 저자 가격 출판사를 차례대로 입력하시오 (엔터로 구분) : ");
		String titleInput = sc.nextLine();
		String authorInput = sc.nextLine();
		int priceInput = sc.nextInt(); 
		sc.nextLine();
		String publisherInput = sc.nextLine();
		books[i] = new Book(titleInput,authorInput,priceInput,publisherInput);
	}	
		
		
		
		//도서목록 조회
		System.out.println("검색할 책 이름 입력 : ");
		String search = sc.nextLine();
		
		
		
		for(Book searchBook : books) { // 향상된 for문 배열의 안의 값을 자동으로 순회
			System.out.println(searchBook.information());
		}
		// 도서 제목으로 검색하는 서비스	
		for(int i=0; i<books.length; i++) {
			if(search.equals(books[i].getTitle())) {
			 System.out.println(search+"의 정보 "+books[i].information());
		
			 break;}
			else {
				System.out.println("검색한 책이 없습니다");
		}
		
		}
		
	}

}
