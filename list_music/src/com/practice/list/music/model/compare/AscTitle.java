package com.practice.list.music.model.compare;
import java.util.*;
import com.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	//곡명을 오름차순으로 정렬해주는 메소드 오버라이드
	@Override
		public int compare(Music o1, Music o2) {
			if(o1.getTitle().compareTo(o2.getTitle())<0)
				return -1;
			else if(o1.getTitle().compareTo(o2.getTitle())<0)
				return 1;
			else
				return 0;
			
		}

	
	
		
	
		
		/*//곡명을 오름차순으로 정렬해주는 메소드 오버라이드
				public int compareTo(Music o1, Music o2 ) {
					return o1.getTitle().compareTo(o2.getTitle());
				}
		*/
	
}
