package ja0721;

public class C0721_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("[%5d] \n", 12);
		System.out.printf("[%05d \n", 12);
		
		int a = 5;
//		a++;
//		++a;
		
//		System.out.println("a : "+(++a)); // 6
		System.out.println("a : "+(a++)); // 5
		System.out.println("------");
		System.out.println(a);
	}
}
