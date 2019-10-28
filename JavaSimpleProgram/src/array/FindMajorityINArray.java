package array;

public class FindMajorityINArray {
	
	public static void main(String[] args) {
		
		int [] arr = {2,4,5,3,2,5,2,3,2,2};
		int n = arr.length;
		findMajorityElement(arr,n);
	}

	private static void findMajorityElement(int[] arr, int n) {
		
		int maxCount = 0;  
	    int index = -1; // sentinels 
	    for(int i = 0; i < n; i++) 
	    { 
	        int count = 0; 
	        for(int j = 0; j < n; j++) 
	        { 
	            if(arr[i] == arr[j]) 
	            count++; 
	        } 
	         
	        if(count > maxCount) 
	        { 
	            maxCount = count; 
	            index = i; 
	        } 
	    } 
	    
	    if (maxCount >= n/2) 
	       System.out.println(arr[index]);
	      
	    else
	        System.out.println("No Majority Element"); 
	}
	
}
