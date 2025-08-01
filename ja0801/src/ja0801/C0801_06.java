package ja0801;

import java.util.ArrayList;

public class C0801_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList list = new ArrayList();
//		List list2 = new ArrayList();
		
	
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(5);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------------");
		// clear(모두 삭제)
		list.clear();
		
		for(int i=0;i<list.size();i++) {
			// 읽기 - get
			System.out.println(list.get(i));
		}


	}

}
