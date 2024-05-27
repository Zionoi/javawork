package _03_Calendar_Date;

import java.util.Calendar;

public class T02_Calendar_set {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		date1.set(2024, 12-1, 7);
		int month = date1.get(Calendar.MONTH);
		System.out.println("월 : " + date1.get(Calendar.MONTH));
		System.out.println("월 : " + (month +1 )); // 12월은 따로 작업이 필요함 
		
		date1.set(2024,  5-1, 27, 16, 53);
		System.out.println(date1.get(Calendar.HOUR)+ "시");
		
		
		// 앞은 숫자, 뒤는 달
		date1.set(Calendar.MONTH, Calendar.MAY);
		//가지고올때는 get으로 가져온다. +1해야함 (달 한정)
		System.out.println(date1.get(Calendar.MONTH)+1+"월");
		
		
		
	}

}
