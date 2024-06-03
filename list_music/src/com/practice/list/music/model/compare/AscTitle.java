package com.practice.list.music.model.compare;

import com.practice.list.music.model.vo.Music;

public class AscTitle implements Comparable<Music>{

	//곡명을 오름차순으로 정렬해주는 메소드 오버라이드
		@Override
		public int compareTo(Music o) {
			return o.getTitle().compareTo(o.getTitle());
		}
//		
//	//곡명을 오름차순으로 정렬해주는 메소드 오버라이드
//			public int compareTo(Music o1, Music o2 ) {
//				return o1.getTitle().compareTo(o2.getTitle());
//			}
//	
	
}
