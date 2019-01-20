/*
 How to count number of unique strings in HashMap?
 */
package countuniquestrings;

import java.util.HashMap;


public class CountUniqueStrings {
   
    public static void main(String[] args) {
        count("A");
        count("B");
        System.out.println(count("B"));
    }
    
    static HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
    static int count = 0;
    
    public static int count(String myString){
        if(hashmap.get(myString) == null){
            hashmap.put(myString, 1);
            count = 1;
        }
        else{
            count = hashmap.get(myString);
            count++;
            hashmap.put(myString, count);
        }
        return hashmap.get(myString);
    }
}
