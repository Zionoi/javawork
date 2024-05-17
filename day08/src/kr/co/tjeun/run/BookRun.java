package kr.co.tjeun.run;
import java.util.Scanner;

import kr.co.tjeun.domain.Book;
public class BookRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*		//초기화 방법1. 기본생성자로 객체를 생성하여 getter/setter메소드로 값 초기화
				Book book = new Book();
				Book book1 = new Book("java","서민국",25000,"김앤북");
		
				book.setTitle("JAVA");
				book.setAuthor("김요한");
				book.setPrice(35000);
				book.setPublisher("kyh");
				System.out.println(book.information());
				
				//초기화 방법 2. 매개변수가 있는 생성자 이용
				
				Book book2 = new Book("springBoot","가나다",33333,"마바사");
				System.out.println(book2.information());
				// 사용자로 부터 값을 입력받아 초기화 하여 출력하기
				
				Scanner sc = new Scanner(System.in);
				System.out.print("책이름 저자 가격 출판사를 차례대로 입력하시오 (엔터로 구분) : ");
				String titleInput = sc.nextLine();
				String authorInput = sc.nextLine();
				int price = sc.nextInt(); 
				sc.nextLine();// nextLine nextLine은다음 엔터값까지 포함되므로 nextInt값이 아래문구까지 한번에 묶임 중간에 nextLine으로 구분해주면 해결
				String publisherInput = sc.nextLine();
				Book book3 = new Book(titleInput,authorInput,price,publisherInput);
				System.out.println(book3.information());
				
				
			
				Book book4 = new Book(titleInput,authorInput,price,publisherInput);
				System.out.print("책이름 저자 가격 출판사를 차례대로 입력하시오 (엔터로 구분) : ");
				book4.setTitle(sc.nextLine());
				book4.setAuthor(sc.nextLine());
				int price2 = sc.nextInt(); 
				sc.nextLine();// nextLine nextLine은다음 엔터값까지 포함되므로 nextInt값이 아래문구까지 한번에 묶임 중간에 nextLine으로 구분해주면 해결
				String publisherInput2 = sc.nextLine();
				System.out.println(book4.information());
				
			*/	
		
		// 관리 해야 되는데 일반 변수 사용
		Book book1 = null; // 객체여도 지역변수이기 때문에 null값 지정해줌
		Book book2 = null;
		Book book3 = null;
		
		
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");
			
			System.out.print("책이름 저자 가격 출판사를 차례대로 입력하시오 (엔터로 구분) : ");
			String titleInput = sc.nextLine();
			String authorInput = sc.nextLine();
			int priceInput = sc.nextInt(); 
			sc.nextLine();
			String publisherInput = sc.nextLine();
			
			if(i == 0)
				book1 = new Book(titleInput, authorInput, priceInput, publisherInput);
			else if(i == 1)
				book2 = new Book(titleInput, authorInput, priceInput, publisherInput);
			else 	
				book3 = new Book(titleInput, authorInput, priceInput, publisherInput);
			
		}
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
		
		// 도서 제목으로 검색하는 서비스
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		if(book1.getTitle().equals(search)) {
			System.out.println(book1.information());
		}
		
		if(book2.getTitle().equals(search)) {
			System.out.println(book2.information());
		}
		if(book3.getTitle().equals(search)) {
			System.out.println(book3.information());
		}
		if(!book1.getTitle().equals(search) && !book2.getTitle().equals(search) && !book3.getTitle().equals(search)) {
			System.out.println(book1.information());
		}
		
		
		//위에 방법으로 하려면 책의수가 많아질겨우 효율이 떨어진다. 이럴때 사용할수있는게
		//객체배열
		
		
	}
}