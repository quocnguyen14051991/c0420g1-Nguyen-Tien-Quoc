package introductionToJava.javacollectionframework.thuchanh.hashmapvahashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Nam",20,"Dn");
        Student student1=new Student("Quoc",20,"Hn");
        Student student2=new Student("Son",20,"Hcm");
        Student student3=new Student("Quoc",20,"Hn");
        Student student4=new Student("Son",20,"Hcm");
        Map<Integer,Student> studentMap=new HashMap<Integer, Student>();
        studentMap.put(1,student);
        studentMap.put(2,student1);
        studentMap.put(3,student2);
        for (Map.Entry<Integer,Student> studentx:studentMap.entrySet()
             ) {
            System.out.println(studentx.toString());
        }
        System.out.println("............................. set");
        Set<Student> students = new HashSet<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for (Student studentxx:students
             ) {
            System.out.println(studentxx.toString());

        }
    }
}
