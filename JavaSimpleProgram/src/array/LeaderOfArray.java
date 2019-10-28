package array;

public class LeaderOfArray {
	
	public static void main(String[] args) {    // --> not correct
		
		int [] arr = {16,17,8,5,7,2};
		findLeader(arr);
	}

	private static void findLeader(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
			break;
		}
	}

}
