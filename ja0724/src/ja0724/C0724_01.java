package ja0724;

import java.util.Scanner;

public class C0724_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// 배열선언 1
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		
//		for(int i=0; i<5; i++) {
//			arr[i] = i+1;
//		}
//		int[] arr2 = {1,2,3,4,5};
//		int[] arr3 = new int[] {1,2,3,4,5};

		// --------------------------------------------------------------------------------------------
		// 이름 5개를 받아 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> ",i);
			name[i] = scan.next();
			System.out.printf("%d번째 국어 점수를 입력하세요.>> ",i);
			kor[i] = scan.nextInt();
			System.out.printf("%d번째 영어 점수를 입력하세요.>> ",i);
			eng[i] = scan.nextInt();
			System.out.printf("%d번째 수학 점수를 입력하세요.>> ",i);
			math[i] = scan.nextInt();
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i]/3.0;
			
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("--------------------------------------------");
		for(int i=0; i<name.length;i ++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t \n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}
	}

}
