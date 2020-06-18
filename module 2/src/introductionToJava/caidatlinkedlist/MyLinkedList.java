package introductionToJava.caidatlinkedlist;

import java.util.Scanner;

public class MyLinkedList<E> {
    // khai báo cấu trúc của 1 danh  sách cơ bản có 2 node để quản lý đầu và cuối là pHead và PTail
    private Node<E> pHead;
    private Node<E> pTail;

    public MyLinkedList() {
        pHead = null;
        pTail = null;
    }

    /*
    method add firts linkeds
     */
    public void addFirst(Node<E> node) {
        // có 2 trường hợp
        if (this.pHead == null) {
            this.pHead = this.pTail = node;
        } else {
            node.next = this.pHead;
            // của danh sách
            this.pHead = node;
        }
    }

    /*
    method add last linked
     */
    public void addLast(Node<E> node) {
        if (this.pHead == null) {
            this.pHead = this.pTail = node;
        } else {
            this.pTail.next = node;
            this.pTail = node;
        }
    }

    public void show() {
        // duyệt danh sách bằng cách từ phead đến khi =null thì dừng.
        for (Node k = this.pHead; k != null; k = k.next) {
            System.out.println(k.getData());
        }
    }

    /*
    Method thêm 1 node p sau node q nằm trong danh sách linkedlist
     */
    public void add_P_Last_Q(Node<E> q, Node<E> p) {

        if (q.data == this.pHead.data && this.pHead.next == null) {
            addLast(p);
        } else {
            boolean check = false;
            // neu q có tồn tại
            for (Node k = this.pHead; k != null; k = k.next) {
                if (q.data == k.data) {
                    Node h = new Node(p.data);
                    Node g = k.next;
                    h.next = g;
                    k.next = h;
                    check = true;
                }
            }
            if (check == false) {
                System.out.println("node q không tồn tại trong danh sách liên kết trên");
            }
        }
    }

    /* Thêm node p trước node q trong danh sách liên kết

     */
    public void add_P_Befor_Q(Node<E> p, Node<E> q) {

        if (this.pHead.next == null && this.pHead.data == q.data) {
            addFirst(p);
        } else {
            Node<E> g = null;
            for (Node k = this.pHead; k != null; k = k.next) {
               if (k.data == q.data && this.pHead.data != q.data) {
                    Node h = new Node(p.data);
                    h.next = k;
                    g.next = h;
                } else if (q.data == this.pHead.data) {// neu trong danh sach then head=q thi them vao dau danh sach head=h;// cap nhat
                    Node h = new Node(p.data);
                    addFirst(h);
                }
                g = k;
            }
        }
    }
    public void themvaovitribatky(Node p,int vt){
        //vong lap lay so luong node trong danh sach
        int n=0;
        for(Node k=this.pHead;k!=null;k=k.next){
n++;
        }
        // danh sach dang rong va vi tri can them =1 thi se them vao dau
        if(this.pHead==null||vt==1){
            addFirst(p);
        }else if(vt==n+1){
            addLast(p);
        }else if(vt>n+1){
            System.out.println("ko the them dc");
        } else {
            int dem=0;
            Node g=null;
            for(Node k=this.pHead;k!=null;k=k.next){
                dem++;
                //tim vi tri can them
                if(dem==vt){
                    Node h=new Node(p.data);
                    h.next=k;
                    g.next=h;
                    break;
                }
                g=k;
            }

        }
    }
    public void xoadau(){
        if(this.pHead==null){
            return;
        }
        Node p=this.pHead;
        this.pHead=this.pHead.next;
        p=null;
    }
    public void xoacuoi(){
        if(this.pHead==null){
            return;
        }if(this.pHead.next==null){
            this.xoadau();
            return;
        }
        for(Node k=this.pHead;k!=null;k=k.next){
            if(k.next==this.pTail){
                k.next=null;
                this.pTail=k;
                return;
            }
        }
        }
        public void xoa1nodesaunodeq(Node q){
        for(Node k=this.pHead;k!=null;k=k.next){
            if(k.data==q.data){
                Node g=k.next;
                k.next=g.next;

            }
        }
        }
        public void xoa1nodeo1vitribatky(E x){
        if(this.pHead==null){
            return;
        }
        if(this.pHead.data==x){
            this.xoadau();
            return;
        }
        if(this.pTail.data==x){
            xoacuoi();
            return;
        }
        Node g=null;// node g la node tro den node truoc node can xoa
            for(Node k=this.pHead;k!=null;k=k.next){
                if(k.data==x){
                    g.next=k.next;
                    return;
                }
                g=k;
            }

        }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
//       myLinkedList.addLast(new Node(69));
        myLinkedList.addLast(new Node(1));
        myLinkedList.addLast(new Node(2));
//        myLinkedList.addLast(new Node(1));
//        myLinkedList.addLast(new Node(2));
//        myLinkedList.addLast(new Node(1));
//        myLinkedList.addLast(new Node(1));
//        myLinkedList.addLast(new Node(3));
//        myLinkedList.addLast(new Node(4));
//        System.out.println("Them node q vao sau node Q");
//        System.out.println("nhap vao 1 node Q co trong danh sach de them phia sau");
//        int Q = input.nextInt();
        myLinkedList.show();
        System.out.println("--------");
//        myLinkedList.add_P_Befor_Q(new Node(79), new Node(Q));
//        System.out.println("them node 79 truoc so 1");
//        myLinkedList.show();
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
//        myLinkedList.add_P_Last_Q(new Node<>(Q),new Node<>(79));
//        System.out.println("them node 79 sau so 1:");
//        myLinkedList.show();
//        myLinkedList.themvaovitribatky(new Node(3),5);
//        myLinkedList.xoadau();
//        myLinkedList.show();
//        myLinkedList.xoacuoi();
//        myLinkedList.show();
//        myLinkedList.xoa1nodesaunodeq(new Node(1));
//        myLinkedList.show();
myLinkedList.xoa1nodeo1vitribatky(2);
myLinkedList.show();
    }
}
