package leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	
	public static void main(String[] args) {
		
		String s = "ababcede";
		int res = lengthOfLongestSubstring(s);
		System.out.println(res);
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                //System.out.println(j+" "+s.charAt(j));
                ans = Math.max(ans, j - i); 
            }
            else {
            	System.out.println(i + "-----"+s.charAt(i++));
                set.remove(s.charAt(i++)); 
            }
        }
        return ans;
    }
}
