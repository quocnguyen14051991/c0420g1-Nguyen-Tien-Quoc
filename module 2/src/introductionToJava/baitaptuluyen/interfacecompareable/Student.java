package introductionToJava.baitaptuluyen.interfacecompareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student student) {
        return this.age-student.age;
    }

    public static void main(String[] args) {
        List<Student> arrayList=new ArrayList<>();
        Student student1=new Student("quoc",20);
        Student student2=new Student("quoc",21);
        arrayList.add(student1);
        arrayList.add(student2);


    }
}
