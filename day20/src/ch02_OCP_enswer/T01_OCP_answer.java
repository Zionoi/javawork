package ch02_OCP_enswer;

public class T01_OCP_answer {

	public static void main(String[] args) {

		SoundPlayer sp = new SoundPlayer();
		
		sp.setPlayInter(new Wav());
		System.out.println("wav파일 재생 : ");
		sp.play();
		
		sp.setPlayInter(new MP3());
		System.out.println("mp3파일 재생 : ");
		sp.play();
			
	}

}
