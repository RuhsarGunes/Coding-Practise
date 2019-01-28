/*
How to detect a cycle in a linked list?
*/
package cycliclinkedlist;


public class CyclicLinkedList {

    public static void main(String[] args) {
       
        // A->B->C->D->E->C
        LinkedList myList = new LinkedList();
        
        myList.appendToEnd(new Node("A"));
        myList.appendToEnd(new Node("B"));
        Node cycle = new Node("C");
        myList.appendToEnd(cycle);
        myList.appendToEnd(new Node("D"));
        myList.appendToEnd(new Node("E"));
        myList.appendToEnd(cycle);
        
        System.out.println(myList.isCyclic());
  
    }
}
