package ja0723;

import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		// 이름 5명을 입력받아
		
		Scanner scan = new Scanner(System.in);
		
//		for (int i =0; i<name.length; i++) {
//			System.out.println("이름을 입력하세요.>> ");
//			name[i] = scan.nextLine();
//
//		}
//		
//		for (int i =0; i<kor.length; i++) {
//			System.out.println("국어 점수를 입력하세요.>> ");
//			kor[i] = scan.nextInt();
//		}
//		
//		for (int i =0; i<eng.length; i++) {
//			System.out.println("영어 점수를 입력하세요.>> ");
//			eng[i] = scan.nextInt();
//		}
//		
//		for (int i =0; i<math.length; i++) {
//			System.out.println("수학 점수를 입력하세요.>> ");
//			math[i] = scan.nextInt();
//		}
		
		for (int i =0; i<name.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.>> ", i+1);
			name[i] = scan.nextLine();
			
			System.out.printf("%d번째 국어 점수를 입력하세요.>> ", i+1);
			kor[i] = scan.nextInt();
			
			System.out.printf("%d번째 영어 점수를 입력하세요.>> ", i+1);
			eng[i] = scan.nextInt();
			
			System.out.printf("%d번째 수학 점수를 입력하세요.>> ", i+1);
			math[i] = scan.nextInt();
		}
		
		System.out.print("입력 이름 : ");
		for (int i =0; i<name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		
		System.out.print("국어 점수 : ");
		for (int i =0; i<kor.length; i++) {
			System.out.print(kor[i] + " ");
		}
		System.out.println();
		
		System.out.print("영어 점수 : ");
		for (int i =0; i<eng.length; i++) {
			System.out.print(eng[i] + " ");
		}
		System.out.println();
		
		System.out.print("수학 점수 : ");
		for (int i =0; i<math.length; i++) {
			System.out.print(math[i] + " ");
		}
		

	}

}
