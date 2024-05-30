package ArrayList_EX;

import java.util.Objects;



public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;

	
	Book(){	}
	Book(String title, String author, String category, int price){
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	String getTitle() {
		return this.title;
	}
	String getAuthor() {
		return this.author;
	}
	String category() {
		return this.category;
	}
	int getPublisher() {
		return this.price;
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void category(String category) {
		this.category = category;
	}
	void setPublisher(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "제목 : "+ title + " 저자 : " + author + " 장르 : "+ category + " 금액 : "  + price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}

	/*	@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(price, other.price);
		}*/
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;
			return price == book.price;
		}
		return false;
	
	
		

	}
	@Override
	public int compareTo(Book o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	
	
	
}
