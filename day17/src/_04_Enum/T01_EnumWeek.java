package _04_Enum;

import java.util.Calendar;

public class T01_EnumWeek {

	public static void main(String[] args) {
		// 열거형(Enum) : 관련된 상수들을 같이 묶어 놓은 것. Java는 타입에 안전한 열거형을 제공

		Week today = null;

		Calendar cal = Calendar.getInstance();
		// 요일을 얻어오면 1~7이 반환됨. 일요일 = 1
		int week = cal.get(cal.DAY_OF_WEEK); // DAY_OF_WEEK : 반환형 int
		System.out.println(week);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
		}
		if (today == Week.SUNDAY)
			System.out.println("일요일은 짜파게티");
		else
			System.out.println("열심히 자바 공부를 한다");

	}

}
