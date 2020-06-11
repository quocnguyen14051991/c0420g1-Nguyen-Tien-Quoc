package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.ThucHanh;

public class person {
   private String name;
    private int age;

    public person(String name,int age) {
        this.name = name;
        this.age=age;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  int change(person person1){
        person person2=new person("oh",25);
        person1=person2;
        return person1.getAge();
    }
    public void changeName(person person1){
        person person2=new person("quoc",23);
        person person1x=new person("quoc",15);
        person1=person1x;
    }

    public static void main(String[] args) {
        person person1=new person("q",10);
        person person2=new person("a",12);
        person1.setAge(15);
        person2.setAge(17);
        person1=person2;
//        int change=person1.change(person1);

        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
        person1.changeName(person1);
        person1.change(person1);
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
    }
}


/*package introductionToJava.LopVaDoiTuong.ThucHanhVaBaiTap.ThucHanh;

public class person {
   private String name;
    private int age;

    public person(String name,int age) {
        this.name = name;
        this.age=age;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  int changeAge(person person1){
        person person2=new person("oh",25);
        person1=person2;
        return person1.getAge();
    }
    public void changeName1(person person10){
        person person2=new person("quoc",23);
        person10=person2;
    }
    public void changeName2(person person20){
        person20.setName("xnxx.com");
    }
    public static void main(String[] args) {
        person person1=new person("q",10);
        person person2=new person("a",12);
        person1.setAge(15);
        person2.setAge(17);
        person1=person2;
//        int change=person1.change(person1);

        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person1.changeName1(person1);
        System.out.println(person1.getName());
        person1.changeName2(person1);
        System.out.println(person1.getName());
        person1.changeAge(person1);
        System.out.println(person1.getAge());
    }
}

 */

