package _05_BuilderPattern.BuilderConstructor;

import java.util.ArrayList;
import java.util.List;

public class SubwayMenu {
	    private List<String> toppings;
	    private int size;
		private String bread;
		private String cheese="모짜렐라";
		private String extraTopping="없음";
		private boolean vagetable;
		private String source;
	    // 생성자
	    public SubwayMenu() {
	        this.toppings = new ArrayList<>();
	        initializeToppings();
	    }
	    public SubwayMenu(int size, String bread, String cheese, String extraTopping, boolean vagetable, String source) {
			super();
			this.size = size;
			this.bread = bread;
			this.cheese = cheese;
			this.extraTopping = extraTopping;
			this.vagetable = vagetable;
			this.source = source;
		}

	    // 초기 토핑 목록을 설정하는 메서드
	    private void initializeToppings() {
	    	 String[] initialToppings = {"양상추", "토마토", "치즈", "햄","큐브스테이크","에그마요","올리브","페퍼로니","피클","닭가슴살","닭다리살"};
	         this.toppings.addAll(List.of(initialToppings));
	        
	    }

	    // 토핑 추가 메서드
	    public void addTopping(String topping) {
	        this.toppings.add(topping);
	    }

	    // 토핑 제거 메서드
	    public void removeTopping(String topping) {
	        this.toppings.remove(topping);
	    }

	    // 모든 토핑 출력 메서드
	    public void printToppings() {
	        System.out.println("Subway Menu Toppings:");
	        for (String topping : this.toppings) {
	            System.out.println("- " + topping);
	        }
	    }

		/*   // 메인 메서드
		   public static void main(String[] args) {
		       SubwayMenu subwayMenu = new SubwayMenu();
		       
		       // 토핑 추가
		       subwayMenu.addTopping("올리브");
		       
		       // 토핑 제거
		       subwayMenu.removeTopping("토마토");
		       
		       // 모든 토핑 출력
		       subwayMenu.printToppings();
		       
		   }*/
	}
	
	

