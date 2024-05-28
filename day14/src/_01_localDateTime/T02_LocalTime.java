package _01_localDateTime;

import java.time.LocalTime;

public class T02_LocalTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time); //시:분:초.밀리세컨드까지 반환
		System.out.println(time.getHour() + "시"); //시간
		System.out.println(time.getMinute() + "분"); // 분
		System.out.println(time.getSecond() + "초"); // 초
		
		//시간 세팅
		LocalTime time2 = LocalTime.of(17, 20, 1);
		System.out.println(time2); //17:20:01
	}

}
