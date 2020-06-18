package introductionToJava.linked;

public class Note<E> {
    E element;
    Note<E> next;

    public Note() {
    }
/**/
    public Note(E element) {
        this.element = element;
    }

    public Note(E element, Note<E> next) {
        this.element = element;
        this.next = next;
    }

    public static void main(String[] args) {
        Note<String> head=null;//linked null
        Note<String> tail=null;
      head=new Note<>("hello");
        tail=head;
        System.out.println(head);
        tail.next=new Note<>("Dever");
        tail=tail.next;
        System.out.println(tail);


    }
}
