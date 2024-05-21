package ArrayList_EX;

public class Book {
	String title;
	String author;
	String publisher;

	
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
	void setTitle() {
		this.title = title;
	}
	void setAuthor() {
		this.author = author;
	}
	void setPublisher() {
		this.publisher = publisher;
	}
	
	public String toString() {
		return " 제목 : "+ title + " 저자 : " + author + " 출판사 : " + publisher+"\n";
	}



}
