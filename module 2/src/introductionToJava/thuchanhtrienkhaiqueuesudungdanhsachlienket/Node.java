package introductionToJava.thuchanhtrienkhaiqueuesudungdanhsachlienket;

public class Node {
    public int key;
    public Node next;

    public Node(int key, Node next) {
        this.key = key;
        this.next = next;
    }
    public Node(int key){
        this.key=key;
        this.next=null;
    }
}
