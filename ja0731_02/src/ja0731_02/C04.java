package ja0731_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f = new File("c:/down/a,txt");
		
		try {
			FileInputStream fis = new FileInputStream("c:/down/a,txt");
			int read = 0;
			try {
				while( (read = fis.read() ) != -1) {
					System.out.println((char)read);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램이 잘 종료되었습니다.");
		
//		int[] arr = {1,2,3};
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(arr[10]);
//			System.out.println(4);
//			System.out.println(0/0);
//			System.out.println(4.5);
////			throw new Exception("고의로 에러발생");			
//		} catch(ArithmeticExeption e2) {
//			System.out.println("0으로 나웠을 때 에러 처리 코드 실행");
//		}
//		
//		System.out.println(7);
//
	}

}
