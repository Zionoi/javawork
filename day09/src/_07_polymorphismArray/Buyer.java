package _07_polymorphismArray;

public class Buyer {
	int money = 500;
	int bonusPoint;

	Product[] cart = new Product[10]; // 고객이 여러명일경우엔 배열을 이용
	int index = 0; //임의 변수 설정
	void buy(Product p ) {
		
		if(money < p.price) {
			System.out.println("잔액부족");
			return;//리턴은 호출한곳으로 돌아감 아래를 수행하지 않음
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[index++] = p; // 구입할때마다 배열 인덱스를 하나씩 올려서 배열에 배정
		System.out.println(p+"를 구입함");//오버라이딩 해놨으므로 p는 Tv라고 출력됨
		}
	
	void info() {
		int sum = 0;
		String list = "";
		
		for(int i=0; i<index; i++) { // 구매한 제품의 배열 인덱스까지만 반복
			/*		이렇게도 가능함
					if(cart[i]==null)
						break;
			*/		
			sum += cart[i].price; // 선택한 제품 총 금액
			list += cart[i] + ", "; // 선택한 제품 리스트
			
		}
		System.out.println("선택한 제품 총 금액: " + sum+"만원입니다");
        System.out.println("구매한 제품 리스트: " + list);
	
	}
	
}
