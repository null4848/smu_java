package ja0728;

import java.util.Arrays;
import java.util.Scanner;

public class C0728_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 숫자 막주기 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		Process p = new Process();
		
		System.out.println(" [ 프로그램 ]");
		System.out.println("1. 숫자맞추기");
		System.out.println("2. 로또맞추기");
		System.out.println("3. 구구단");
		System.out.println("4. 결과리턴");
		System.out.println("--------------------------------------");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1: // ㅜㅅ자 맞추기 프로그램ㅇ 구현하시오.
			//1 0-1-- Rkwl 1-번입력받아 10 이수 범인출력
		
			 p.numProcess();
			 break;
			 
		case 2:
			int[] myNo = new int[6];
			int[] lotto = new int[6];
			int[] okNo = new int[6];
			int count = 0;
			
			//Process.java에 메소드를 구현해서 입력번호, 로도번호, 맞춘번호 를 출력하시오.
			// 매개 변수 전달 - myNo, lotto, okNo, count
		
			p.lottoProcess(count, myNo, lotto, okNo);
			
			
			break;
			
		case 3:
			//구구단
			
			p.gugudan();
			break;
	
		case 4:
			double[] result = {0,0,0,0};
			int a = 10;
			int b = 5;
			p.resultProcess(a, b, result);
			System.out.println(Arrays.toString(result));
			
			
					
			
		}

	}

}
