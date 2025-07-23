package ja0723;

import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력하세요");
//		int input2 = scan.nextInt();
//		
////		int add = input+input2;
//		
//		long add = (long)input+input2;
//				
//		System.out.println("입력 숫자 : "+input);
//		System.out.println("입력 숫자2 : "+input2);
//		System.out.println("합계 : "+add);
		
		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억이하 덧셈");
		System.out.println("2. 21억이상 덧셈");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		
		int choice = scan.nextInt(); //nextDouble()
				
		switch(choice) {
		case 1: 
			System.out.println("첫번째 숫자를 입력하세요.>> ");
			int num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요.>> ");
			int num2 = scan.nextInt();
			int add = num1+num2;
			
			System.out.println("입력 숫자 1 : "+num1);
			System.out.println("입력 숫자 2 : "+num2);
			System.out.println("합계 : "+add);
			
			break;
			
		case 2:
			System.out.println("첫번째 숫자를 입력하세요.>> ");
			long num3 = scan.nextLong();
			System.out.println("두번째 숫자를 입력하세요.>> ");
			long num4 = scan.nextLong();
			long add2 = num3+num4;
			
			System.out.println("입력 숫자 1 : "+num3);
			System.out.println("입력 숫자 2 : "+num4);
			System.out.println("합계 : "+add2);
			
			break;

		}
	}

}
