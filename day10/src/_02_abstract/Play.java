package _02_abstract;

public class Play {
	
	void diskThrow(Pet p) {
		System.out.println("원반을 던졌다");
		int num1 = (int)(Math.random()*5);
		if(num1 >= 3)
		System.out.println(p.getName()+"가 원반을 물어왔다");
		else
			System.out.println(p.getName()+"가 원반에 맞았다");
		}
	
	void feed(Pet p) {
		System.out.println(p.getName()+"에게 밥을줬다");
		int num1 = (int)(Math.random()*7)+1;
		if(num1 > 6)
		System.out.println(p.getName()+"가 배고팠는지 허겁지겁 밥을 먹었다");
		else if(num1 >= 3)
			System.out.println(p.getName()+"가 밥을 맛있게 먹었다");
		else
			System.out.println(p.getName()+" 배가 부른지 밥을 먹지 않았다");
	}
	
	
}
