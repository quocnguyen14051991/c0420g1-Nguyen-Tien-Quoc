package introductionToJava.javacollectionframework.thuchanh.caidatcaytimkiemnhiphan;

import introductionToJava.caidatlinkedlist.Node;

public class BTS<E extends Comparable<E>> extends AbstractTree<E> {

//    protected TreeNode<E> root;
    protected int size=0;
    public BTS(){

    }
    @Override
    public void insert(TreeNode<E> t, E e) {


    }
public void inserta(E e){

}
    @Override
    public int getSize() {
        return this.size;
    }
    public TreeNode<E> creatNewNode(E e){
        return new TreeNode<>(e);
    }

}
