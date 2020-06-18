package introductionToJava.baitaptuluyen.codeinterfacevaabstracclass;

public class Bird  {
    public void show(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        IAnimal a= new IAnimal() {
            @Override
            public void speak() {

            }

            @Override
            public void Eat() {

            }
        };



    }
}
