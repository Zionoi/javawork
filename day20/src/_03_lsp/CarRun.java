package _03_lsp;

public class CarRun {

	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.drive();
		sedan.stop();
		
		FireEngine fe = new FireEngine();
		fe.drive();
		fe.water();
		fe.stop();
		
		Ambulance ab = new Ambulance();
		ab.patientTransport();
		
	}

}
