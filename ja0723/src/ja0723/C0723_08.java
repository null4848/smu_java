package ja0723;

import java.util.Scanner;

public class C0723_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int score=0, score2=0, score3=0,score4=0,score5=0;
//		System.out.println(score);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
//		
//		int[] s = new int[100];
//		for(int i=0;i<100;i++) {
//			System.out.println(s[i]);
//		}
		
		// 배열 100개를 만들고, 1-100까지 숫자를 입력해서 출력하시오.
//		int[] n = new int[100];
//		for(int i=0;i<100;i++) {
//			n[i]=i+1;
//			System.out.println(n[i]);
//		}
		
		// 5개의 숫자를 입력받아 배열에 넣어서 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		int[] n = new int[5];
		
		System.out.println("숫자를 입력하세요.>> ");
		n[0] = scan.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		n[1] = scan.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		n[2] = scan.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		n[3] = scan.nextInt();
		System.out.println("숫자를 입력하세요.>> ");
		n[4] = scan.nextInt();
		
		for(int i=0; i<5; i++) {
			System.out.printf("%d번째 숫자를 입력하세요.>> \n", i+1);
			n[i]=scan.nextInt();
		}
		

	}

}
