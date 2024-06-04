package com.practice.list.music.view;
import java.util.Scanner;

import com.practice.list.music.controller.MusicController;
import com.practice.list.music.model.vo.Music;


public class MusicView {
	private static Scanner sc = new Scanner(System.in);
	private static MusicController mc = new MusicController();
	boolean flag = false;
	

	
	public void mainMenu() {
		while(!flag) {
			System.out.println("****** 메인 메뉴 ****** ");
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
				case 1 : addList();
					break;
				case 2 : addAtZero();
					break;	
				case 3 : printAll();
					break;
				case 4 : searchMusic();
					break;
				case 5 : removeMusic();
					break;
				case 6 : setMusic();
					break;
				case 7 : ascTitle();
					break;
//				case 8 : mc.descSinger();
//					break;
				case 9 : 
					System.out.println("프로그램을 종료합니다");
					flag=true;
			}
		}
    
	}
	//리스트 마지막에 값 저장 메소드
	public static void addList(){
		System.out.println("곡 명 입력 : ");
		String name = sc.nextLine();
		System.out.println("가수명 입력 : ");
		String singer = sc.nextLine();
		int result = mc.addList(new Music(name, singer));
		if(result == 1) {
			System.out.println("추가 완료");
		}else {
			System.out.println("추가 실패");
		}
	}
	//리스트 첫 번째에 값 저장 메소드
	public static void addAtZero() {
		System.out.println("첫번째 자리에 추가할 곡 명 입력 : ");
		String name = sc.nextLine();
		System.out.println("가수명 입력 : ");
		String singer = sc.nextLine();
		int result = mc.addAtZero(new Music(name, singer));
		if(	result == 1) {
			System.out.println("추가 완료");
		}else {
			System.out.println("추가 실패");
		}
		
	}
	// 전체 리스트를 출력하는 메소드
	public static void printAll() {
		System.out.println(mc.printAll());
	}
	//곡 명을 검색하는 메소드
	public static void searchMusic() {
		System.out.println("찾을 곡 명 입력 : ");
		String name = sc.nextLine();
		Music result = mc.searchMusic(name);
		if(result==null) {
			System.out.println("곡을 찾을 수 없습니다");
		}else {
			System.out.println(mc.searchMusic(name));
		}
	}
	//곡 명으로 찾아 삭제하는 메소드
	public static void removeMusic() {
		System.out.println("지울 곡 명 입력 : ");
		String name = sc.nextLine();
		mc.removeMusic(name);
	}
	
	// 곡명으로 찾아 내용을 수정하는 메소드
	public static void setMusic() {
		System.out.println("정보를 수정할 곡 이름 : ");
		String name = sc.nextLine();
		System.out.println("해당 곡 이름을 다시 입력해주세요 : ");
		String setName = sc.nextLine();
		System.out.println("해당 곡 가수이름 : ");
		String singer = sc.nextLine();
		Music result = mc.setMusic(name, new Music(setName,singer));
		if(result==null) {
			System.out.println("해당곡을 찾지 못했습니다");
		}else {
			System.out.println(setName+"/"+singer+"정보 수정 완료");
		}
	}
	
	// 곡명 오름차순 정렬 메소드
	public static void ascTitle() {
		int result = mc.ascTitle();
		if(result == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
	}
}
