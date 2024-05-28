package _03_Calendar_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T04_date {

	public static void main(String[] args) {
		//Date : 추상클래스 아님 new 생성 가능
		// import시 util 임폴트해야함
		
		Date now = new Date();
		System.out.println(now);  // 요일 월 일 시:분:초 KST(어느국가 표준시인지) 년도 로 출력됨 toString오버라이딩 되어있는 상태
		
//		now.setYear(2025); 
		
//		yyyy- M-dd hh:mm:ss       // MM : 월, mm : 분
//		2024-05-27 17:18		  
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//월에 앞자리에 0붙이려면 MM 두개쓰기
		System.out.println(sdf.format(now)); // now를 sdf포맷으로 출력하시오
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");//맨뒤에 한칸띄우고 a를 넣으면 오전 오후 출력함
		System.out.println(sdf2.format(now)); // now를 sdf포맷으로 출력하시오
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//시간을 대문자 H로 하면 24시간 기준시가 출력됨.(0~23)
		System.out.println(sdf3.format(now)); // now를 sdf포맷으로 출력하시오
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf4.format(now));

		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-M-d");
		System.out.println(sdf5.format(now));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("M-d-yyyy");
		System.out.println(sdf6.format(now));
		
		SimpleDateFormat sdf7 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		System.out.println(sdf7.format(now));
		
		
		//String을 날짜로 변환
		String str = "20240507";
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date strNow;
		try {
			strNow = sdf8.parse(str);
			System.out.println(sdf8.format(strNow));
			System.out.println(sdf9.format(strNow));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}

}
