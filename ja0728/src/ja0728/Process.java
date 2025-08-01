package ja0728;

import java.util.Scanner;

public class Process {
	
	Scanner scan = new Scanner(System.in);


		
	void numProcess() {
		
		int[] input = new int[10];
		int answer = (int)(Math.random()*100)+1;
		int i = 0;
		
		while(1<10) {
			System.out.println("[숫자 맞추기]");
			System.out.println("------------------------------");
			System.out.println("1-100까지 숫자를 입력하세요.");
			input[i] = scan.nextInt();
					
				if(answer>input[i]) {
					System.out.println("입력한 값이 작습니다. 더 큰수를 입력하세요.");
				} else if(answer<input[i]) {
					System.out.println("입력한 값이 큽니다. 더 작은수를 입력하세요.");
				} else {
					System.out.println("정답입니다.");
					break;
	
				}
				i++;

		}
	}//numProcess
	
	void gugudan() {
		
		System.out.println("2단에서부터 원하는 단을 입력하세요.");
		int number = scan.nextInt();

		System.out.println(" [ 구구단 ]");
		System.out.println("------------------------------------------");
		
		for(int i=2; i<=number; i++) {
			System.out.printf("[ %d 단 ] \n",i);
			for(int j=1;j<=9; j++) {
				System.out.printf("%d X %d = %d \n", i, j, i*j);
			}
			System.out.println();
		}

	}
	
	void resultProcess(int a, int b, double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	
	void lottoProcess(int count, int[] myNo, int[] lotto, int[] okNo) {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45);
		}
		
		for(int i=0; i<myNo.length; i++) {
			System.out.println("로또 번호를 입력해주세요. (0~45). >> ");
			myNo[i] = scan.nextInt();
		}
		
		for(int i=0; i<okNo.length; i++) {
			for(int j=0; j<myNo.length; j++) {
				if(lotto[i]==myNo[j]) {
					okNo[i]=myNo[j];
				}
			}
		}
		
		System.out.print("입력 번호 : ");
		for(int i=0; i<myNo.length; i++) {
			System.out.printf("%d ",myNo[i]);
		}
		System.out.println();
		
		
		System.out.print("로또 번호 : ");
		for(int i=0; i<lotto.length; i++) {
			System.out.printf("%d ",lotto[i]);
		}
		System.out.println();
		
		System.out.print("정답 번호 : ");
		for(int i=0; i<okNo.length; i++) {
			System.out.printf("%d ",okNo[i]);
		}
		System.out.println();
		
	}
	
	
}
