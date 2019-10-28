package array;

import java.util.Arrays;

public class MaximumSumOfArray {
	
	public static void main(String[] args) {
		
		int [] arrA = {2,5,8,4,1};
		maxSumOfArray(arrA);
	}
	
	public static void maxSumOfArray(int arr[]) {
		
		int n = arr.length;
		System.out.println(n);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int maxSum = arr[n-1] + arr[n-2];
		
		System.out.println(maxSum);
		
		
	}

}
