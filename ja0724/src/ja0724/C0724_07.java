package ja0724;

import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		이름 국어 영어 수학 점수를 ㅇ입력 받아 출력하시오
//		변수 배열 선언 - name score total avg
//		값입력 - 이름
//		socre 값 입력 - 국어 영어 수학
//		total avg 값 입력
//		출력
		
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];		
		String[] title = {"국어","영어","수학"};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> \n",i+1);
			name[i] = scan.next();
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%d번째 %s점수를 입력하세요.>> \n",i+1,title[j]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
				
			}
			avg[i] = total[i]/3.0;
		}
				
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.printf(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf(score[i][j] + "\t");
			}
			System.out.printf(total[i] + "\t" + avg[i] + "\t");
			System.out.println();
		}

	}

}
