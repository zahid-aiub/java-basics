package String;

import java.util.HashSet; 
  
class PrintFirstOccurence 
{ 
    
    static char firstRepeating(char str[]) 
    { 
        HashSet<Character> h = new HashSet<>();  
        for (int i=0; i<=str.length-1; i++) 
        { 
            char c = str[i]; 
  
            if (h.contains(c)) 
                return c; 
  
            else 
                h.add(c); 
        } 
  
        return '\0'; 
    } 
  
    public static void main (String[] args) 
    { 
        String str = "geeksforgeekss"; 
        char[] arr = str.toCharArray(); 
        System.out.println(firstRepeating(arr)); 
    } 
}