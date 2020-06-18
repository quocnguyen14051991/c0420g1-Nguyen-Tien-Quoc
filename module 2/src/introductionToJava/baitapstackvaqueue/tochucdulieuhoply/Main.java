package introductionToJava.baitapstackvaqueue.tochucdulieuhoply;

import javax.management.loading.MLet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Employee> Male=new LinkedList<>();
        Queue<Employee> Female=new LinkedList<>();
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("Quoc","14/05/1991","Male") );
        list.add(new Employee("Quy","14/05/1991","Female") );
        list.add(new Employee("Quan","14/05/1991","Female") );
        list.add(new Employee("Binh","14/05/1991","Male") );
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getGender().equals("Male")){
                Male.add(list.get(i));
            }else if(list.get(i).getGender().equals("Female")){
                Female.add(list.get(i));
            }
        }
        while (!Male.isEmpty()){
            System.out.println(Male.remove().toString());
        }
        while (!Female.isEmpty()){
            System.out.println(Female.remove().toString());
        }


    }
}
