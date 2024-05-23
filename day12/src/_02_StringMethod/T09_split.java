package _02_StringMethod;

import java.util.Arrays;

public class T09_split {

	public static void main(String[] args) {
		// split 
		String text = "홍길동-아무개-이순신-강감찬";
		String[] name = text.split("-"); //-를 기준으로 배열에 넣는다
		System.out.println(Arrays.toString(name));// 결과값 [홍길동, 아무개, 이순신, 강감찬]
		
		String text2 = "홍길동-아무개/이순신,강감찬@이고잉";
		String[] name2 = text2.split("-|/|,|@"); // | : |를 이용해 특수문자 여러개를 기준점으로 삼을 수 있다 
		System.out.println(Arrays.toString(name2));// 결과값 [홍길동, 아무개, 이순신, 강감찬, 이고잉]
		
		// split(분리문자열, 배열의 갯수)
		String[] name3 = text.split("-", 2); // - 기준으로 배열의 크기는 2개까지만 배열로 생성
		System.out.println(Arrays.toString(name3)); // 결과값 [홍길동, 아무개-이순신-강감찬]
		
		
	}

}
