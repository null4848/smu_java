package ja0721;

import java.util.Scanner;


public class C0721_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 숫자를 입력받아 더한 값을 출력하시오.
		System.out.println("첫번째 숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		System.out.println("첫번째 숫자 : "+num1);
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		System.out.println("두번째 숫자 : "+num2);
		
		int result = num1+num2;
		System.out.println("합계 : "+result);
		
		

	}

}
