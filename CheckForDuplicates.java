/*
Write a function that finds duplicate values in an array!
*/
package checkforduplicates;

import java.util.HashSet;
import java.util.Set;


public class CheckForDuplicates {

    public static void main(String[] args) {
       int myArray [] ={1,2,3,3,4,5};
       checkForDuplicatesWithSet(myArray);
    }
    // exp: [1,2,3,3,4,5]
    public static void checkForDuplicates(int myArray[]){
        //time complexity is O(n^2) and is not ideal
        for(int i=0; i < myArray.length; i++){
            for(int j = i+1; j < myArray.length; j++){
                if(myArray[i] == myArray[j]){
                    System.out.println("a duplicate exist");
                }
            }
        }
    }
    
    public static void checkForDuplicatesWithSet(int myArray[]){
        
        //Time Complexity is O(n)
        Set<Integer> mySet= new HashSet<Integer>();
        for(Integer x : myArray){
            if(mySet.add(x) == false){
                System.out.println("a duplicate exist -> " + x);
            }
        }
    }
}
