package _03_abstract;

public class PhoneRun {

	public static void main(String[] args) {
		Phone phone1 = new FolderPhone("김요한");
		phone1.turnOn();
		phone1.turnOff();
		
		
		phone1 = new SmartPhone("한요김");// 다형성
		phone1.turnOn();
		phone1.turnOff();
		
		

	}

}
