package String;

import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String s = "abdacd";
		removeDuplicateString(s);
	}

	private static void removeDuplicateString(String s) {
		
		char[] myArray = s.toCharArray();

	      for(int i=0; i<myArray.length-1; i++){
	         for (int j=i+1; j<myArray.length; j++){
	            if(myArray[i] == myArray[j]){
	               //myArray = ArrayUtils.remove(myArray, j);
	            }
	         }
	      }
	      System.out.println("String value after deleting the duplicate values :"+Arrays.toString(myArray));

		
	}
}
