package introductionToJava.baitaptuluyen.sudungcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(3,"an"));
        list.add(new Student(6,"hiếu"));
        list.add(new Student(3,"hà"));
        list.add(new Student(1,"ngọc"));
        list.add(new Student(8,"chó"));
        System.out.println("truoc khi sap xep theo id");
        for (Student p:list
             ) {
            System.out.println(p.getId()+" "+p.getName());

        }
        System.out.println("sau khi su dung phuong thuc comparTo");
        Collections.sort(list,Student::compareTo);
        for (Student x:list
             ) {
            System.out.println(x.getId());

        }
//        for(Student p:list){
//            System.out.println(p.getId()+p.getName());
//        }
//        System.out.println("sau khi sap xep");
//        Collections.sort(list,Student::compareTo);
//        for(Student p:list){
//            System.out.println(p.getId()+p.getName());
//        }



    }
}
