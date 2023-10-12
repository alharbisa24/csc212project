
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
        	temp = current.next;
        	current.next = new Node<Event> (data);
        	current = current.next;
        	current.next= temp;
            }
    } 
    
    public void remove() {
        if (current == head)
            head = head.next;
        else {
            Node<Event> tmp = head;
            while (tmp.next != current) {
            	tmp = tmp.next;
            }

            tmp.next = current.next;
        }

        if (current.next == null)
            current = head;
        else
            current.next = current.next;
    }

}