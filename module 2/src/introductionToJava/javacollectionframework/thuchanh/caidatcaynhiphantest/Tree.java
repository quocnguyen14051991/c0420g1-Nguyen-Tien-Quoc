package introductionToJava.javacollectionframework.thuchanh.caidatcaynhiphantest;

public class Tree<E extends Comparable<E>> extends Node {
    Node<E> root;
    public Tree() {
       root=null;
    }
    public Node<E> insert( Node<E> root,E e){
        if (root == null) {
            Node p=new Node();
            p.element=e;
            p.left=null;
            p.right=null;
            return root=  p;

        }else {
            if(e.compareTo(root.element)>0){
                insert(root.right,e);
            }else if(e.compareTo(root.element)<0){
                insert(root.left,e);
            }
        }
        return this.root;
    }
    public void in(E e){
        insert(root,e);
    }

    public static void main(String[] args) {
        Tree<Integer> e=new Tree<>();
        e.in(3);
        e.in(4);

    }
}
