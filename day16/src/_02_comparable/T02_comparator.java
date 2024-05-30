package _02_comparable;

import java.util.*;

class Descending implements Comparator {


	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Comparable && o2 instanceof Comparable ) {
			Comparable c1 = (Comparable)o1; // 위가 참이면 o1 ,o2를 Comparable로 형변환한다
			Comparable c2 = (Comparable)o2; // 둘다 오름차순 정렬 되어있다
			return c2.compareTo(c1); // 이렇게 하면 내림차순
//			return c1.compareTo(c2); // 이렇게 하면 오름차순
		}
		return -1;
	}
	
}



public class T02_comparator {

	public static void main(String[] args) {
		String[] strArr = {"cat","Dog", "tiger","lion"};
		Arrays.sort(strArr); // sort : 자동으로 위에 배열이 정렬되서 들어간다
		System.out.println(Arrays.toString(strArr)); // 출력시 [Dog, cat, lion, tiger]
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대, 소문자 구분 안하는 메소드
		System.out.println(Arrays.toString(strArr)); // 출력시 [cat, Dog, lion, tiger]
		
		// 내가 만든 역순 정렬
		Arrays.sort(strArr, new Descending());// 가져온 클래스의 정렬기준이 역순이기때문에
		System.out.println(Arrays.toString(strArr)); //출력시 [tiger, lion, cat, Dog] 로 출력된다
		
	}

}
