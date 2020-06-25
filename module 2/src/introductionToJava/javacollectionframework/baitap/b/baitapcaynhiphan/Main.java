package introductionToJava.javacollectionframework.baitap.b.baitapcaynhiphan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cay nhi Phan");
        BST<Integer> bst=new BST<Integer>();
        bst.insertAt(new TreeNode<>(18));
        bst.insertAt(new TreeNode<>(18));
        bst.insertAt(new TreeNode<>(20));
        bst.insertAt(new TreeNode<>(10));
        bst.insertAt(new TreeNode<>(15));
        bst.insertAt(new TreeNode<>(12));
        bst.insertAt(new TreeNode<>(17));
        bst.insertAt(new TreeNode<>(7));
        bst.insertAt(new TreeNode<>(8));
        bst.insertAt(new TreeNode<>(18));
        int i=9;
        TreeNode<Integer> treeNode=bst.search(i);
        if(treeNode==null){
            System.out.println("Ko tim thay ban oi");
        }else {
            System.out.print("Tim Thấy :");
            treeNode.printData();
        }
        System.out.println();
        System.out.println("Print PreOrder");
        bst.PrintPreOrder();
//        System.out.println();
//        System.out.println("Print InOrder");
//        bst.printInOrder();
//        System.out.println();
//        System.out.println("Print PostOrder");
//        bst.printPostOrder();
        bst.delete(10);
        System.out.println();
        bst.PrintPreOrder();
    }
}
