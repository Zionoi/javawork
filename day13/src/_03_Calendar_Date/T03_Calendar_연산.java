package _03_Calendar_Date;

import java.util.Calendar;

public class T03_Calendar_연산 {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
//			.add	기준날짜, 더할 일수
		date1.add(Calendar.DATE, 100); // 메소드 생성시 기본값 생성했으니 오늘날짜기준 100일후
		System.out.println("오늘부터 100일 후 : "+(date1.get(Calendar.MONTH)+1)+"월"+date1.get(Calendar.DAY_OF_WEEK)+"일");
		
		Calendar date2 = Calendar.getInstance();
		date2.add(Calendar.DATE, -100); // 메소드 생성시 기본값 생성했으니 오늘날짜기준 100일전
		System.out.println("오늘부터 100일 전 : "+(date2.get(Calendar.MONTH)+1)+"월"+date2.get(Calendar.DAY_OF_WEEK)+"일");
		
		Calendar date3 = Calendar.getInstance();
		date3.add(Calendar.MONTH, 2);
		System.out.println("오늘부터 2달 후 : "+(date3.get(Calendar.MONTH)+1)+"월"+date3.get(Calendar.DAY_OF_WEEK)+"일");
		
		
	}

}
