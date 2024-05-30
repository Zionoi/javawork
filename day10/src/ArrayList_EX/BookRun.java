package ArrayList_EX;

import java.util.*;
import java.util.Scanner;

public class BookRun {
	static BookController book1 = new BookController();  //인스턴스 변수는 객체생성해야만 생성할수 있다 객체생성 없이 사용하려면 static을 붙여 클래스 변수로 바꿔야한다
	
	public static void main(String[] args) {
		/*	LibraryController lc = new LibraryController(new Member("김요한",32,"남"));
			lc.insertBook(new Book("해리포터","조엔","맑은소리",35000));
			lc.insertBook(new Book("자바","홍길동","맑은소리"));
			lc.insertBook(new Book("수학책","김수학","수학나라"));
			lc.insertBook(new Book("음악책","김음악","음악나라"));
			lc.searchBook("해리포터");
			lc.searchBook("자바");
			System.out.println("------------");
			lc.selectALL();
			System.out.println("------------");
			System.out.println(lc.selectALL());
			System.out.println("------------");
			lc.searchBook("이클립스");
			Member m = new Member("김요한",32,"남");
			
			lc.info();
			*/
		
		
		Scanner sc = new Scanner(System.in);
		BookRun br = new BookRun();
		boolean flag = false;
		
		
		abc:while(!flag) {
		
		System.out.println("******* 메인 메뉴 *******\n1. 새 도서 추가\n2. 도서 전체 조회\n3. 도서 검색 조회\n4. 도서 삭제\n5. 도서 명 오름차순 정렬\n9. 종료\n 원하는 서비스의 번호 입력\n***********************");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch (choice) {
		case 1 : 
			insertBook();
			/*	
				System.out.print("추가할 도서의 제목입력 : ");
				String title = sc.nextLine();
				System.out.print("추가할 도서의 저자입력 : ");
				String author = sc.next();
				System.out.print("추가할 도서의 장르입력 : ");
				String category = sc.next();
				System.out.print("추가할 도서의 가격입력 : ");
				int price = sc.nextInt();
				sc.nextLine();
			
				System.out.println("추가할 도서의 정보가 맞습니까? y / n \n" );
				char c = sc.next().charAt(0);
				if(c=='y' || c == 'Y') {
					System.out.println(title+" "+author);
				book1.insertBook(new Book(title, author, category, price));
				System.out.println("책이 추가되었습니다.");
				}else {
					System.out.println("취소되었습니다.");
				}
				*/
			break;
		case 2 :
			listAll();
			
//			book1.listAll();
			
			/*if(book1.toString() == null)
				System.out.println("책이 없습니다");
			else
				System.out.println(book1.toString());*/
			break;
			
		case 3 :
			
//			searchBook();
			
			System.out.print("검색할 책의 제목을 적으시오 : ");
			String searchTitle = sc.nextLine();
			if(book1.searchBook(searchTitle)==null)
				System.out.println("검색한 책이 없습니다");
			else
				System.out.println(book1.searchBook(searchTitle));
			break;
			
		case 4 :
			deleteBook();
			
			/*
			System.out.print("삭제할 책의 제목과 저자를 적으시오(엔터로 구분) : ");
			String deleteTitle = sc.nextLine();
			String deleteAuthor = sc.nextLine();
			System.out.println(book1.deleteBook(deleteTitle, deleteAuthor));
			*/
			break;
			
		case 5 :
			ascBook();
			
			/*book1.ascBook();
			if(book1.listAll()) {
				System.out.println("정렬을 하였습니다");
			}else
				System.out.println("정렬을 실패하였습니다");
			*/
			break;
		case 9 :
			System.out.println("프로그램을 종료합니다");
			flag= true;
			break;
//			break abc;
		default:
            System.out.println("잘못된 선택입니다. 다시 시도해주세요.");	
		}
	
		
		}
	}
// 위에 케이스마다 코딩을해도되고 메인 괄호 밖에 메소드를 만들어서 호출해도 됨.	
// 아래는 교수님이 만든 코딩
	static void insertBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 새 도서 추가 ========");
		System.out.print("추가할 도서의 제목입력 : ");
		String title = sc.nextLine();
		System.out.print("추가할 도서의 저자입력 : ");
		String author = sc.nextLine();
		System.out.print("추가할 도서의 장르입력 : 1.인물 /2.자연과학 /3.교육 /4.종교 /5.기타 ");
		String category = sc.nextLine();
		System.out.print("추가할 도서의 가격입력 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		book1.insertBook(new Book(title, author, category, price)); //static이 붙은 클래스변수라 객체생성없이 사용가능
		
	}
	static void listAll() {
		System.out.println("======== 도서 목록 조회 ========");
		/*
		Array
		
		
		*/
		book1.listAll();
		
		
		
	}
	static void searchBook() {
		/*		Scanner sc = new Scanner(System.in);
				System.out.println("======== 도서 검색 ========");
				System.out.println("검색할 제목 입력 : ");
				String title = sc.nextLine();
		
			
				ArrayList<Book> searchList = book1.searchBook(title);
				if(searchList.isEmpty()) {
					System.out.println("도서가 없습니다");
				}else {
					for(Book book : searchList) {
						System.out.println(book);
					}
				}
		 */		
		

		
		
		
	}
	static void deleteBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 도서 삭제 ========");
		System.out.println("삭제할 제목 입력 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자명 입력 : ");
		String author = sc.nextLine();
		Book delBook = book1.deleteBook(title, author);
		if(delBook == null) {
			System.out.println("찾는 도서가 없어서 삭제하지 못함");
		}else {
			System.out.println(delBook.getTitle() + " 삭제 완료");
		}
		
		
	}
	static void ascBook() {
		int result = book1.ascBook();
		if(result == 1)
			System.out.println("정렬에 성공하였습니다");
		else
			System.out.println("정렬에 실패하였습니다");
				
		
	}
}
