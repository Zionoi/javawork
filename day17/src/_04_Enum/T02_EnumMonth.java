package _04_Enum;

import java.util.Calendar;

public class T02_EnumMonth {

	public static void main(String[] args) {
		Month month = null;
		
		Calendar cal = Calendar.getInstance();
		int TodayMonth = cal.get(cal.MONTH);
		System.out.println(TodayMonth);
		switch (TodayMonth) {
		case 0 : month = Month.January; break;
		case 1 : month = Month.February; break;
		case 2 : month = Month.March; break;
		case 3 : month = Month.April; break;
		case 4 : month = Month.May; break;
		case 5 : month = Month.June; break;
		case 6 : month = Month.July; break;
		case 7 : month = Month.August; break;
		case 8 : month = Month.September; break;
		case 9 : month = Month.October; break;
		case 10 : month = Month.November; break;
		case 11 : month = Month.December; break;
		}
		
		if(month == Month.August)
		System.out.println("내 생일 달");

		if(month == Month.May)
		System.out.println("수업시작한지 아직 한달도 안됐네");

	}

}
