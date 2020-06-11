package introductionToJava.Baitaptuluyen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
//        List<Student> listStudent=new ArrayList<Student>();
//        listStudent.add(new Student(1,"quoc",18,"da nang"));
//        listStudent.add(new Student(2,"quoc",18,"da nang"));
//        listStudent.add(new Student(4,"quoc",18,"da nang"));
//        listStudent.add(new Student(5,"quoc",18,"da nang"));
//        System.out.println("sort list student by it's name ASC: ");
//        Collections.sort();
//        for (Student student:listStudent
//        ) {
//            System.out.println(student);
//        }

        ArrayList al = new ArrayList();
        al.add(Integer.valueOf(201));
        al.add(Integer.valueOf(21));
        al.add(Integer.valueOf(2));
        al.add(Integer.valueOf(1));
        al.add(Integer.valueOf(101));
        al.add(230);// nó sẽ được convert thành Integer.valueOf(230)

        Collections.sort(al);
        for (Object s:al
             ) {
            System.out.println(s);

        }
    }
}
