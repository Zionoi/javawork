package _08_polymorphismArrayList;

public class ProductRun {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		GameDevice game = new GameDevice();
		
		b.buy(tv);
		b.buy(com);
		b.buy(game);
		System.out.println("현재 남은 돈 : "+b.money+"만원");
		System.out.println("보너스 점수 : "+b.bonusPoint+"점");
		b.buy(new Tv());
		
		b.info();
		b.refund(tv); // 괄호안에 new로 새로만들면 위에 생성한 tv와는 다른 객체가 되는것. 그러므로 위에 먼저 tv를 선언후 변수에 넣어 그 변수명으로 refund한다
		b.info();
	}

}
