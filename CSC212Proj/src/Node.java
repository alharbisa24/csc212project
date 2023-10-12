
public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> previous;

    public Node() {
    } 

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next, Node<T> previous) {
        this.data = data; 
        this.next = next; 
        this.next = previous; 
    }



}