package _03_tv;

import java.util.Scanner;

public class T01_main_tv {

	public static void main(String[] args) {
/*
		Scanner sc = new Scanner(System.in); 메소드에 (매개변수)
		Math.random() 메소드
		String str = "aaaa";
		str.length() 메소드
*/		
		
		T01_api_tv tv1 = new T01_api_tv();

		System.out.println("회사명 : "+tv1.company);
		System.out.println("모델명 : "+tv1.model);
		System.out.println(tv1.inch+"인치");
		
		tv1.power();
//		System.out.println("tv상태 : "+tv1.power);
		System.out.println("현재 채널 : "+tv1.channelup());
		System.out.println("현재 채널 : "+tv1.channelup());
		System.out.println("현재 채널 : "+tv1.channeldown());
		
		System.out.println("현재 볼륨 : "+tv1.volume(12));
		tv1.power(); // 괄호가 있으면 메소드 호출
//		System.out.println("tv상태 : "+tv1.power); // 괄호없으면 변수=속성 호출
		
		
		
		
		

	}

}
