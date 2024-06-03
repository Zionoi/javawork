package list_music;
import java.util.*;
import java.util.Objects;


public class Music {
	private String title;
	private String singer;
	
	public Music() {}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	
	//가수명을 내림차순으로 정렬해주는 메소드 오버라이드
	
	  // 가수명을 내림차순으로 정렬하는 메소드
    public void descSinger() {
  //      Collections.sort(list, new DescendingSinger());
        System.out.println("가수 명을 내림차순으로 정렬하였습니다.");
    }
	
	
	
	
}
