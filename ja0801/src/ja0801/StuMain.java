package ja0801;

import java.util.ArrayList;
import java.util.Scanner;

import ja0801.StuDeck;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck stuDeck = new StuDeck();
		ArrayList<Stuscore> list = new ArrayList<Stuscore>();
//		Stuscore[] s = new Stuscore[10];
		
		while(true) {
			//상단메뉴 출력메소드
			int choice = stuDeck.menu_print();
			switch(choice) {
			case 1: 
				// 학생성적입력 메소드
				stuDeck.stu_input(list);
				break;
			case 2:
				// 학생성적출력 메소드
				stuDeck.stu_output(list);
				break;
			case 3:
				
				break;
			case 4:
				System.out.println();
				System.out.println("[ 학생성적 삭제 ]");
				System.out.println("삭제할 이름을 입력하세요.");
				String name = scan.next();
				int temp = 0;
				for(int i=0; i<list.size(); i++) {
					 if(list.get(i).getName().contains(name)) {
						 System.out.println("학생검색이  되었습니다!");
						 System.out.printf("[ %s 학생삭제 ] \n",list.get(i).getName());
						 System.out.println("1. 삭제");
						 System.out.println("2. 취소");
						 choice = scan.nextInt();
						 switch(choice) {
						 case 1:
							 System.out.printf("%s 학생을 삭제했습니다.\n",name);
							 list.remove(i);
							 break;
						 case 2:
							 System.out.println("삭제가 취소되었습니다!");
							 break;
						 }
					 }
				}
				if(temp==0) {
					System.out.println("            [ 학생 검색 ]     ");
					System.out.println("찾고자 하는 학생이 업습니다. 다시 입렬하세요!");
				}
				
			
				
			}//switch
		}//while
		

	}//main

}