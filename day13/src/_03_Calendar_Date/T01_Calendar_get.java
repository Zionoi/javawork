package _03_Calendar_Date;

import java.util.Calendar;

public class T01_Calendar_get {

	public static void main(String[] args) {
		// Calendar : 추상클래스. 객체를 생성할 수 없음. 메소드를 이용함
		
		/*
			java.util.Calendar
			-추상 클래스이므로 getInstance() 메소드를 통해 구현된 객체를 얻어야한다
			
			Calendar cal = new Calendar(); 에러 추상클래스는 인스턴스를 생성할 수 없다.
			
			Calendar cal = Calendar.getInstance
		*/
		
		Calendar today = Calendar.getInstance(); // import해야함 또는
//		java.util.Calendar.today = java.util.Calendar.getInstance(); //이렇게 임폴트 안하고 사용할 수 도 있다.
		
		System.out.println("현재 년도 : " + today.get(Calendar.YEAR)); // 아무것도 설정하지 않으면 시스템 캘린더에 들어있는 년도를 가져온다.
		// 월은 0부터 시작 0이면 1월 항상 1을 더해줘야한다. 월만 그렇다
		System.out.println("현재 월 : " + (today.get(Calendar.MONTH)+1)); // 월은 0부터 시작하기때문에 +1을 해줘야 제대로된 월이 나온다.
		System.out.println("이 달의 몇번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("올 해의 몇번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("---------------------------");
		
		//일									  	클래스이름.상수(필드) 고로 원형은 Calendar라는 클래스안에 public static final DATE 필드를 가져오는것 
		System.out.println("몇일 : " + today.get(Calendar.DATE));// 며칠인지?
		System.out.println("몇일 : " + today.get(Calendar.DAY_OF_MONTH)); // 이달 중 며칠인지?
		System.out.println("365일 중 몇일 : " + today.get(Calendar.DAY_OF_YEAR)); //올해중 며칠인지?
		
		
		//요일
		int week = today.get(Calendar.DAY_OF_WEEK); // 이번주중 며칠인지? 일요일부터 1
		System.out.println("요일(1:일요일)"+week);
		
		switch(week) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;	
		case 3:
			System.out.println("화요일");
			break;	
		case 4:
			System.out.println("수요일");
			break;	
		case 5:
			System.out.println("목요일");
			break;	
		case 6:
			System.out.println("금요일");
			break;	
		case 7:
			System.out.println("토요일");
				//맨 끝은 break; 안써도 됨.
		}
		System.out.println("---------------------------");
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY)); //24간 기준 시간
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR)); // 12시간 기준 시간. 오전오후 구분못함
		
		
		// 0 : am, 1 : pm
		System.out.println(today.get(Calendar.AM_PM)== 1 ? "오후" : "오전"); // 오전 오후 구분 1 : 오후, 0 : 오전
		// 삼항연산자로 오전 오후 출력문 만듬
		
		int apm = today.get(Calendar.AM_PM);
		if(apm == 0) {
			System.out.print("시간 : AM ");
			if(today.get(Calendar.HOUR)<10) {
				System.out.println("0" + today.get(Calendar.HOUR));
			} else {
				System.out.println(today.get(Calendar.HOUR));
				
			}
		}else
			System.out.print("시간 : PM ");
			if(today.get(Calendar.HOUR)<10) {
				System.out.println("0" + today.get(Calendar.HOUR));
			} else {
				System.out.println(today.get(Calendar.HOUR));
			}
			
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
		System.out.println("1/1000초 : " + today.get(Calendar.MILLISECOND));
		
		
		
		

	}

}
