package ja0723;

import java.util.Scanner;

public class C0723_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 중첩 for 문
//		for (int i = 2; i<= 9; i++) {
//			System.out.printf("[ %d 단 ]", i);
//			for (int j=1; j<=9; j++) {
//				System.out.printf("%d X %d = %d \n",i,j,i*j);
//			}
//			
//			System.out.prinln();
			
		// 2개 숫자를 입력받아, 3,7 3!7단까지 출력하시오
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("시작 단을 입력하세요.");
//		int n = scan.nextInt();
//		System.out.println("끝 단을 입력하세요.");
//		int n2 = scan.nextInt();
//		int temp = 0;
//		if (n2<n) {
//			temp = n;
//			n = n2;
//			n2 = temp;
//			System.out.printf("%d %d",num1,num2);
//		}
//		
//		
//		for(int i=n; i<=n2; i++ ) {
//			System.out.printf("[ %d 단 ] \n", i);
//			for (int j=1; j<=9; j++) {
//				System.out.printf("%d X %d = %d \n",i,j,i*j);
//			}
//		}
//		
//		System.out.println();
		
//		for(int i=0;i<=0;i++) {
//			for(int j=0;j<=0;j++) {
//				for(int k=0;k<=0;k++) {
//					System.out.println(""+i+j+k);
//					System.out.printf("%d%d%d\n",i,j,k);
//				}
//			}
//		}
//		
		// 구구단을 출력
//		for(int i=2;i<=9;i++) {
//			System.out.printf(" [ %d 단 ]\t",i);
//		}
//		System.out.println();

//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				System.out.printf("%d X %d = %d \t", j,i,j*i);
//			}
//			System.out.println();
//		}

//		for (int i=1; i<=5; i++) {
//			for (int j=5; j<=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		System.out.printf("[%5d]\n",5);
		System.out.printf("[%05d]\n",5);
		
		for(int i=1;i<=100;i++) {
			System.out.printf("%03d\n",i);
		}
		
		int a = 88;
		System.out.println("0"+a); //099
		String str = String.format("%03d", a);
		System.out.println(str);
	}

}
