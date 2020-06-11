package introductionToJava.abstractvainterface.thuchanh.animal;

import introductionToJava.abstractvainterface.thuchanh.edible.Edible;

public class Chickend extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}


