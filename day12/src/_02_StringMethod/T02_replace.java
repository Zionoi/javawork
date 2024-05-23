package _02_StringMethod;

public class T02_replace {

	public static void main(String[] args) {
		// replace : 글자 치환
		String str = "javaprogram java awsjava dajava";
		String newStr = str.replace("j", "자바"); // j를 자바로 치환
		System.out.println(str);

		String newStr1 = str.replace('j', '자'); // 캐릭터로 받을수도있음
		System.out.println(newStr1);
		
//		newStr = str.replace("java","자바"); // java를 자바로 변환
		System.out.println(newStr);
		
//		newStr = str.replaceAll("a", "A"); // 
		System.out.println(newStr);
		
		//replaceFirst : 맨 처음 만나는 글자만 치환됨.
			newStr = str.replaceFirst("java", "자바");
		
		
		
	} 

}
