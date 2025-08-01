package ja0724;

import java.util.Scanner;

public class C0724_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.변수배열선언 - 번호,이름,점수,합계,평균,타이틀,count
		// 2.출력구문 - while(true), switch구문
		// 3.입력부분
		// 4.취소부분추가
		// 5.출력부분
		// 6.프로그램종료부분
		
		Scanner scan = new Scanner(System.in);
		
		// 변수 배열 선언
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int count = 0;
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.(0.종료)>> ");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("  [ 학생성적입력 ]  ");
				System.out.println("--------------------");
				
				no[count] = count+1;
				
				System.out.printf("%d번 학생 이름을 입력하세요. (0.취소) ",count+1);
				name[count] = scan.next();
				
				if(name[count].equals("0")) {
					System.out.println("이전 화면으로 이동합니다.");
					System.out.println();
					break;
				}
				
				for(int i=0; i<score.length; i++) {
					System.out.printf("%s 점수를 입력하세요.",title[i+2]);
					score[count][i] = scan.nextInt();
				}
				
				
				break;
				
			case 2:
				System.out.println("  [ 학생성적출력 ]  ");
				break;
				
			case 3:
				System.out.println("  [ 학생성적수정 ]  ");
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;
			}
			
			
		}
			
		
		
		
		
		
	}

}
