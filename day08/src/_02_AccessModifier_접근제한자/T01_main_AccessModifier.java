package _02_AccessModifier_접근제한자;

public class T01_main_AccessModifier {

	public static void main(String[] args) {
		T01_api_AccessModifier a1 = new T01_api_AccessModifier();
//		System.out.println(a1.priNum); //오류 private라 접근할 수 없어서 호출 불가.
		
		a1.setPriNum(10);
		System.out.println(a1.getPriNum()); //가져온값을 출력하거나
		int num = a1.getPriNum();  // 변수에 넣거나
		
	}

}
