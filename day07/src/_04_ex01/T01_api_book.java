package _04_ex01;

public class T01_api_book {
	
	 String bookName;
	 int ISBN;
	 int price;
	 int count = 0;
	 int i,j,k,L,m,n,o,p = 0;
	 
	 
	 //생성자 : 매개변수가 없는것, 1개, 2개,3개인것까지 총 4개 만들기
	 T01_api_book(){
		 this("자바의 정석",1231212345,25000);
//		 bookName = "자바의 정석";
//		 ISBN = 1231212345;
//		 price = 25000;
		
	 }
	 
	 T01_api_book(String bookName){
		 this(bookName,1231212345,25000 );
			/* this.bookName = bookName;
			 ISBN = 1231212345;
			 price = 25000;*/
	 }
	 
	 T01_api_book(String bookName, int ISBN){
		 this(bookName,ISBN,25000 );
			/* this.bookName = bookName;
			 this.ISBN = ISBN;
			 price = 25000;*/
	 }
	 
	 T01_api_book(String bookName, int ISBN,int price){
		 this.bookName = bookName;
		 this.ISBN = ISBN;
		 this.price = price;
 		 System.out.println("책이름 : "+bookName+"\nISBN : "+ISBN+"\n가격 : "+price+"\n");
	 }
	 
	 
	 void sellcount() {
		 if(bookName.equals("자바의 정석")) {
		 i++;
		 System.out.println(bookName+" 팔린 횟수 : "+ i);
		 
		 }
		 if(bookName.equals("수학의 정석")) {
			 j++;
			 System.out.println(bookName+" 팔린 횟수 : "+ j);
			 
		 }
		 if(bookName.equals("화성학")) {
			 k++;
			 System.out.println(bookName+" 팔린 횟수 : "+ k);
			 
		 }
		 if(bookName.equals("해리포터")) {
			 L++;
			 System.out.println(bookName+" 팔린 횟수 : "+L );
			 
		 }
	 }
	 
	 
	 
	 
	
}
