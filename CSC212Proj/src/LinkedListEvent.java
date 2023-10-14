
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
    public boolean findlast() {
		return current == null;
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

	public boolean search(Event val) {
		if (empty()) {
			return false;
		}
		Node<Event> object = head;
		while ((object != null) && (object.data.compareTo(val) != 0))
			object = object.next;
		if ((object != null) && (object.data.compareTo(val) == 0)) {
			current = object;
			return true;
		}
		return false;
	}
    public void insert(Event data) {
        Node<Event> temp = new Node<Event>(data); 
        if (empty()) 
            current = head = temp; 

        else { 
           
        	findFirst();
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
	public Event remove(Event val) {// remove node
		if (search(val) == false) {
			return null;
		}
		Event data = current.data;
		if (current == head)
			head = head.next;
		else {
			Node<Event> tmp = head;
			while (tmp.next != current)
				tmp = tmp.next;
			tmp.next = current.next;
		}
		if (current.next == null)
			current = head;
		else
			current = current.next;
		return data;

	}
    
     
}