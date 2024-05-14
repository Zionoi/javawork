package _01_object;

public class T01_main_class {

	public static void main(String[] args) {
		//api 불러오기
		T01_api_class ob1 = new T01_api_class();
		//불러온 객체안에 변수 불러오기
		int result = ob1.num;
//		System.out.println(result);
//		System.out.println(ob1.num);
		
//		System.out.println(ob1.name);
		
		ob1.name = "kyh"; // 값을 변경할수도 있음
//		System.out.println(ob1.name);
		
		T02_api_class ob2 = new T02_api_class();
		ob1.name = "김요한";
//		ob2.address = "경기도 광주시 탄벌동";
//		System.out.println(ob1.name+"\n"+ob2.age+"\n"+ob2.address);
		System.out.println(ob2.age + "살");
		System.out.println("주소 : "+ob2.address);
		ob2.address = "경기도 광주시 탄벌동";
		System.out.println("주소 : "+ob2.address);
		
		
		
	}

}
