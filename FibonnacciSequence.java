/*
Write a function to find the nth number in a fibonnacci sequence!
*/
package fibonnaccisequence;

public class FibonnacciSequence {

    public static void main(String[] args) {
        System.out.println(fibNonRecursive(10000));
    }
    
    public static int fib(int n){
        
        if(n < 1){ //checking for numbers below 1 
            throw new IllegalArgumentException("numbers below 1 not allowed");
        }
        else if(n == 1 || n == 2){
            return 1; 
        }
        else{
            return fib(n-1) + fib(n-2); //recursive calls for large numbers results in stack overflow.
                                        // time complexity is exponential (2^n)
        }
    }
    
    public static int fibNonRecursive(int n){
        if (n <= 2)
            return 1;
        
        int first = 1;
        int second = 2;
        int nth = 2;
        
        for(int i = 3; i <= n-1; i++){ // time complexity is n
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }
}
