package introductionToJava.installlinkedliststudent;

public class Student {
    public static int autoid=1;
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.id=autoid++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id"+this.id+"\n"+"Name:"+this.name+" \n"+"Age:"+this.age;
    }
}
