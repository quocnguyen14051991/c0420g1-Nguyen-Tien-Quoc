package introductionToJava.abstractvainterface.thuchanh;

import introductionToJava.abstractvainterface.thuchanh.Fruit.Apple;
import introductionToJava.abstractvainterface.thuchanh.Fruit.Fruit;
import introductionToJava.abstractvainterface.thuchanh.Fruit.Orange;
import introductionToJava.abstractvainterface.thuchanh.animal.Animal;
import introductionToJava.abstractvainterface.thuchanh.animal.Chickend;
import introductionToJava.abstractvainterface.thuchanh.animal.Tiger;
import introductionToJava.abstractvainterface.thuchanh.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chickend();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());;

            if (animal instanceof Chickend) {
                Edible edibler = (Chickend) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits=new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for (Fruit element:fruits
             ) {
            System.out.println(element.howToEat());

        }
    }
}
