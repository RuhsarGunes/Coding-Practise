 /*
How many step combinations to climb n number of steps?
*/
package climbstairs;
/*
Base Case:
If n(# of stairs) <= 2 return n;
If there is only 1 stair, there is only 1 way up that stair.
If there are 2 steps, there are 2 ways tp reach the top stair case. 1 step at a time or 2 steps at at time.

Formula: 
If (n > 2) the sum of previoys 2 steps.
Steps (n-1) + Steps (n-2)
N:3; (3-1) + (3-2) = 3 ways
*/

public class ClimbStairs {
   
    public static void main(String[] args) {
       System.out.println(climbStairsNonRecursive(10000));
    }
    
    public static int climbStairs(int n){
        //Time complexity is exponential; O(2^n)
        if (n <= 2)
            return n;
        else
            return climbStairs(n-1) + climbStairs(n-2);
    }
    
    public static int climbStairsNonRecursive(int n){
        //Time complexity is O(n).
        if (n <= 2)
            return n;
        
        int firstStep = 1;
        int secondStep = 2;
        int nth = 2;
        
        for (int i = 3; i <= n; i++){
            nth = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = nth;
        }
        return nth;
    }
}
