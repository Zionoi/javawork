package _03_lsp;

public class Ambulance implements Car, patientTransport {

	@Override
	public void drive() {
		System.out.println("직진");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("좌회전");

	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("우회전");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("정지");

	}

	@Override
	public void patientTransport() {
		System.out.println("환자 이송중");
		
	}

}
