package ja0729;

public class RanNum {
	static int[] arr = new int[10];
	int a;
	
	// 생성자보다 먼저 실행
	// 클래스 초기화 블럭 - 객체선언 없이 바로 실행.

	
	static {
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}

	}

}
