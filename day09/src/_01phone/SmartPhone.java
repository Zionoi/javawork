package _01phone;
//클래스 만들때 superclass란에 상속받을 부모클래스명을 입력하면 
//extends수기입력하지않아도 상속클래스를 만들수 있다	
public class SmartPhone extends Phone{//Phone을 상속받음
/*
	상속받은 부모클래스에 생성자가 인자값을 넣어줘야하는 생성자만 있다면 메인 클래스에서
	객체 생성할때 인자값을 같이 넣어줘야함. ex)	 new Phone("note1","white")
*/	
/*	
부모의 생성자에 매개변수가 있으면 자식도 반드시 생성자가 있어야 됨
부모 생성자의 인자값을 넘겨줘야 됨
이유 : 자식의 객체를 생성하면 부모의 객체도 생성됨.
*/	
	SmartPhone(String model, String color) { //사용자로부터 매개변수를 입력받거나
			super(model, color);
			// super는 부모클래스를 뜻함. 부모의 생성자 호출
		}
	


	SmartPhone() {//객체생성할때 인자값을 넣어줄수 있음
			super("note", "white");
		
	}

String search;
	
	String search(String search) {
		this.search = search;
		return this.search + "를 검색합니다";
 }




}
