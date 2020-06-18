package introductionToJava.baitaptuluyen.sudung.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Compara compara=new Compara();
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(3,"quốc"));
        list.add(new Student(4,"quyên"));
        list.add(new Student(0,"ngọc"));
        list.add(new Student(0,"hà"));
        list.add(new Student(1,"hương"));
        System.out.println("trước khi sắp xếp");
        for (Student student:list
             ) {
            System.out.println(student.getId()+" "+student.getName());

        }
        System.out.println("sau khi sắp xếp");
//        Comparator<Student> studentComparator=new Comparator<Student>() {
//            @Override
//            public int compare(Student student, Student t1) {
//                if(student.getId()>t1.getId()){
//                    return 1;
//                }
//                else if(student.getId()<t1.getId()){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        };
        Collections.sort(list,compara);
        for (Student student:list
             ) {
            System.out.println(student.getId()+" " +student.getName());

        }
    }
}
