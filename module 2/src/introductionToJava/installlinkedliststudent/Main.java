package introductionToJava.installlinkedliststudent;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAt(new Node(new Student("Quoc", 20)), 3);
        list.insertAt(new Node(new Student("Quang", 20)), 0);
        list.insertAt(new Node(new Student("Quy", 20)), 20);
        list.insertAt(new Node(new Student("phuong", 18)), 2);
        list.dellete(4);
        list.show();
//        int id=200;
//      Node searchNode=list.searchNode(id);
//      if(searchNode!=null){
//          System.out.println("Studen can tim:");
//          searchNode.showData();
//      }else {
//          System.out.println(" ko co trong danh sach");
//      }
//    }

    }
}
