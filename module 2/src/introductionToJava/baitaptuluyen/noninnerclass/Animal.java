package introductionToJava.baitaptuluyen.noninnerclass;

public class Animal {
    //inner class
    public class Dog{
        private int age;
        public void show(){
            System.out.println("hello animal");
        }
    }
    public class Husky extends Dog{

    }

    public static void main(String[] args) {
        Animal an=new Animal(); //xem class Dog giống như 1 biến instance của animal
        // ko thể kế thừa từ 1 class bên ngoài
        // tức là khi khai báo 1 class bên trong 1 class thì chỉ có scope trong phạm vi class đó thôi
        Animal.Dog dog=an.new Dog();
        dog.show();
    }
}
