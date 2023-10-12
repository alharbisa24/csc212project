
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
        	temp = current.next;
        	current.next = new Node<Contact> (data);
        	current = current.next;
        	current.next= temp;
            }
    }
    
    public void remove() {
        if (current == head)
            head = head.next;
        else {
            Node<Contact> tmp = head;
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