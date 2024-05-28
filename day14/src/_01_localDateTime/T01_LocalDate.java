package _01_localDateTime;

import java.time.LocalDate;

public class T01_LocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);  //2024-05-28
		System.out.println(today.getYear() + "년"); //2024년
		System.out.println(today.getMonth());  //MAY
		System.out.println(today.getMonthValue() + "월"); //5월
		System.out.println(today.getDayOfMonth() + "일"); //28일
		System.out.println("365일 중 " + today.getDayOfYear() + "일"); //365일 중 149일
		System.out.println(today.getDayOfWeek()); //TUESDAY
		System.out.println(today.getDayOfWeek().getValue()); // 요일을 숫자로 변환. 일욜일==0
		System.out.println("이달은 총 " + today.lengthOfMonth() + "일까지 이다"); // 달의 가장 마지막 일수 출력
		System.out.println("올해는 총 "+ today.lengthOfYear()); // 올해가 총 몇일인지 출력.
		System.out.println("올해는 윤년인가? "+today.isLeapYear()); //  윤년 구분 true false 반환
		System.out.println("---------------------------------");
		
		LocalDate day = LocalDate.of(2024, 5, 7);
		System.out.println(day);
		
		
		
		
		int[] date1 = {2021, 12, 28};
		int[] date2 = {2021, 12, 29};
		int[] date3 = {1024, 10, 24};
		int[] date4 = {1024, 10, 24};
//		if(date1[0]>date2[0]) return 1
//		if(date1[1]>date2[1]) return 1
//		if(date1[2]>date2[2]) return 1
		LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);
		
        System.out.println(d1.compareTo(d2));

		
		
		
		
	}

}
