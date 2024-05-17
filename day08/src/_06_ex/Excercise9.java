package _06_ex;

public class Excercise9 {

	public static void main(String[] args) {
		
		Excercise ex1 = Excercise.getInstance();
		Excercise ex2 = Excercise.getInstance();
		
		System.out.println("ex1 == ex2 : "+ (ex1 == ex2));
	}
	
}


class Excercise {
	
	private static Excercise Instance = new Excercise();
	
		private Excercise() {
			
		}
	
		static Excercise getInstance() {
			return Instance;
			
		}
	
	
	
}