package _04_UserExceptionEx;

public class InputNum_api {
	
	public void InputNum(int num1, int num2) throws UserException{	
		
		if(num1>100||num1<1||num2>100||num2<1) {
			
			throw new UserException("1~100의 숫자가 아닙니다");
		}else {
			
			boolean result= num1%num2 == 0 ? true : false;
			System.out.println("정수1 : "+num1+"\n정수2 : "+num2+"\n"+num1+"은(는) "+num2+"의 배수인가? "+result);
		}
			
			
	}
}
