package introductionToJava.thuchanhtrienkhaiqueuesudungdanhsachlienket;

public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){ //add 1 phan tu vao trong hang doi.
        Node temp=new Node(key);// khoi tao 1 node
        if(this.tail==null){
            this.head=this.tail=temp;
            return;
        }
        this.tail.next=temp;
        this.tail=temp;
    }
    public Node dequeue(){ // khi them them vao cuoi xoa se xoa o dau.
        if(this.head==null){
            return null;
        }
        Node temp=this.head;
        this.head=this.head.next;
        if(this.head==null){
            this.tail=null;
        }
        return temp;
    }

    public static void main(String[] args) {
        MyLinkedList queue=new MyLinkedList();
        queue.enqueue(30);
        queue.enqueue(3);
        queue.enqueue(3);
        queue.enqueue(311);
        queue.enqueue(3000);
        System.out.println("Deque item is"+queue.dequeue().key);
    }
}
