package introductionToJava.installlinkedliststudent;

public class LinkedList {
    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //todo method show list in ra danh sách chạy từng node rồi gọi in ra
    public void show() {
        Node currentNode = this.head;
        while (currentNode != null) {
            currentNode.showData();
            currentNode = currentNode.next;
        }
    }
    public Node searchNode(int value){
    Node currentNode =this.head;
    while (currentNode!=null){
        if(currentNode.hasValue(value)){
            return currentNode;
        }
        currentNode=currentNode.next;
    }
    return null;
    }

    //todo method insert 1 node vào đầu list
    public void insertAt(Node node, int position) {
        if (position < 1 || size == 0) {
            node.next = this.head;
            this.head = node;
            if (this.tail == null) {
                this.tail = node;
            }
            this.size++;
            return;
        }
        //todo insert o vị trí sau cùng của list
        if (position >= this.size) {
            if (this.tail != null) {
                this.tail.next = node;
            }
            this.tail = node;// cập nhật lại tail
            if (this.head == null) {// lan dau chua co phan tu nao trong list thi head cung bang node do
                this.head = node;
            }
            this.size++;
            return;
        }
        //todo insert o vi tri bat ky
        Node preNode=null;
        Node currentNode=this.head;
        int counter=0;
        while (counter<position){
            counter++;
            preNode=currentNode;
            currentNode=currentNode.next;
        }
        node.next=currentNode;
        preNode.next=node;
        this.size++;
    }
    public void dellete(int studentId){
        Node preNode=null;
        Node currenNode=this.head;
        int couter=0;
        while (currenNode!=null){
            if(currenNode.hasValue(studentId)){
                //delete
                if(couter==0){
                    //delete firt
                    this.head=this.head.next;
                    if(this.head==null){
                        this.tail=null;
                    }
                }else if(couter==this.size-1){
                    //delete last
                    preNode.next=null;
                    this.tail=preNode;
                }else {
                    // delete mid
                    preNode.next=currenNode.next;
                }
                this.size--;
                return;
            }
            couter++;
            preNode=currenNode;
            currenNode =currenNode.next;
        }

    }
}
