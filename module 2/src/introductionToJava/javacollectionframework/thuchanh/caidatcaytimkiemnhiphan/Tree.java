package introductionToJava.javacollectionframework.thuchanh.caidatcaytimkiemnhiphan;

public interface Tree<E> {
    public void insert(TreeNode<E> t,E e);
    public void inorder();
    public int getSize();


}
