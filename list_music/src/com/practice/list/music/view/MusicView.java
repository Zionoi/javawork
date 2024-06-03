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
				case 1 : 
			
					break;
				
				case 2 : mc.addAtZero(null);
					break;	
				case 3 : mc.printAll();
					break;
				case 4 : mc.searchMusic(null);
					break;
				case 5 : mc.removeMusic(null);
					break;
				case 6 : mc.setMusic(null, null);
					break;
				case 7 : mc.ascTitle();
					break;
				case 8 : mc.descSinger();
					break;
				case 9 : flag=true;
			}
		}
    
	}
	public void addList(Music music){
	System.out.println("곡 명 입력 : ");
	String name = sc.nextLine();
	sc.nextLine();
	System.out.println("가수명 입력 : ");
	String singer = sc.nextLine();
	sc.nextLine();
	
	mc.addList(name, singer));
	}
    
}
