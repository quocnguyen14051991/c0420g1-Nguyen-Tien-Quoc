package introductionToJava.dsadanhsach.baitap.caidatarraylist.arraylist;

public class TestMyArrayList {
    static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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
    }

    public static void main(String[] args) {
        Student student = new Student(1, "'quoc");
        Student student1 = new Student(1, "'quy");
        Student student2 = new Student(1, "'quynh");
        Student student3 = new Student(1, "'quoc");
        Student student4 = new Student(1, "'quoc");
        Student student5 = new Student(1, "'quoc");
        Student student6= new Student(1, "'quoc");

        MyArrayList<Student> studentMyArrayList=new MyArrayList<>();
        studentMyArrayList.add(student);
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
//        studentMyArrayList.clear();
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2).getName());
//        System.out.println(studentMyArrayList.indexOf(student1));
        System.out.println(studentMyArrayList.contains(student3));
        for (int i = 0; i <studentMyArrayList.size() ; i++) {
           Student students= (Student) studentMyArrayList.elements[i];
            System.out.println(students.getId());
            System.out.println(students.getName());
        }


    }
}
