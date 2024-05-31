package list_music;

import java.util.*;

public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();
	
	
	//리스트 마지막에 값 저장 메소드
	int addList(Music music) {
		list.add(music);
		
		return list.size()-1; //추가된 위치의 인덱스 반환
	}
	
	//리스트 첫 번째에 값 저장 메소드
	int addAtZero(Music music) {
		list.add(0, music);
		return list.size(); // 추가후 리스트의 곡 갯수 반환
	}
	
	List printAll() {
		return list;
	}
	
	//곡 명을 검색하는 메소드
	Music searchMusic(String title) {
	    for (Music music : list) {
	        if (music.getTitle().equals(title)) {
	        	return music;
	        }
	    }
	    return null;
	}
	
	//곡 명으로 찾아 삭제하는 메소드
	/*	 public Music removeMusic(String title) {
		        // 제목에 해당하는 음악을 찾아서 삭제하고, 삭제된 음악 객체를 반환
		        for (Iterator<Music> iterator = list.iterator(); iterator.hasNext();) {
		            Music music = iterator.next();
		            if (music.getTitle().equals(title)) {
		                iterator.remove(); // 해당 음악을 리스트에서 삭제
		                return music; // 삭제된 음악 객체를 반환
		            }
		        }
		        
	        // 여기까지 왔다는 것은 해당 제목의 음악을 찾지 못한 경우
	        return null; // null값 반환
	    }*/
	
	// Arrays.asList(null); : 어레이를 리스트 형태로
	void removeMusic(String title) {
		Iterator<Music> iterator
		boolean removed = false;
		iterator<Music> itertor = list.iterator();
		while (iterator.hasNext()); {
			Music music = iterator.next();
	
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}	
