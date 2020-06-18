package introductionToJava.baitaptuluyen.sudungcomparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
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
    @Override
    public int compareTo(Student student) {
//     return (this.getName().compareTo(student.getName()));
if(this.getId()>student.getId()){
    return 1;
}else if(this.getId()<student.getId()){
    return -1;
}
else {
    return 0;
}
    }
}
