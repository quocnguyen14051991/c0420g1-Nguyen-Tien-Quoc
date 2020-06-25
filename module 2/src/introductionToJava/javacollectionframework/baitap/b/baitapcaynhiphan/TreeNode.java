package introductionToJava.javacollectionframework.baitap.b.baitapcaynhiphan;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    public TreeNode(E e){
        this.element=e;
        this.left=null;
        this.right=null;
    }
    public void printData(){
        System.out.print(this.element.toString()+" ");
    }

}
