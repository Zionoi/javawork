package _04_ex_product;

public class T01_ex_api_제품생산 {
	String serialNo;
	static int count;
	private static int productTotalCount; 
	
	T01_ex_api_제품생산() {
		serialNo = "더조은"+ ++count;
		 ++productTotalCount;
	}
	
	int getproductTotal() {
		return productTotalCount;
	}
}
