package _01_StringBuffer_bulider;

public class T02_StringBuilder {

	public static void main(String[] args) {
		// StirngBuilder는 쓰레드 동기화를 하지않는것 빼곤 스트링버퍼와 기능이 같다. 
		
		StringBuilder sb = new StringBuilder();
		
		//문자열 추가 append
		sb.append("java");
		sb.append(" program study");
		System.out.println(sb); //java program study
		
		//문자열 중간에 추가 insert
		sb.insert(4, "2");
		System.out.println(sb); //java2 program study
		
		
		//한글자 변경 setCharAt(해당인덱스에, '변경할 글자'); char이니까 ''외따옴표로 지정하기
		sb.setCharAt(4, '7');
		System.out.println(sb);
		
		/*
		String(불변성) : 한번 객체가 생성되면 덮어쓰기 안됨(무조건 새로 생성)
						변경되지 않는 문자열을 사용할 때(혹은 변경이 별로 없는 문자열일 때) 
						
		StringBuffer : 추가, 삭제, 수정을 할 수 있다. 동기화를 지원
						자주 변경되는 문자열을 사용할 때, 멀티스레드 일 때 사용
						
		StringBuilder : 추가, 삭제, 수정을 할 수 있다. 동기화를 지원하지 않음
						자주 변경되는 문자열을 사용할 때, 단일스레드 일 때 사용
						StringBuffer보다 빠름
				
		*/
		
		
	}

}
