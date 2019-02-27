/*In a given integer array nums, there is always exactly one largest element.
Find whether the largest element in the array is at least twice as much as every other number in the array.
If it is, return the index of the largest element, otherwise return -1.

Example 1:
Input: nums = [3, 6, 1, 0]
Output: 1
Explanation: 6 is the largest integer, and for every other number in the array x,
6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.*/

package dominantindex;

public class DominantIndex {
    
    public static int dominantIndex(int[] nums){
        int max = 0;
        int secondMax = 0;
        int index = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                int temp = max;
                max = nums[i];
                secondMax = temp;
                index = i;
            }else if(nums[i] > secondMax){
                secondMax = nums[i];
            } 
        }
        if(max >= 2*secondMax)
            return index;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        
        int output = dominantIndex(nums);
        System.out.println(output);
        
    }
    
}
