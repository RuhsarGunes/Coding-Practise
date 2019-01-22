/*
 How to create a custom ArrayList where user specifies if duplicates should be added or not?
 */
package customarraylist;

public class CustomArrayList {

    public static void main(String[] args) {
       
        ArrayListCustom<String> myList = new ArrayListCustom<String>(true);
        
        myList.add("Gunes");
        myList.add("Gunes");
        myList.add("Kahraman");
       
    }
    
}
