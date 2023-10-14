
public class LinkedList <T extends Comparable<T>>{
    private Node<T> head;
    private Node<T> current;

    public LinkedList() {
        head = current = null; //1
    }

    public boolean empty() {
        return head == null; //1
    }

    public boolean full() {
        return false; //1
    }

    public boolean last() {
        return current.next == null;//1
    }

    public void findFirst() {
        current = head; //1
    }
	public boolean findlast() {
		return current == null;
	}

  
    public void findNext() {
        current = current.next;//1
    }
    public void findPrevious() {
        current = current.previous;//1
    }
    public T retrieve() {
        return current.data; //1
    }

    public void update(T data) {
        current.data = data; //1
    }

 /*
  * 
  * 
  */

	public boolean insert(T val) {// add to the list
		Node<T> tmp = new Node(val);// O(1)
		if (empty())
			head = current = new Node(val);// O(1)
		else {
			if (head.data.compareTo(val) > 0) {// that conditon to save the alphabet if 
				tmp.next = head;                   // if > 0 become before the node 
				head = tmp;                          //if == that his place
				                                     // if < become after the node
			} else {
				current = head;
				while ((current != null) && (current.data.compareTo(val) <= 0)) {// O(n)
					current.previous = current;
					current = current.next;
				}
				if (current != null) {
					tmp.next = current;
					current.previous.next = tmp;
					current = tmp;
				} else {
					current = current.previous.next = tmp;
				}
			}
		}
		return true;
	}
	public boolean search(T val) {
		if (empty()) {
			return false;
		}
		Node<T> object = head;
		while ((object != null) && (object.data.compareTo(val) != 0))
			object = object.next;
		if ((object != null) && (object.data.compareTo(val) == 0)) {
			current = object;
			return true;
		}
		return false;
	}
	public T remove(T val) {// remove node
		if (search(val) == false) {
			return null;
		}
		T data = current.data;
		if (current == head)
			head = head.next;
		else {
			Node<T> tmp = head;
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