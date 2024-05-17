package kr.co.tjeun.domain;


//자바빈 파일
//속성, 생성자, getter/setter 로 이루어져있음
//속성에 데이터를 담거나 보내주는 역할을 담당
//자체로는 기능하지 않음

public class Book {
	// 도서명, 저자명, 가격, 출판사
	
    private String title;
    private String author;
    private int price;
    private String publisher;
    
    //public을 안붙히면 다른패키지에서 사용을 못함
    public Book() {} // 기본생성자 안만들어두면 밑에 매개변수를 계속 입력해야하므로 기본생성자 따로 만들어두기
    
	
    public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	

	
	
	// 모든 필드의 값을 하나의 문자열로 반환해주는 메소드
	public String information() {
		return title + "/" + author + "/"+ price + "/" + publisher;
	}
	
	
	
}
