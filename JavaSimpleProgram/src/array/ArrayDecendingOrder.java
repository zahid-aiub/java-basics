package array;

public class ArrayDecendingOrder {
	
	public static void main(String[] args) {
		
		int [] arr = {2,5,8,3,4};
		arrayDecending(arr);
	}

	private static void arrayDecending(int[] arr) {
		
		int temp;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] < arr[j]) { // decendign for <; and > for assending
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	

}
