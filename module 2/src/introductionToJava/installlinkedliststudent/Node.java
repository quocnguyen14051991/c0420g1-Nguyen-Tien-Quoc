package introductionToJava.installlinkedliststudent;

public class Node {
    // todo code: 1 node bao gồm data và node next để móc tới node đó.
    private Student student;
    Node next;
    // todo khởi tạo node có data và next sể bằng null để không trỏ tới node khác
    public Node(Student data) {
        this.student = data;
        this.next=null;
    }
    public Node(){

    }
    //todo phương thức show data
    public void showData(){
        System.out.println(this.student.toString());
    }
    public boolean hasValue(int value){
        return this.student.getId()==value;
    }

}
