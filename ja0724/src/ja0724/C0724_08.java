package ja0724;

public class C0724_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//얕은 복사 - arr, arr2가 같은
		int[] arr = {1,3,5,7,9};
		int[] arr2 = arr;
		 
		
		for(int i=0;i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.arraycopy(arr, 0, arr2, 0, 5); //5개 복사
		System.arraycopy(arr, 0, arr2, 0, 3); //3개 복사
		System.arraycopy(arr, 0, arr2, 2, 3); //3개 복사
		System.arraycopy(arr, 1, arr2, 2, 3); //3개 복사

	}

}
