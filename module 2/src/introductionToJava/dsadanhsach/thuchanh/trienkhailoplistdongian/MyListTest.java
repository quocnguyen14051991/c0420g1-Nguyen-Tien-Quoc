package introductionToJava.dsadanhsach.thuchanh.trienkhailoplistdongian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger =new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        System.out.println(listInteger.get(1));
        System.out.println(listInteger.get(6));
    }
}
