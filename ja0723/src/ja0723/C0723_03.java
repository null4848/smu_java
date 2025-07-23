package ja0723;

import java.util.Scanner;

public class C0723_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		double ran = (int)(Math.random()*10); // 0~9
		double rnum = (int)(Math.random()*10)+1; // 1~10
		System.out.println("[ 랜덤숫자 맞추기 ]");
		System.out.println("[ 1-10까지의 숫자를 입력하세요.>> ]");
		int input = scan.nextInt();
		
		// if 문 사용 : 정답, 오답 - 입력 숫자가 더 큽니다., 오답 - 입력 숫자가 더 잓브니다.
		
		if (input == rnum) {
			System.out.println("정답");
		} else if(input>=rnum) {
			System.out.println("오답 - 입력 숫자가 더 큽니다.");
		} else {
			System.out.println("오답 - 입력 숫자가 더 작습니다.");
		}
		
		System.out.println(rnum);

	}

}
