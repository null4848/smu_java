package ja0721;

public class C0721_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		System.out.println("b : "+b);
		b = (byte) (b + (byte)1); // 127 + 10 = 137
		// byte `128~127 : 137 슷자는 넣을 수 없음
		System.out.println("b : "+b);
		
		int a = 214;

	}

}
