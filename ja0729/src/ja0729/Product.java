package ja0729;

public class Product {
	static int count;
	int serialNo;
	String pName;
	
	// 기본 생성자
	Product(){}
	
	Product(int serialNo, String pName){
		this.serialNo = serialNo;
		this.pName = pName;
		
	}

}
