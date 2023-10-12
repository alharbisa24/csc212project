
public class LinkedList <T extends Comparable<Contact>>{
    private Node<Contact> head;
    private Node<Contact> current;
	LinkedListEvent event = new LinkedListEvent();

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
           
            Node<Contact> current = head;
            Node<Contact> tail = null;
            while (current != null && current.data.getContact_name().compareTo(data.getContact_name()) < 0) {
            	tail = current;
                current = current.next;
            }
       
            if (tail == null) {
                temp.next = head;
                head = temp;
            } else {
                temp.next = current;
                tail.next = temp;
            }     
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