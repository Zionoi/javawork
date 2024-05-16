package _02_constructor;

public class T02_main_tv {

	public static void main(String[] args) {
	
/*		
		T01_api_tv tv1 = new T01_api_tv();
		System.out.println("tv1의 채널 : "+tv1.channel);

		T01_api_tv tv2 = new T01_api_tv();
		System.out.println("tv2의 채널 : "+tv1.channel);
*/
/*		//매개변수가 1개인 생성자
		T01_api_tv tv3 = new T01_api_tv("삼성");
		System.out.println("tv3의 회사는 : "+ tv3.company);
	
		T01_api_tv tv4 = new T01_api_tv("LG");
		System.out.println("tv4의 회사는 : "+ tv4.company);
	*/
		// 매개변수가 3개인 생성자 사용항여 객체 생성
		T01_api_tv tv5 = new T01_api_tv("삼성", "FULL HD", 70);
		System.out.println("tv5 : "+tv5.company +", "+ tv5.model);
		T01_api_tv tv6 = new T01_api_tv("울트라", "LG", 50);
		System.out.println("tv6 : "+tv6.company +", "+ tv6.model);
		
		
		
		
	}

}
