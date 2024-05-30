package _02_comparable;
import java.util.*;
public class FruitDescending implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		//내림차순
		if(o1.price < o2.price)
			return 1;  //여기가 -1이면 오름차순이 됨
		else if(o1.price == o2.price)
			return 0;
		else
			return -1; // 여기가 1이면 오름차순이 됨.
		
	}
	
	
}
