package ch02_OCP_enswer;

public class SoundPlayer {
	private PlayInterface playInter;

	public void setPlayInter(PlayInterface playInter) { // 인터페이스를 상속받은 클래스는 다 들어올수있음 Wav, Mp3 등등
		this.playInter = playInter;
	}
	
	void play() {
		playInter.play();
	}
	
	
	
	
}
