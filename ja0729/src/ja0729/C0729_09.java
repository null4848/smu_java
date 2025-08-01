package ja0729;

import java.util.Scanner;

public class C0729_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scan = new Scanner(System.in);
		Product[] p = new Product[10];
		
		
		int no = 0;
		
		while(true) {
			System.out.println("[ 스마트폰 생산 ]");
			System.out.println("1. 수동샌산");
			System.out.println("2. 자동샌산");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				p[no] = new Product();
				p[no].serialNo = no +1;
				p[no].pName = "스마트폰";
				no++;
				break;
				
			case 2:
				p[no] = new Product(no+1, "스마트폰");
				break;
			
			case 3:
				break;
				
			}
			
			
			
		}
		
		
//		for(int i=0; i<RanNum.arr.length;i++) {
//			System.out.println(RanNum.arr[i]);
//		}
		
		
	
		
	}

}
