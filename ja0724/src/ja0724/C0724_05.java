package ja0724;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C0724_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		Integer[] input2 = {10,20,3,9,5};
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 입력 : \n",i+1);
			input[i] = scan.nextInt();
		}
		Arrays.sort(input);
		Arrays.sort(input2, Collections.reverseOrder()); // 기본 타입은 정렬이 안됨, 객체만 됨
		System.out.println("입력번호 : "+Arrays.toString(input));

	}

}
