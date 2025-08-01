package ja0801;

import java.util.ArrayList;

public class C0801_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

//		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			list.remove(i);
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//		Student s = new Student(1,"홍길동",100,100,100);
//		ArrayList<Student> list2 = new ArrayList<Student>();
//		
//		ArrayList<Person> list = new ArrayList<Person>();
//		Person p1 = new Person(10000,"홍길자");
//		list.add(p1);
//		list.add(new Person(10001,"홍길동"));
//		list.add(new Person(10002,"유관순"));
//		list.add(new Person(10003,"강감찬"));
//		list.add(new Person(10004,"김구"));
////		list.add(s);
//		list.add(new Person(10005,"홍길동"));
//		list.add(new Person(10006,"유관순"));
//		list.add(new Person(10007,"이순신"));
//		
//		// id 전체 출력하시오.
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(((Person)list.get(i)).id + "," +
//							((Person)list.get(i)).name   );
//		}
//		
//		System.out.println("--------------------------");
//
//
//		// id : 10006번을 삭제후 전체출력하시오.
//		for(int i=0; i<list.size(); i++) {
//			if( ((Person)list.get(i)).id == 10006) {
//				list.remove(i); // 삭제
//				break;
//			}
//		}
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(((Person)list.get(i)).id + "," +
//				((Person)list.get(i)).name   );
//		}
//		
//		
		
//		Wrapper 클래스 - 8가지 기본타입의 객체타입을 말함.
//		자바 - 객체 지향언어
//		boolean char byte short int long float double 객체가 아님
//		ArrayList list = new ArrayList(); // 객체 타입만 가능
//		int a = 10;
//		list.add(a);
//		System.out.println(list.get(0));
		
//		String str = "16조12345";
////		System.out.println(str.substring(3,6));
////		System.out.println(str.substring(0,2));
////		System.out.println(str.substring(3));
////		System.out.println(str.substring(3,7));
//		
//		String[] strArr = {"abc123","a12","bc23456"};
//		for(int i=0; i<strArr.length; i++) {
//			System.out.println(strArr[i].substring(0,strArr[i].length()-1));
//		}
		
		
		// 조를 출력하시오.
//		System.out.println(str.charAt(2));
		
		// startswitj/endsWith
//		String str = "abc.txt";
//		System.out.println(str.endsWith("txt"));

	}

}
