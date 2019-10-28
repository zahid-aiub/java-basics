package array;

public class FindMaxElement {

	public static void main(String[] args) {
		
		int [] arr = {2,5,1,8,4};
		findMaximum(arr);
	}

	private static void findMaximum(int [] arr) {
		
		int max=0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i+1]) {
				max = arr[i];
			}
			else {
				max = arr[i+1];
			}
		}
		
		System.out.println(max);
		
	}
}
