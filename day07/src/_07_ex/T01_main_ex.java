package _07_ex;

public class T01_main_ex {

	public static void main(String[] args) {
		T01_api_ex a1 = new T01_api_ex();
		a1.bonus(100,0.05);
		System.out.println(a1.bonus);
		T01_api_ex a2 = new T01_api_ex("김요한","영업부","차장");
		T01_api_ex a3 = new T01_api_ex("김길동","개발부","사원");
		a2.bonus(4000000);
		a3.bonus(2500000,0.05);
		

	}

}
