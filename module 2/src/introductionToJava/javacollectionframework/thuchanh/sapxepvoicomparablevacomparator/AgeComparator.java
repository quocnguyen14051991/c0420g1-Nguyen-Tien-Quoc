package introductionToJava.javacollectionframework.thuchanh.sapxepvoicomparablevacomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
       if(student.getAge()>t1.getAge()){
           return 1;
       }else if(student.getAge()==t1.getAge()){
           return 0;
       }else {
           return -1;
       }
    }

    public static void main(String[] args) {
        Student student=new Student("Quan",20,"Da Nang");
        Student student1=new Student("Dao",23,"Ha Noi");
        Student student2=new Student("An",18,"Sai Gon");
        List<Student> list=new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        Collections.sort(list);
        for (Student st:list
             ) {
            System.out.println(st.toString());

        }
        AgeComparator ageComparator =new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("so sanh theo do tuoi");
        for (Student st:list
             ) {
            System.out.println(st.toString());

        }

    }
}
