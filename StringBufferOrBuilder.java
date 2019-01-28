/*
 What is difference between StringBuffer and StringBuilder?
 */
package stringbufferorbuilder;


public class StringBufferOrBuilder {

   
    public static void main(String[] args) {
        
        //String is immutable: state cannot change.
        String s = "hello";
        s += " world"; // new object is created.
        System.out.println(s);
        
        //StringBuffer and StringBuilder are mutable: state can change.    
        StringBuilder sb = new StringBuilder(); //faster than StringBuffer but not thread safe(synchronized)
        
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            sb.append("hello");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
       
        StringBuffer sbuff = new StringBuffer(); //slower but thread safe
        
        long startTimeBuff = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            sbuff.append("hello");
        }
        long endTimeBuff = System.currentTimeMillis();
        System.out.println(endTimeBuff-startTimeBuff);  
    }
    
}
