package MusicPlayer;

public interface MusicPlayer {

	
	default void play(String cod) {	
		System.out.println("play " + cod);
	}
}
