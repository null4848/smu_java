package ja0723;

import java.util.Scanner;

public class C0723_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		// while
//		int sum = 0;
//		int i = 1;
//		for(i=1; i<=10; i++) {
//			sum+=i;
//		}
//		System.out.println("합계 : "+sum);
//
//		System.out.println("------------------");
//		
//		sum = 0;
//		i = 1;
//		while(1<=10) {
//			sum+=i;
//			i++;
//		}
//		
//		System.out.println("합계 : "+sum);
		
		// while
		// 1~100 까지의 합을 구하시오.
		// 500을 넘는 시점의 i,sum합을 구하시ㅗㅇ.
//		
//		int sum = 0;
//		int i = 1;
//		
//		for(i=1;i<=100;i++) {
//			sum += i;
//			while(sum>=500) {
//				System.out.printf("i : %d sum : %d", i, sum );
//				break;
//			}
//		}
		
		// while
//		구구단 2-9단까지 출력하시오.
		
//		int i = 2;
//		int j = 1;
//		while (i<=9) {
//			while(j<=9) {
//				
//				System.out.printf("%d X %d = %d \n", i, j, i*j);
//				i++;
//			}
//		j++;
//		}

		
		//10 번을 입력받아
//		입력 : 5 정다 ㅂ오답
//		정답 : 값
		
//		int rnum = (int)(Math.random()*100)+1;
		
	
//		int i = 1;
//		
//		while(i<=10) {
//			System.out.println("1번째 숫자 입력 >> ");
//			int num = scan.nextInt();
//			
//			if(num==rnum) {
//				System.out.println("정답");
//			} else if(num>rnum) {
//				System.out.printf("입력 : %d 오답 - 입력된 숫자가 큽니다. \n",num);
//			} else {
//				System.out.printf("입력 : %d 오답 - 입력된 숫자가 작습니다. \n",num);
//			}
//			i++;
//			
//		}
//		
//		System.out.println("정답  : "+rnum);
//		
		
		int i = 0;
		
		System.out.println("출력 숫자를 입력해주세요.");
		int choice = scan.nextInt();
		
		System.out.println("1) 짝수 2) 홀수 3) 모두");
		int set = scan.nextInt();
		
		// 입력된 숫자에서 멈춤하는 프로그램을 ㄹ구현하시오.

		
//		while(true) {
//			System.out.println(i);
//			if(choice == i) 
//				break;
//			i++;
//		}
		
		while(true) {
			if(set == 1) {
				if(i % 2 == 0) {
					System.out.println(i);
					}
				} 
			else if ( set == 2) {
				if(i % 2 == 1) {
					System.out.println(i);
					}
				}
			else {
				System.out.println(i);
				}
			
			if(choice == i) 
				break;
			i++;
		}

		
		
	}

}
