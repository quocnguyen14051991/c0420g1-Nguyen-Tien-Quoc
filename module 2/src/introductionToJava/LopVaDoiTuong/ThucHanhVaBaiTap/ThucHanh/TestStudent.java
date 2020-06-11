package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.ThucHanh;

public class TestStudent {
    public void change1(Student student) {
        Student student1 = new Student();
        student1.setName("phương");
        student = student1;
    }

    public void change2(Student student) {
        student.setName("No1 dev pro");

    }

    public static void main(String[] args) {
        TestStudent demo= new TestStudent();
        Student student=new Student();
        System.out.println("befor call method 1:"+student.getName());
        demo.change1(student);
        System.out.println("after call method 1:"+student.getName());
        System.out.println("befor call method 2 :"+student.getName());
        demo.change2(student);
        System.out.println("after call method 2:"+student.getName());

    }
}
