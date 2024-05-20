package _06_polymorphismEx;

public class Buyer {
	int money = 500;
	int bonusPoint;

	/*	
		void buy(Computer com) {
			
		}
		void buy(Tv tv) {
			
		}
		void buy(GameDevice game) {
			
		}
		*/ //위처럼 판매하는 물건이 많을수록 위에 방법은 효율이 급감함
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;//리턴은 호출한곳으로 돌아감 아래를 수행하지 않음
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구입함");//오버라이딩 해놨으므로 p는 Tv라고 출력됨
		}
	
	
	
	
}
