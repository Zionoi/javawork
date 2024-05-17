package _02_AccessModifier_접근제한자;

public class T01_api_AccessModifier {
	//접근제한자
	/*					적용할 내용 						접근할 수 없는 클래스	
	public		클래스, 필드, 생성자, 메소드	- 				  없음						- 전부 접근가능 다른프로젝트에서도 접근가능. 한 공간에 퍼블릭이 붙을수 있는 클래스는 단 한개만 가능
	protected		  필드, 생성자, 메소드	- 자식 클래스가 아닌 다른 패키지에 소속된 클래스는 접근 못함	- 상속된 클래스만 접근 가능
	default 	클래스, 필드, 생성자, 메소드	- 다른패키지에 소속된 클래스는 접근 못함				- 같은 패키지 안에서만 접근가능
	private			  필드, 생성자, 메소드 	- 모든 외부 클래스는 접근 못함 						- 클래스 내에서만 접근 가능	
	*/

	private int priNum = 5;
	
	private void method() { // private는 다른클래스에서 접근 못함. method 호출 불가
		System.out.println("private 메소드");
	}

	void setPriNum(int priNum) {//priNum에 접근할수있는 메소드
		// 값을 넣어줄땐 보통 앞에 set을 붙여준다 세터메소드
		this.priNum = priNum;
	}
	int getPriNum() {
		// 값을 얻어올땐 보통 앞에 get을 붙여준다 게터메소드
		return priNum;
	}




}
