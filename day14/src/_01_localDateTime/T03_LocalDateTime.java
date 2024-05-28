package _01_localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today); //2024-05-28T11:30:22.530508600
		
		LocalDateTime startDay = LocalDateTime.of(2024, 5, 7, 10, 0,0);// 년,월,일,시,분,초
		LocalDateTime endDay = LocalDateTime.of(2024, 11, 25, 18, 30, 0);// 년,월,일,시,분,초
		System.out.println(startDay);
		
		
		
		
		//시간출력 포멧을 바꾸고 싶을때								   년-월-일 오전오후 시-분-초
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh-mm-ss");
		System.out.println("시작일 : " + startDay.format(dtf)); //2024/05/07 오전 10/00/00
		System.out.println("종료일 : " + endDay.format(dtf));
		
		//today가 endDay보다 이전날짜인가?
		if(today.isBefore(endDay)) {
			System.out.println("수업 진행중 입니다");
			
			//today가 endDay보다 이후날짜인가?
		} else if(today.isAfter(endDay)) {
			System.out.println("종료한 수업 입니다");
			
			//today와 endDay가 같은가?
		} else if(today.isEqual(endDay)) {
			System.out.println("오늘 종료하는날 입니다");
		}
		
		//두개의 시간 비교
		Duration duration = Duration.between(today, endDay);
		System.out.println(duration.getSeconds()); //두개의 시간이 몇초 차이나는지
		
		// 종료일까지 몇시간 남았는지				이시간부터		  이시간까지 얼마나 남았는지. 뒤의 매개변수로 유닛(단위) 지정해줘야함
		System.out.println("종료일까지의 시간 : " + today.until(endDay, ChronoUnit.HOURS) + "시간 남음");
		// 종료일까지 몇개월 남았는지				
		System.out.println("종료일까지의 시간 : " + today.until(endDay, ChronoUnit.MONTHS) + "개월 남음");
		// 종료일까지 며칠 남았는지
		System.out.println("종료일까지의 시간 : " + today.until(endDay, ChronoUnit.DAYS) + "일 남음");
		// 종료일까지 몇시간 남았는지
		System.out.println("종료일까지의 시간 : " + today.until(endDay, ChronoUnit.HOURS) + "시간 남음");
		
		LocalTime endTime = LocalTime.of(18, 30, 0);
	
		System.out.println("종료시간까지 " + LocalTime.now().until(endTime, ChronoUnit.HOURS) + "시간 남음");
		System.out.println("종료시간까지 " + LocalTime.now().until(endTime, ChronoUnit.MINUTES) + "분 남음");
		System.out.println("------------------------");
		
		// 기준날짜로부터 이후, 이전 출력			 .format()으로 출력폼 변경가능 포매터로 미리 형식 만들어야함
		System.out.println(today.plusYears(3).format(dtf)); //today로부터 3년후
		System.out.println(today.plusMonths(5).format(dtf)); //today로부터 5개월후
		System.out.println(today.plusDays(15).format(dtf)); //today로부터 15일후
		System.out.println("------------------------");
		System.out.println(today.plusYears(-3).format(dtf)); //today로부터 3년전
		System.out.println(today.plusMonths(-5).format(dtf)); //today로부터 5개월전
		System.out.println(today.plusDays(-15).format(dtf)); //today로부터 15일전
		
		
		//변경시 with
//		withDayOfMonth();
		
		
		
	}

}
