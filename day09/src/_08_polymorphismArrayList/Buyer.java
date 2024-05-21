package _08_polymorphismArrayList;

import java.util.ArrayList;

public class Buyer {
	int money = 500;
	int bonusPoint;
	
	
	//객체를 만들어서 사용할때 어레이리스트 사용
	//ArrayList<객체> 
	ArrayList<Product> cart = new ArrayList<Product>(); // 고객이 여러명일경우엔 배열을 이용
	int index = 0; //임의 변수 설정
	
	void buy(Product p ) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;//리턴은 호출한곳으로 돌아감 아래를 수행하지 않음
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart.add(p);//ArrayList 사용하면 add로 배열의 차례대로 뒷부분에 객체를 넣어줄수있다
		System.out.println(p+"를 구입함");//오버라이딩 해놨으므로 p는 Tv라고 출력됨
		}
	
	void info() {
		int sum = 0;
		String list = "";
		if (cart.isEmpty()) {
			System.out.println("구입한 제품이 없습니다");
			return;
		}
		
		for(int i=0; i<cart.size(); i++) { // 배열의 사이즈만큼 반복 인덱스 넘버가 아니라 배열에 들어있는 갯수만큼
			Product p1 = cart.get(i); // get 배열의 인덱스에 들어있는 자료가져옴
			sum += p1.price; // 선택한 제품 총 금액
			list += p1 + ", "; // 선택한 제품 리스트
			
		}
		System.out.println("선택한 제품 총 금액: " + sum+"만원입니다");
        System.out.println("구매한 제품 리스트: " + list);
	
	}
	
	void refund(Product p) {
		if(cart.remove(p)) { //.remove는 해당 객체를 ArrayList배열에서 지우는 명령어. 지웠으면 true로 리턴함
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+" 반품");
		}else {
			System.out.println("구입하지 않은 상품입니다");
		}
	}
	
	
	
	
	
}
