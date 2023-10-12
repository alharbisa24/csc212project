
public class LinkedList <T extends Comparable<Contact>>{
    private Node<Contact> head;
    private Node<Contact> current;

    public LinkedList() {
        head = current = null;
    }

    public boolean empty() {
        return head == null; 
    }

    public boolean full() {
        return false; 
    }

    public boolean last() {
        return current.next == null;
    }

    public void findFirst() {
        current = head; 
    }

  
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public Contact retrieve() {
        return current.data; 
    }

    public void update(Contact data) {
        current.data = data; 
    }

 
    public void insert(Contact data) {
        Node<Contact> temp = new Node<Contact>(data); 
        if (empty()) 
            current = head = temp; 

        else { 
        	temp.next = current.next;
        	temp.previous = current;
        	if(current.next != null)
        		current.next.previous = temp;
        	current.next = temp;
        	current = temp;
            }
    }
    
    public void remove() {
       if(current == head) {
    head = head.next;
       if(head !=null)
    	   head.previous = null;
       }
       else {
    	   current.previous.next = current.next;
    	   if(current.next != null)
    		   current.next.previous= current.previous;
       }
       if(current.next == null)
    	   current = head;
       else
    	   current = current.next;
       
    }
    
    
    
    
}