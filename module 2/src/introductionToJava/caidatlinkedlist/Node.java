package introductionToJava.caidatlinkedlist;

public class Node<E> {
    public E data;
    public Node<E> next;

    public Node(E data) {
        this.data = data;
        this.next=null;
    }

    public Node<E> getNext() {
        return next;
    }

    public E getData() {
        return data;
    }
}
