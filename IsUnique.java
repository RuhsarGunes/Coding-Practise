/*Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 */
package ısunique;

/*the string is an ASCII string or a Unicode string? Let's assume, it is ASCII string.*/

public class IsUnique {

    public static void main(String[] args) {
        
       System.out.println(isUniqueChars("ARDA"));
        
    }
    
    public static boolean isUniqueChars(String str){ //time Complexity is O(n), space complexity is O(1)
        if(str.length() > 128) //Assuming ASCII string
            return false;
        
        boolean char_set[]  = new boolean [128]; 
        for (int i = 0, n = str.length(); i < n; i++){
            int val = str.charAt(i);
            if (char_set[val]) {//Already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    } 
}
