package ja0724;

public class C0724_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1차원 배열 -> 1-25까지 순차번호 입력
		// 랜덤으로 번호 섞기
		// 2차원 배열 -> [5][5] 랜덤 번호를 입력해서 출력하시오.
		
		int[] arr = new int[25];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			int rnum = (int)(Math.random()*25);
			
			temp = arr[i];
			arr[i] = arr[rnum];
			arr[rnum] = temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		int[][] arr2 = new int[5][5];

//		int[] arr = new int[25];

		

	}

}
