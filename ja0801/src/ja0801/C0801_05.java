package ja0801;

import java.util.Arrays;

public class C0801_05 {

	public static void main(String[] args) {
		
		String[] strArr = {"a.txt", "b.hwp","c.xls","d.txt","e.png","f.jpg"};
		
		int count = 0;
//		for(int i =0; i<strArr.length; i++) {
//			if(strArr[i].endsWith("txt")) {
//				count += 1;
//			}
//		}
		for(int i =0; i<strArr.length; i++) {
			if(strArr[i].endsWith("jpg")) {
				count += 1;
			}
		}
		System.out.println(count);
		
		
		
		
		//  split = 분리자를 통해 배ㅇ열로 리턴
//		String str = "홍길동, 유관순, 이순신, 강감찬, 김구";
//		String[] name = str.split(",");
//		System.out.println(Arrays.toString(name));
//		
//		String str2 = "1,홍길동,100,100,100,300,100.0";
//		// split 으로 분리한 다음 student 객체로 선언을 해보세요.
////		String -> int 타입, Str타입, int 타입 ... double 타입으로 변경해서
////		객체 선언 해서 진행함.
//		
//		String[] stu = str2.split(",");
//		
//		int StuNo = Integer.parseInt(stu[0]);
//		int Kor = Integer.parseInt(stu[2]);
//		int Eng = Integer.parseInt(stu[3]);
//		int Math = Integer.parseInt(stu[4]);
//		double avg = Double.parseDouble(stu[6]);
//		
//		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
//		
//		for(int i=0; i<title.length; i++) {
//			System.out.printf("%s \t",title[i]);
//		}
//		System.out.println();
//		
//		for(int i=0; i<stu.length; i++) {
//			System.out.println(stu[i]); 
//		}
	
		
		
//		String str = "    ab       c    ";
//		System.out.println(str);
//	
//		trim - 빈공백제거, 안에 있는 공백은 제거 안됨.
//		System.out.println(str.trim());
//		
//		//replace - 대체
//		System.out.println(str.replace("ab", "x"));
//		
//		//replace - " "을 ""대체, 전체공백제거 하는 형태
//		System.out.println(str.replace(" ", ""));
		//		System.out.println(str);
		
//		String str = "abcabcaaabbbbbbbchijkcaacaaaaaa";
		
		// c가 몇개있는지 출력하시오. indexOf("c",0);
		
		
//		while(true) {
//			int n = str.indexOf("c",n);
//			if(n == -1) {
//				
//			} else {
//				
//			}
//		}
		
		
		
	}

}
