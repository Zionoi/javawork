package ArrayList_EX;

public class BookRun {

	
	public static void main(String[] args) {
		LibraryController lc = new LibraryController(new Member("김요한",32,"남"));
		lc.insertBook(new Book("해리포터","조엔","맑은소리"));
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
		
		
	
		
		
	}

}
