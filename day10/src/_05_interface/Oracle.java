package _05_interface;

public class Oracle implements DataAccess {

	@Override
	public void select() {
		System.out.println("Oracle 의 정보를 검색합니다");
		

	}

	@Override
	public void insert() {
		System.out.println("Oracle 에 정보를 삽입합니다");

	}

	@Override
	public void update() {
		System.out.println("Oracle 의 정보를 수정합니다");

	}

	@Override
	public void delete() {
		System.out.println("Oracle 의 정보를 삭제합니다");

	}

}
