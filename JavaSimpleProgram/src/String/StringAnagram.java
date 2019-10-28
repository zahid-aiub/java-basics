package String;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String s1 = "apni";
		String s2 = "pain";
		checkAnagram(s1, s2);
	}

	private static void checkAnagram(String s1, String s2) {
		
		/*
		 * String st= s1.replaceAll("\\s", ""); 
		 * System.out.println(st);
		 */
		
		boolean ststus;
		if (s1.length() != s2.length()) {
			ststus = false;
		}
		else{
			char [] s1Array = s1.toLowerCase().toCharArray();
			char [] s2Array = s2.toLowerCase().toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			System.out.println(Arrays.toString(s1Array));
			System.out.println(Arrays.toString(s1Array));
			
			ststus = Arrays.equals(s1Array, s2Array);
			
		}
		
		if (ststus) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
		
	}
	
}
