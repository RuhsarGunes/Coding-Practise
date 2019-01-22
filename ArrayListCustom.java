package customarraylist;

import java.util.ArrayList;
import java.util.HashSet;


//generics allow a type or method to operate on objects of various types while providing compile time type safety.
public class ArrayListCustom<E> extends ArrayList<E>{
    
    public boolean allowDuplicates;
    
    public ArrayListCustom(boolean allowDuplicates){
        this.allowDuplicates = allowDuplicates;
    }
    
    HashSet<Object> mySet = new HashSet<Object>(); //to check for duplicate entry.
    
    public boolean add(E e){
        if(this.allowDuplicates == false && mySet.add(e) == false){
            throw new IllegalArgumentException("no duplicates allowed");
        }
        else if(this.allowDuplicates == true && mySet.add(e) == false){
            super.add(e);
        }
        
        System.out.println(e);
        return allowDuplicates;
    }
}
