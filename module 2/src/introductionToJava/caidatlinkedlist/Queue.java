package introductionToJava.caidatlinkedlist;

import java.util.LinkedList;

public class Queue<E> {
    private LinkedList<E> elements;

    public Queue() {
        elements=new LinkedList<>();
    }
    public void enQueue(E e){
        elements.addLast(e);
    }
    public void deQueue(E e){
        elements.removeFirst();
    }
}
