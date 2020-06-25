package introductionToJava.javacollectionframework.thuchanh.caidatcaytimkiemnhiphan;

public class TestBST {
    public static void main(String[] args) {
        BTS<Integer> tree=new BTS<>();
     tree.inserta(2);
     tree.inserta(3);
     tree.inserta(4);
        System.out.println("Inorder (sorted): ");
        tree.inorder();

        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
