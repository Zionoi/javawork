package ArrayList_EX;

public class Book {
	private String title;
	private String author;
	private String publisher;

	
	Book(){}
	Book(String title, String author, String publisher){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	String getTitle() {
		return this.title;
	}
	String getAuthor() {
		return this.author;
	}
	String getPublisher() {
		return this.publisher;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "제목 : "+ title + " 저자 : " + author + " 출판사 : " + publisher;
	}



}
