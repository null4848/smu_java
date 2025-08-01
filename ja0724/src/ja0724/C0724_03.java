package ja0724;

public class C0724_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또 번호 맞추기
//		int lotto = (int)(Math.random()*3)+1;
		
		// 1-45까지 ㅐ배열 생성
		int[] num = new int[45];
		
		//번호 입력
		for(int i=0; i<45; i++) {
			num[i] = i+1;
		}
		
		//번호 섞기
		int rnum = 0;
		int temp = 0;
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 번호 출력
		System.out.print("로또 번호 : ");
		for(int i = 0; i<6; i++) {
			System.out.print(num[i]+" ");
		}
	
	}

}
