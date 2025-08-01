package ja0724;

import java.util.Arrays;
import java.util.Scanner;

public class C0724_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 - 45까지 숫자 6개를 입력받고
		// 로또 번호 6개를 생성해서 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		int[] lotto = new int[6];
		int[] num = new int[45];
		
		int rnum = 0;
		int temp = 0;
		
		for(int i=0; i<6; i++) {
			System.out.printf("%d번째 로또 번호를 입력해주세요. \n", i+1);
			input[i] = scan.nextInt();
		}
		
		for(int i=0; i<45; i++) {
			num[i] = i+1;
		}
		
		for(int i=0; i<6; i++) {
			rnum =(int)(Math.random()*45);
			
			lotto[i] = num[rnum];
			
		}
		
		System.out.print("입력 번호 : ");
		System.out.println(Arrays.toString(input));
		System.out.print("로또 번호 : ");
		System.out.println(Arrays.toString(lotto));
		

	}

}
