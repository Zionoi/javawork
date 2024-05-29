package _03_Tree;
import java.text.DecimalFormat;
import java.util.*;

public class T02_TreeSet {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		TreeSet lotto = new TreeSet();
		TreeSet lottoCatch = new TreeSet();
		
		Scanner sc = new Scanner(System.in);
	
		
		
		
		System.out.println("구입할 로또 갯수를 적으시오 개당 천원(숫자만) : ");
		int buyCount = sc.nextInt(); //구매 횟수 입력
		int collectCount = 0; //1등 당첨 횟수 변수
		int lottoCount = 0; // 반복되는 로또 카운트
		int _2ndCount =0; //2등 당첨 횟수
		
		
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println("이번주 로또번호는"+lotto+" 입니다");
		for(int i=1;i<=buyCount; i++) {
			if(i%5==0) {
				System.out.println("-------------------------");
			}
			while(ts.size()<6) {
				ts.add((int)(Math.random()*45)+1);
				lottoCount +=1;
			}if(lotto.equals(ts)) {
					System.out.println("축하합니다 당첨되셨습니다!!");
					collectCount +=1;
					lottoCatch.add(lottoCount+"회");
					
				}
				System.out.println(ts);
				ts.retainAll(lotto);
				if(ts.size()==5){
					_2ndCount += 1;
				}
				ts.clear();
			}
		
		
		
			System.out.println("당첨번호 : "+lotto);
			System.out.println("1등 당첨된 회차 : "+lottoCatch);
			System.out.println("총 사용 금액 : "+new DecimalFormat("#,###.##").format(buyCount*1000L)+"원\n1등 당첨횟수 : "+collectCount+"\n2등 당첨횟수 : "+_2ndCount);
			System.out.println();
//			System.out.println("총 사용 금액 : "+(long)(buyCount*1000)+"원\n당첨횟수 : "+collectCount);
			
/*		
		while(ts.size()<6) {
			ts.add((int)(Math.random()*45)+1);
		}
		System.out.println(ts); //TreeSet을 사용하면 자동으로 정렬까지 된다.
*/		
		
		
		
		
	
	}

}
