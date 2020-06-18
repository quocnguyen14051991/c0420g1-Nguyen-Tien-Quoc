package introductionToJava.baitaptuluyen.sudung.comparator;

import java.util.Comparator;

public class Compara  implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        if(student.getId()>t1.getId()){
            return 1;
        }
        else if(student.getId()<t1.getId()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
