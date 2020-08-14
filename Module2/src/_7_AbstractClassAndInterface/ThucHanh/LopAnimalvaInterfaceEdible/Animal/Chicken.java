package _7_AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.Animal;


import _7_AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}