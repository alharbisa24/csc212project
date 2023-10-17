/*************Example***************
CLASS: LinkedList.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
12-10-2023
TEAM:
IT PhoneBook
AUTHORS:
meshari al-harbi , (443102229)
saud al-dossaari (441102913)
Omar al-juwayr (443101386)

***********************************/
public class LinkedList <T extends Comparable<T>>{
    private Node<T> head;
    private Node<T> current;
	public Node<T> previous;

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
		if (empty()) //1
			head = current = new Node(val);// O(1)
		else {//1
			if (head.data.compareTo(val) > 0) {//(1) that conditon to save the alphabet if 
				tmp.next = head;        //1           // if > 0 become before the node 
				head = tmp;           //1               //if == that his place
				                                     // if < become after the node
			} else {//1
				current = head;//1
				while ((current != null) && (current.data.compareTo(val) <= 0)) {// O(n)
					previous = current; //n
					current = current.next;//n
				}
				if (current != null) {//1
					tmp.next = current;//1
					previous.next = tmp;//1
					current = tmp;//1
				} else {//1
					current = previous.next = tmp;//1
				}
			}
		}
		return true;//1
	}
	// 3n + 15 O(n)
	public boolean search(T val) {//1
		if (empty()) {//1
			return false;//1
		}
		Node<T> object = head;//1
		while ((object != null) && (object.data.compareTo(val) != 0)) //2n
			object = object.next; //n
		if ((object != null) && (object.data.compareTo(val) == 0)) { //2
			current = object;//1
			return true;//1
		}
		return false;//1
	}
	//Time complexity of search 3n + 9 O(n)
	
	public T remove(T val) {// remove node
		if (search(val) == false) { //n
			return null;//1
		}
		T data = current.data;//1
		if (current == head)//1
			head = head.next;//1
		else {//1
			Node<T> tmp = head;//1
			while (tmp.next != current)//n
				tmp = tmp.next;//n
			tmp.next = current.next;//n
		}
		if (current.next == null) //1
			current = head;//1
		else//1
			current = current.next;//1
		return data;//1

	}
    
    
    
}