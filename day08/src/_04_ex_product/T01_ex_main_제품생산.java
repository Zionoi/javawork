package _04_ex_product;

public class T01_ex_main_제품생산 {

	public static void main(String[] args) {
		T01_ex_api_제품생산 p1 = new T01_ex_api_제품생산();
		T01_ex_api_제품생산 p2 = new T01_ex_api_제품생산();
		T01_ex_api_제품생산 p3 = new T01_ex_api_제품생산();
		
		System.out.println("p1의 제품번호 : "+ p1.serialNo);
		System.out.println("p1의 제품번호 : "+ p2.serialNo);
		System.out.println("p1의 제품번호 : "+ p3.serialNo);
		
		System.out.println("총 생산된 제품수 : "+p1.getproductTotal());
		
		

	}

}
