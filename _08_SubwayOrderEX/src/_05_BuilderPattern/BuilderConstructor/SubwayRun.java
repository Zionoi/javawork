package _05_BuilderPattern.BuilderConstructor;

import java.util.Scanner;

public class SubwayRun {

	public static void main(String[] args) {
				SubwayMenu menu1 = new SubwayBuilder(30, "화이트", " 머스타드")
						.setCheese("체다")
						.build(); // 빌드를 호출할때 객체가 생성된다.
		System.out.println(menu1);
		
		
		// 필수로 넣어야하는 옵션들은 생성자로 미리 설정해둔다.
		SubwayMenu menu2 = new SubwayBuilder(15, "허니오트", "스위트칠리")
				.setExtraTopping("아보카도")
				.build();
		
		System.out.println(menu2);
		
		SubwayBuilder sb = new SubwayBuilder(30, "화이트", "머스타드")
				.setCheese("모짜렐라");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 토핑을 선택하세요 : ");
		String topping = sc.nextLine();
		
		//기존에 만들어놨던거에 추가하고싶다면
		SubwayMenu menu3 = sb
				.setExtraTopping(topping)
				.build();
		
		System.out.println(menu3);
		SubwayMenu subwayMenu = new SubwayMenu();
        
        // 토핑 추가
        subwayMenu.addTopping("올리브");
        
        // 토핑 제거
        subwayMenu.removeTopping("토마토");
        
        // 모든 토핑 출력
        subwayMenu.printToppings();
        
		
		
	}

}
