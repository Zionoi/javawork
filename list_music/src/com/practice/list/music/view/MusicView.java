package com.practice.list.music.view;
import java.util.Scanner;

import com.practice.list.music.controller.MusicController;


public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	boolean flag = false;
	

	
	void mainMenu() {
		while(!flag) {
			System.out.println("****** 메인 메유 ****** ");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println("**원하는 메뉴 번호 입력**");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1 : MusicController.addList(null);
				break;
		
		
			}
		}
	}
	


	
    static void addList() {
 //   	MusicController.addList(null);
    }
    static void addAtZero() {
		
	}
	static void printAll() {
		
	}
	static void searchMusic() {
		
	}
	static void removeMusic() {
		
	}
	static void setMusic() {
		
	}
	static void ascTitle() {
		
	}
	  // 가수명을 내림차순으로 정렬하는 메소드
    public static void descSinger() {
////        Collections.sort(list, new DescendingSinger());
//        System.out.println("가수 명을 내림차순으로 정렬하였습니다.");
    }
    
    
    
}
