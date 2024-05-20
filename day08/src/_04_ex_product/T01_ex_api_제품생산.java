package _04_ex_product;

public class T01_ex_api_제품생산 {
	String serialNo;
	static int count; // 제품마다 카운트를 공유해야하니 static으로 변수지정
	private static int productTotalCount; 
	
	T01_ex_api_제품생산() {
		serialNo = "더조은"+ ++count;
		 ++productTotalCount;
	}
	
	int getproductTotal() {
		return productTotalCount;
	}
}
