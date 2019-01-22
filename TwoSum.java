/*
 Given an array of integers, find two numbers such that they add up to a specific target
number.
 */
package twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
       
        int[] arr = {1,3,5,10,9};
        int target = 8;
        
        int[] result = twoSumWithHashTable(arr, target);
        
        for (int i = 0; i < result.length; i++)
                System.out.print(" " + result[i]);
    }
    
    // O(n^2)runtime, O(1) space - Brute force
    public static int[] twoSum(int[] array, int target){
        
        for(int i = 0, n = array.length; i < n; i++){
           for(int j = i + 1, k = array.length; j < k; j++){
               if(array[i] + array[j] == target){          
                   return new int [] {i, j};
               }
           }
       }
       throw new IllegalArgumentException("No two sum solution");
    }
    
    // O(n) runtime, O(n) space - Hash Table 
    public static int[] twoSumWithHashTable(int[] array, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (map.containsKey(target - number)) {
                return new int[] { (target - number), number };
            }
            map.put(number, i);
        }
       throw new IllegalArgumentException("No two sum solution");
    }
    
}
