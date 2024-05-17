package _02_constructor;

public class T01_api_tv {
	//인스턴스 변수
	String company;
	String model;
	int channel;
	
	
	//기본 생성자
	/*
	T01_api_tv() { //기본생성자는 매개변수가있는 생성자가 먼저 하나라도있으면 자동으로 안만들어짐
		System.out.println("기본 생성자");
	}
	*/	
	
/*					//매개변수 지역변수 1개인 생성자
	T01_api_tv(String company) { //사용자가 넣은 지역변수값을 인스턴스에 넣으시오
		this.company = company;
		}
*/
	
	//매개변수가 3개인 생성자
	T01_api_tv(String company, String modelName, int channel){
		this.company = company;
		model = modelName;
		this.channel = channel;
		
	
		
		
		
	}
	
	
}
