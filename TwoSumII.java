/*
 Given an array of integers, find two numbers such that they add up to specific
target number. Input array is sorted in ascending order. 
 */
package twosumıı;

/**
 *
 * @author Gunes
 */
public class TwoSumII {

    public static void main(String[] args) {
        
        int[] arr = {2,7,10,11,12};
        int target = 9;
        
        int[] result = twoSumWithTwoPointers(arr, target);
        
        for (int i = 0; i < result.length; i++)
                System.out.print(" " + result[i]);
    }
    
    //Binary search: O(nlogn) runtime, O(1) space
    public static int[] twoSumWithBS(int[] array, int target){
        //assuming input array is sorted.
        for(int i = 0, n = array.length; i < n; i++){
            int j = binarySearch(array, i+1, target-array[i]);
            if(j != -1)
                return new int[] { i+1, j+1 };                
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static int binarySearch(int[] array, int startPoint, int target){
        int endPoint = array.length -1;
       
        while (startPoint < endPoint){
             int midPoint = startPoint + (endPoint - startPoint)/2;
             if (array[midPoint] < target)
                 startPoint = midPoint + 1;
             else 
                endPoint = midPoint;
        }
        if(startPoint == endPoint && array[startPoint] == target)
            return startPoint;
        else 
            return -1;
    }
    //TwoPointers Technique: O(n) runtime, O(1) space
    public static int[] twoSumWithTwoPointers(int[] array, int target){
        //assuming input array is sorted.
        int i = 0; 
        int j = array.length - 1;
        
        while (i < j){
            int sum = array[i] + array[j];
            if(sum == target)
                return new int[] { i+1, j+1 };
            else if (sum < target)
                i++;
            else
                j--;
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
