/*Implement function ToLowerCase() that has a string parameter str,
and returns the same string in lowercase.
Example 1:

Input: "Hello"
Output: "hello"
*/
package tolowercase;

public class ToLowerCase {

    public static String toLowerCase(String str){
        StringBuilder cArr = new StringBuilder();
        
        for(char c : str.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                c += 'a' - 'A';
            }
            cArr.append(c);
        }
        return cArr.toString();
    }
    
    public static void main(String[] args) {
        String input = "HELLO";
        
        String output = toLowerCase(input);
        System.out.println(output);
    }
    
}
