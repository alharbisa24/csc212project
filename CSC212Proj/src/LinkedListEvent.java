
public class LinkedListEvent <T extends Comparable<Event>> {
    private Node<Event> head;
    private Node<Event> current;

    public LinkedListEvent() {
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
    public void findPrevious() {
        current = current.previous;
    }
    
    public void findNext() {
        current = current.next; 
    }

    public Event retrieve() {
        return current.data;
    }

    public void update(Event data) {
        current.data = data; 
    }

 
    public void insert(Event data) {
        Node<Event> temp = new Node<Event>(data); 
        if (empty()) 
            current = head = temp; 

        else { 
           
            Node<Event> current = head;
            Node<Event> tail = null;
            while (current != null && current.data.getEvent_title().compareTo(data.getEvent_title()) < 0) {
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