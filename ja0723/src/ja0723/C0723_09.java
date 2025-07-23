package ja0723;

import java.util.Scanner;

public class C0723_09 {

    public static void main(String[] args) {
//        int[] score = {10, 20, 5, 1, 2};
//
//        for (int i = 0; i < score.length; i++) {
//            System.out.println(score[i]);
//        }
    	
    	// 1-100까지의 랜덤 숫자를 생성해서
    	// 5번을 입력해서 정답, 오답-입력숫자가 큽니다. 오답-입력수자가 작습니다.
    	// 입력된 숫자 : 1,2,3,4,5
    	// 정답 : 50
    	
    	int[] choice = new int[20];
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int rnum = (int)(Math.random()*100)+1;
    	
    	int i = 0;
    	int count = 0;
    	
    	for(i=0;i<choice.length;i++) {
    		System.out.println("숫자를 입력해주세요.>> ");
    		choice[i] = scan.nextInt();
    		
    		
    		if(choice[i] == rnum) {
    			System.out.println("정답");
    			count = i;
    			break;
    		} else if(choice[i]>rnum) {
    			System.out.println("오답-입력숫자가 큽니다.");
    		} else {
    			System.out.println("오답-입력숫자가 작습니다.");
    		}
    		    		
    	}
    	
    	System.out.print("입력된 숫자 : ");
    	for(i=0;i<count; i++) {
    		System.out.print(choice[i]+" ");
    	}
    	System.out.println();
    	System.out.println("정답 : "+rnum);
    	
    	
    	
    	
    }

}
