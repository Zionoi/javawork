package list_music;

public class AscTitle implements Comparable<Music>{

	//곡명을 오름차순으로 정렬해주는 메소드 오버라이드
		@Override
		public int compareTo(Music o) {
			return o.getTitle().compareTo(o.getTitle());
		}

}
