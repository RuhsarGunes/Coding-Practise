package cycliclinkedlist;

public class LinkedList {

    public Node head;
    
    public LinkedList(){
        head = new Node("head");
    }
    
    public void appendToEnd(Node node){
        Node current = head; //current node is set to begining of the list
        
        //check next node is found
        while(current.next != null){
            current = current.next; // set current node to the next node.
        }
        current.next = node;
    }
    
    public boolean isCyclic(){
        Node slow = head;
        Node fast = head;
        
        while (slow != null && fast != null && 
                slow.next != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast)
                return true;
        }
        return false;
    }
}
