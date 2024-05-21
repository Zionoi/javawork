package _05_interface;

public class DataAccessRun {

	public static void main(String[] args) {
		Oracle oracle = new Oracle();
		oracle.insert();
		
		MySql mysql = new MySql();
		mysql.delete();
		
		DataAccess daoracle = oracle; // 자식클래스인 oracle을 부모격인 인터페이스로 형변환
		daoracle.update();
		
	}

}
