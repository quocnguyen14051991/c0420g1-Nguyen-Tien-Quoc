package introductionToJava.accessmodifier.ThucHah.thuchanhstaticmethod;

public class Student {
    private int rollno;
    private String name;
    private static String collge = "BBDIT";
    public static int count = 0;
    public static int xxx = 0;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        collge = "codeGym";

    }

    public int Count() {
        count++;
//        System.out.println(+count);
        return count;

    }

    public static void dem() {
        System.out.println("connt" + count);
    }

    void display() {
        System.out.println(rollno + " " + name + " " + collge + " " + this.Count());
    }

    public static void main(String[] args) {
        Student.change();
        Student student = new Student(112, "quoc");
        Student student1 = new Student(113, "quy");
        Student student2 = new Student(114, "quang");
        System.out.println(student1.xxx);


        student.display();
        student1.display();
        student2.display();

        System.out.println(Student.count);
    }
}
